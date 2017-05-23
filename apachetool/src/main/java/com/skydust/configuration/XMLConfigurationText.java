package com.skydust.configuration;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.lang.SystemUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 对xml文件进行各种操作，读取和写入
 * Created by laoliangliang on 2017/5/23.
 */
public class XMLConfigurationText {
    public static void main(String[] args) throws ConfigurationException {
        XMLConfiguration config = new XMLConfiguration(SystemUtils.USER_DIR+"\\apachetool\\src\\main\\webapp\\WEB-INF\\web.xml");
        Document document = config.getDocument();
//        System.out.println(document.getElementById("web-app"));
        System.out.println(document.getNodeName());
        Element documentElement = document.getDocumentElement();
        System.out.println(documentElement.getNodeName());
        System.out.println(documentElement.getChildNodes());
        NodeList elementsByTagName = document.getElementsByTagName("display-name");
        Node item = elementsByTagName.item(0);
        String textContent = item.getTextContent();
        System.out.println(textContent);
        System.out.println(document.getXmlVersion());

    }
}
