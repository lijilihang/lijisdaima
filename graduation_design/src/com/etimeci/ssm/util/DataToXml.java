package com.etimeci.ssm.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * Created by liji on 2018/1/22.
 */
public class DataToXml {

    public void selectTestXml(Integer id) {

        SAXReader reader = new SAXReader();

        SAXReader reader1 = new SAXReader();
        try {
            Document document = reader.read(new File("D:\\xml\\students.xml"));

            System.out.println(document.asXML());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    // 查询出xml内容

    public List<Map<String, String>> selsctXmlContent(String str) {
        List<Map<String, String>> list = new ArrayList();

        try {

            SAXReader reader = new SAXReader();
            String xmlStr = str;
            Document document = DocumentHelper.parseText(xmlStr);
            //Document document = reader.read(new File(s));
            // 1.获得根元素
            Element root = document.getRootElement();

            // 得到二级目录的值
            DataToXml tx = new DataToXml();
            String nodeName2 = tx.getElementName(root).get(0);
            // System.out.println(nodeName2);
            // 2.迭代根元素下的所有名叫student的子元素
            for (Iterator<Element> it = root.elementIterator(nodeName2); it.hasNext();) {
                Map<String, String> map = new HashedMap();
                Element student = it.next();
                // String studentName=student.getName();

                // Iterator<Node> studentele=student.nodeIterator();
                // while (studentele.hasNext()){
                //
                // Node sa=studentele.next();
                //
                // if(sa instanceof Element){
                // String s2=sa.getName();
                // System.out.println(s2);
                // }
                //
                // }

                ArrayList<String> nodeName3 = tx.getElementName(student);
                for (int i = 0; i < nodeName3.size(); i++) {
                    String text = student.elementText(nodeName3.get(i));
                    map.put(nodeName3.get(i), text);
                }

                // String eleName=student.getName();
                // String student.getName();
                // 3.获得student元素的id属性名
                Iterator<Attribute> listArrribute = student.attributes().iterator();
                while (listArrribute.hasNext()) {
                    Attribute attribute = listArrribute.next();
                    String attributeName = attribute.getName();
                    String number = student.attributeValue(attributeName);
                    map.put(attributeName, number);
                }
                // String number = student.attributeValue("number");
                // 4.student子元素的内容(name age sex)
                // String name = student.elementText("name");
                // String age = student.elementText("age");
                // String sex = student.elementText("sex");
                // map.put("name",name);
                // map.put("age",age);
                // map.put("sex",sex);
                list.add(map);

                // System.out.println("当前学生的学号是"+number+",姓名是:"+name+",年龄是:"+age+",性别是"+sex+"");
            }
            System.out.println(list.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    // 得到子节点名字

    public ArrayList<String> getElementName(Element element) {
        ArrayList<String> list = new ArrayList();
        Iterator<Node> elementIterator = element.nodeIterator();
        while (elementIterator.hasNext()) {
            Node elementNode = elementIterator.next();
            if (elementNode instanceof Element) {
                String s = elementNode.getName();

                list.add(s);

            }

        }

        return list;
    }
    // 增加xml元素内容

    public String insertXmlContent(List<Map<String, String>> list, String entry, String path) {
        boolean re = false;
        String xmlString = "";
        // 只要key含有id字段，就取出来
        String keySet = "";
        String valueSet = "";
        for (Map.Entry<String, String> entry1 : list.get(0).entrySet()) {
            String key = entry1.getKey();
            String value = entry1.getValue();
            for (int j = 0; j < key.length() - 1; j++) {
                String key1 = key.substring(j, j + 2);
                if (key1.equals("id")) {
                    keySet = key;
                    valueSet = value;

                }
            }
        }

        SAXReader reader = new SAXReader();
        try {
            //Document document = reader.read(new File(path));

            String xmlStr = "<question></question> ";
            Document document = DocumentHelper.parseText(xmlStr);

            // 1 获得根元素
            Element root = document.getRootElement();
            // 判断ID是否重复，不允许插入id相同的元素
            // Element root2=root.element(entry);
            // System.out.println(root2+"1111");
            boolean bl = false;
            Iterator<Element> it = root.elementIterator(entry);
            while (it.hasNext()) {
                Element student = it.next();
                // 3.获得student元素的number属性
                String id1 = student.attributeValue(keySet);
                if (valueSet.equals(id1)) {
                    bl = true;
                }

            }

            if (!bl) {
                for (int i = 0; i<list.size(); i++) {




                // 3 添加name age sex 子元素并添加子元素中的文本
                int index = 1;
                for (Map.Entry<String, String> entry2 : list.get(i).entrySet()) {

                    if (!(entry2.getKey().equals(keySet))) {
                        Element studentEle = root.addElement(entry).addAttribute("id", String.valueOf(index));
                        studentEle.addElement("value").addText(entry2.getKey());
                        studentEle.addElement("score").addText(entry2.getValue());
                        index++;
                    }
                }
                }
                xmlString = document.asXML();
                System.out.println(xmlString);
                // 4 将document对象写到文件中.
                // 创建格式化器
                OutputFormat format = OutputFormat.createPrettyPrint();
                //format.setEncoding("UTF-8");
                // 创建写入器
                // XMLWriter writer = new XMLWriter(new
                // FileWriter("src/students_copy.xml"),format);
                XMLWriter writer = new XMLWriter(new FileOutputStream(path), format);
                // 写入
                writer.write(document);
                // 关闭资源
                writer.close();
                re = true;

            } else {
                re = false;
                System.out.println("插入失败！");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return xmlString;
    }

    public Boolean deleteXmlContent(String path, String entry, String id) {
        boolean ref = false;
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(new File(path));
            // 1 获得根元素
            Element root = document.getRootElement();
            // 使用xpath找到我们需要元素
            // 定义xpath
            // Iterator<Attribute>
            // listArrribute=student.attributes().iterator();
            // while(listArrribute.hasNext()){
            // Attribute attribute=listArrribute.next();
            // String attributeName=attribute.getName();
            // String number = student.attributeValue(attributeName);
            // map.put(attributeName,number);
            // }
            // TestXml tx=new TestXmlImpl();
            // String nodeName2=tx.getElementName(root).get(0);
            // //System.out.println(nodeName2);
            // //2.迭代根元素下的所有名叫student的子元素
            // for(Iterator<Element> it = root.elementIterator(nodeName2);
            // it.hasNext();){

            Node apath = document.selectSingleNode(root.getName() + "/" + entry);// 查找该节点是否存在
            if (apath != null) {

                String attributeName = root.element(entry).attribute(0).getName();
                DataToXml tx = new DataToXml();
                // String nodeName2=tx.getElementName(root).get(0);
                String xpath = "//" + entry + "[@" + attributeName + "='" + id + "']";
                // System.out.println(xpath);
                // String xpath = "//student[@id='itcast_0001']";
                Element student = (Element) document.selectSingleNode(xpath);// 查找该节点是否存在
                if (student != null) {
                    // 删除
                    student.getParent().remove(student);
                    // 回写
                    XMLWriter writer = new XMLWriter(new FileOutputStream(path), OutputFormat.createPrettyPrint());
                    writer.write(document);
                    writer.close();
                    ref = true;
                    System.out.println("删除成功");
                } else {
                    System.out.println("删除失败");
                    ref = false;
                }
            } else {
                System.out.println("删除失败");
                ref = false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ref;
    }

    public Boolean updateXmlContent(String path, String entry, String id, Map<String, Object> map) {
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(new File(path));
            // 1.定义xpath表达式
            // String xpath ="//student[@number='itcast_0001']";
            Element root = document.getRootElement();
            String attributeName = root.element(entry).attribute(0).getName();
            String xpath = "//" + entry + "[@" + attributeName + "='" + id + "']";
            // 2.使用xpath查找
            Element studentEle = (Element) document.selectSingleNode(xpath);

            // Node
            // apath=document.selectSingleNode(root.getName()+"/"+entry);//查找该节点是否存在
            // 3.修改student元素的子元素的name ,age .sex内容

            if (studentEle != null) {

                // System.out.println(map.get("id"));
                for (Map.Entry<String, Object> entry1 : map.entrySet()) {
                    boolean gg = true;
                    String key1 = entry1.getKey();
                    for (int j = 0; j < key1.length() - 1; j++) {
                        String key2 = key1.substring(j, j + 2);
                        if (key2.equals("id")) {
                            gg = false;

                        }
                    }
                    // System.out.println(id);
                    if (gg) {
                        String key = entry1.getKey();
                        String value = String.valueOf(entry1.getValue());
                        String df = root.getName() + "/" + entry + "/" + key;
                        String aaa = document.selectSingleNode(root.getName() + "/" + entry + "/" + key).getName();
                        // System.out.println(aaa+"--------");//问题
                        studentEle.element(aaa).setText(value);// 问题
                    }

                }

                // studentEle.element("age").setText("16");
                // studentEle.element("sex").setText("female");
                // 回写
                XMLWriter writer = new XMLWriter(new FileOutputStream(path), OutputFormat.createPrettyPrint());
                writer.write(document);
                writer.close();
            } else {
                System.out.println("ID不存在，修改失败！");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
