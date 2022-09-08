<%--
  Created by IntelliJ IDEA.
  Date: 8/20/22
  Time: 00:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%@ page import="org.w3c.dom.NodeList" %>
<%@ page import="javax.xml.parsers.DocumentBuilderFactory" %>
<%@ page import="javax.xml.parsers.DocumentBuilder" %>
<%@ page import="org.w3c.dom.Document" %>
<%@ page import="java.io.File" %>
<%@ page import="org.w3c.dom.Node" %>

<%
    try {

//        read from xml file
        File xmlFile = new File("/Users/uzielcarranzacharro/IdeaProjects/java_projects/src/main/java/studentGrdes.xml");

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(xmlFile);

        //            get all elements within the Root element
        NodeList listOfAllElements = document.getElementsByTagName("grade");

        int sum = 0;
        int grade = 0;
        int average = 0;

        Node node = listOfAllElements.item(0);

        int highGrade = Integer.parseInt(node.getTextContent());
        int lowGrade = Integer.parseInt(node.getTextContent());

//        iterate over the root element to find all child elements
        for (int i = 0; i < listOfAllElements.getLength(); i++) {
//            gets all elements child elements within the root element of the xml file
            node = listOfAllElements.item(i);
//            converts the value of every element
            grade = Integer.parseInt(node.getTextContent());

// adds all grades
            sum += grade;
//            get low grade
            if (grade < lowGrade) {
                lowGrade = grade;
            }
            if (grade > highGrade) {
                highGrade = grade;
            }
        }
        average = sum / listOfAllElements.getLength();

%>
<form>
    <label> average of class
        <input type="text" value="<%=average%>">
    </label>

    <label>Highest Grade
        <input type="text" value="<%=highGrade%>">
    </label>
    <label>Lowest Grade
        <input type="text" value="<%=lowGrade%>">
    </label>

</form>

<%

    } catch (Exception e) {
        System.out.println(e);
    }
%>


</body>
</html>
