import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class StudentGrades {

    public static void main(String[] args) {

        try {
            File xmlFile = new File("/Users/uzielcarranzacharro/IdeaProjects/java_projects/src/main/java/studentGrdes.xml");

//        xml parsers
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);

            document.getDocumentElement().normalize();
//            this gets the wrapping element
            System.out.println("Root Element :" + document.getDocumentElement().getNodeName());

//            get all elements within the Root element
            NodeList nodeList = document.getElementsByTagName("grade");
//            print the number of elements
            System.out.println(nodeList.getLength());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
