package com.mvc.controller;


import com.mvc.entity.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Controller
public class FileController {

    /**
     * 使用responseBody响应数据
     *      注意要在mvc注解驱动中配置响应格式
     */
    @RequestMapping("/responseBody")
    @ResponseBody
    public String responseBody(){
        return "这是ResponseBody";
    }


    /**
     * 通过ajax请求响应数据
     */
    @RequestMapping("/responseBodyByAjax")
    @ResponseBody
    public String responseBodyByAjax(String name,String pwd){
        User user=new User(1001,name,pwd);
        System.out.println(user.toString());
        return user.toString();
    }



    /**
     * 下载文件
     */
    @RequestMapping("/testDown")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/static/img/1.png");
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=1.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;//获取ServletContext对象
    }

    /**
     * 上传文件
     */
    @RequestMapping("/testUp")
    public String testUp(MultipartFile photo ,HttpSession session) throws IOException {
        //获取文件名称
        String filename = photo.getOriginalFilename();
        //获取前缀
        String hzName=filename.substring(filename.lastIndexOf("."));
        //获取后缀
        String qzName= UUID.randomUUID().toString();
        filename=qzName+hzName;
        // 获取服务器中的photo目录
        ServletContext servletContext = session.getServletContext();
        String photoPath = servletContext.getRealPath("photo");
        System.out.println(photoPath);
        File file = new File(photoPath);
        //判断是否存在目录
        if (!file.exists()){
            // 不存在，创建文件夹
            file.mkdir();
        }
        // 要保存的完整路径
        String filePath = photoPath + File.separator + filename;

        // 保存文件
        photo.transferTo(new File(filePath));

        return "success";
    }
}
