package com.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by JayRay on 15/02/2017.
 * Info:
 */

public class XMLUtil {

    private static Document getDocument(String fileName) throws Exception {
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dFactory.newDocumentBuilder();
        return builder.parse(new File(fileName));
    }

    private static String getValueByTagName(Document doc, String tagName) {
        NodeList nl = doc.getElementsByTagName(tagName);
        Node node = nl.item(0).getFirstChild();
        return node.getNodeValue().trim();
    }

    public static String getChartType() {
        try {
            Document doc = getDocument("config.xml");
            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            return classNode.getNodeValue().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static LoggerFactory getLoggerFactory() {
        try {
            Document doc = getDocument("config.xml");

            String cName = getValueByTagName(doc, "loggerFactory");

            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            if (obj instanceof LoggerFactory) {
                return (LoggerFactory) obj;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ActorBuilder getActorBuilder() {
        try {
            Document doc = getDocument("config.xml");

            String cName = getValueByTagName(doc, "actorBuilder");

            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            if (obj instanceof ActorBuilder) {
                return (ActorBuilder) obj;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ScoreOperation getOperation() {
        try {
            Document doc = getDocument("config.xml");

            String cName = getValueByTagName(doc, "operationAdapter");

            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            if (obj instanceof ScoreOperation) {
                return (ScoreOperation) obj;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getConfigClass(String name, Class clazz) {
        try {
            Document doc = getDocument("config.xml");

            String cName = getValueByTagName(doc, name);

            Class c = Class.forName(cName);
            Object obj = c.newInstance();

            if (clazz.isAssignableFrom(obj.getClass())) {
                return obj;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
