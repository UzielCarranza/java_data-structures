import org.w3c.dom.NodeList;

public class StudentGrades {

    public static void main(String[] args) {

        try {

            XmlParser xmlParser = new XmlParser();
            xmlParser.setPathFile("/Users/uzielcarranzacharro/IdeaProjects/java_projects/src/main/java/studentGrdes.xml");
            xmlParser.setDocu(xmlParser.getDocu());
//            this gets the wrapping element
            System.out.println("Root Element :" + xmlParser.getDocu().getDocumentElement().getNodeName());

//            get all elements within the Root element
            NodeList listOfAllElements = xmlParser.getDocu().getElementsByTagName("grade");
//            call an instance of th eobject
            GetAverage average = new GetAverage();
//            get the average of the xml file grades
            System.out.println(average.getAverage(listOfAllElements));


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
