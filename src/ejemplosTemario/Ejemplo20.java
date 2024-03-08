package ejemplosTemario;

import java.io.StringWriter;

import  org.w3c.dom.Document;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class Ejemplo20 {
	
	
	public static void main(String[] args)
	{

	 try {

         // Se vuelca el XML al fichero

         TransformerFactory transFact = TransformerFactory.newInstance();

         // Se añade el sangrado y la cabecera de XML

         transFact.setAttribute("indent-number", new Integer(3));

         Transformer trans = transFact.newTransformer();

         trans.setOutputProperty(OutputKeys.INDENT, "yes");

         trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
         
         Document dom = createYourOwnDocument();

                // Se hace la transformación

                StringWriter sw = new StringWriter();

                StreamResult sr = new StreamResult(sw);

                DOMSource domSource = new DOMSource(dom);

                trans.transform(domSource, sr);

         } catch(Exception ex) {

                ex.printStackTrace();

}
	}

	private static Document createYourOwnDocument() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
