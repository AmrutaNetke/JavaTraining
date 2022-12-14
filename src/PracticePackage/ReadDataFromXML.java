package PracticePackage;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.dom4j.DocumentException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ReadDataFromXML {

	public static void main(String[] args) throws DocumentException {

		try {
			File file = new File(System.getProperty("user.dir") + "\\EmployeeData.xml");
			// an instance of factory that gives a document builder
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// an instance of builder to parse the specified xml file
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("employee");
			// nodeList is not iterable, so we are using for loop
			for (int itr = 0; itr < nodeList.getLength(); itr++) {
				Node node = nodeList.item(itr);
				System.out.println("\nNode Name :" + node.getNodeName());
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					System.out.println(
							"Employee Name: " + eElement.getElementsByTagName("employeeName").item(0).getTextContent());
					System.out.println(
							"Email: " + eElement.getElementsByTagName("employeeEmail").item(0).getTextContent());
					System.out.println("Gender: " + eElement.getElementsByTagName("employeeGender").item(0).getTextContent());
					System.out.println("Salary: " + eElement.getElementsByTagName("employeeSal").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
