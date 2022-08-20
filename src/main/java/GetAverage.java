import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GetAverage {
    //    fields
    int sum = 0;
    int grade = 0;
    int average = 0;
    int highGrade = 0;
    int lowGrade = 0;
    //    this will hold an element within the root element
    Node node;

    public GetAverage() {
    }


    public int getAverage(NodeList nodeList) {

//        iterate over the root element to find all child elements
        for (int i = 0; i < nodeList.getLength(); i++) {
//            gets all elements child elements within the root element of the xml file
            node = nodeList.item(i);
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
        return average = sum / nodeList.getLength();
    }
}
