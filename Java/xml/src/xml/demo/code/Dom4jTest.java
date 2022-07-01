package xml.demo.code;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import java.util.List;

public class Dom4jTest {


    @Test
    public void Test1() throws Exception {
        //  窗机创建一个SAXReader读取流，去读取xml文件
        SAXReader reader= new SAXReader();
        // 设置要读取xml文件的path
        Document document = reader.read("src/book.xml");
        // 拿到根元素
        Element root = document.getRootElement();
        // 获取根元素下的所有子节点
        List<Element> list=root.elements();

        // 遍历根元素的所有子节点
        for(Element element:list){
            // 拿到该元素节点的属性
            System.out.println("节点属性："+element.attributeValue("sn"));
            // 拿到该元素节点的所有节点
            System.out.println("所有子节点节点："+element.elements());
        }

    }


    /**
     * 将xml文件的数据，装换为book类
     */
    @Test
    public void Test2() throws Exception {

        // 1.创建SAXReader流，读取xml文件
        SAXReader saxReader = new SAXReader();
        // 2.设置要读取xml文件的路径
        // 注：在junit测试中，相对路径要从模板名开始算
        Document read = saxReader.read("src/book.xml");

        // 3.拿到根节点
        Element rootElement = read.getRootElement();
        // 4.拿到根节点中所有的子节点，并遍历
        // 注：elements()是拿到节点集合，element()是拿到单个节点
        List<Element> elementList = rootElement.elements();
        for (Element element:elementList) {
            // 5.拼装Book类，并输出
            // 拿到element节点sn属性
            String sn = element.attributeValue("sn");
            // element("name")：拿到name节点元素
            // getStringValue()：拿到节点元素的值
            String name = element.element("name").getStringValue();
            String price = element.element("price").getStringValue();
            String author = element.element("author").getStringValue();
            Book book = new Book(sn, name, Double.parseDouble(price), author);
            System.out.println(book);
        }

    }

}
