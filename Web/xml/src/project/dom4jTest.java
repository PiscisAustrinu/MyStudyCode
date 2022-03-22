package project;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class dom4jTest {
    @Test
    public void tets1() throws Exception {
        //创建一个saxReader输入流，去读取xml配置文件，生成document对象
        SAXReader saxReader = new SAXReader();
        try{
            Document document = saxReader.read("src/books.xml");
            System.out.println(document);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /*
    * 读取books.xml文件生成的book类
    * */
    @Test
    public void test2() throws DocumentException {
        SAXReader reader = new SAXReader();
        //1 读取books.xml文件
        Document document = reader.read("src/books.xml");
        //2 通过Document对象获取根元素
        Element rootElement = document.getRootElement();
        //3 通过根元素上获取book标签对象
        List<Element> books = rootElement.elements("book");
                //element()和elements()都是通过标签名查找子元素
        for (Element book:books){
            //asXML()把标签对象转换为标签字符串
           Element nameElement = book.element("name");
           //getText()方法可以获取标签中的文本内容
           String nameText = nameElement.getText();
           String priceText = book.elementText("price");
           String authorText = book.elementText("author");
           //attributeValue可以获取属性值
           String snValue = book.attributeValue("sn");
           System.out.println(snValue);
           System.out.println(new Book(snValue,nameText,Double.parseDouble(priceText),authorText));
        }
        //4 遍历，处理每个book标签转换为book类
    }
}
