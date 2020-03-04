package com.example.demo.util;


import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.XmlUtil;
import org.w3c.dom.Document;

import javax.xml.xpath.XPathConstants;
import java.io.File;

/**
 * XMLUtilDemo 的测试
 */
public class XmlUtilDemo {
    public static void main(String[] args) {
      try {
          Document docResult=XmlUtil.readXML("e:\\test\\abc.xml");
//结果为“ok”
          Object value = XmlUtil.getByXPath("//returnsms/taskID", docResult, XPathConstants.STRING);
          System.out.println(value);
//          Document document = XmlUtil.readXML(new ClassPathResource("abc.xml").getStream());
//          System.out.println(document);
      }catch (Exception e){
          e.printStackTrace();
      }
    }
}
