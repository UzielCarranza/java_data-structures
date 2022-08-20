import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlParser {

    //    fields

//    file location

    File xmlFile;
    //        xml parsers
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
    Document docu;

    //    constructor
    public XmlParser() throws ParserConfigurationException {
    }

    public File pathFile() {
        return xmlFile;
    }

    public void setPathFile(String location) {
        this.xmlFile = new File(location);
    }

    public Document getDocu() {
        return docu;
    }

    public void setDocu(Document document) throws IOException, SAXException {
        this.docu = documentBuilder.parse(xmlFile);
    }

    public void normalizeDocument() {
        getDocu().getDocumentElement().normalize();
    }
}
