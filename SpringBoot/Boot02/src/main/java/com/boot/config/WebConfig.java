package com.boot.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.boot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 添加一个配置类；
 * 这个类要配置拦截器（interceptor）；
 * 所有要继承WebMvcConfigurer接口
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    /**
     * 添加自定义的拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()) // 添加拦截器
                .addPathPatterns("/**") // 设置拦截范围
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**",
                        "/js/**"); // 设置那些请求不拦截
    }


    /**
     * 添加MyBatis-Plus 的分页连接器
     */
    @Bean
    public MybatisPlusInterceptor paginationInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        paginationInnerInterceptor.setOverflow(true);//设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        paginationInnerInterceptor.setMaxLimit(500L);// 设置查询的最大条数,默认 500 条，-1 不受限制

        mybatisPlusInterceptor.addInnerInterceptor(paginationInnerInterceptor);
        return mybatisPlusInterceptor;

    }

}
