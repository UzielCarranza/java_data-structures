import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class StudentGrades {

    public static void main(String[] args) {

        try {

            XmlParser xmlParser = new XmlParser();
            xmlParser.setDocu(xmlParser.getDocu());
//            this gets the wrapping element
            System.out.println("Root Element :" + xmlParser.getDocu().getDocumentElement().getNodeName());

//            get all elements within the Root element
            NodeList listOfAllElements = xmlParser.getDocu().getElementsByTagName("grade");
//            print the number of elements
            System.out.println(listOfAllElements.getLength());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
