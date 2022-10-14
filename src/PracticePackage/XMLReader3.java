package PracticePackage;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.dom4j.DocumentException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader3 {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Object[][] obj= null;
		try {
			File file = new File(System.getProperty("user.dir") + "\\EmployeeData.xml");
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("employee");
			
			for (int itr = 0; itr < nodeList.getLength(); itr++) {
				Node node = nodeList.item(itr);
				System.out.println("\nNode Name :" + node.getNodeName());
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					String name = eElement.getElementsByTagName("employeeName").item(0).getTextContent();
					String email = eElement.getElementsByTagName("employeeEmail").item(0).getTextContent();
					String gender = eElement.getElementsByTagName("employeeGender").item(0).getTextContent();
					String salary = eElement.getElementsByTagName("employeeSal").item(0).getTextContent();
					obj[itr][0]=name;
					obj[itr][1]=email;
					obj[itr][2]=gender;
					obj[itr][3]=salary;
				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
