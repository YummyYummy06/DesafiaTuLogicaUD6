package ejemplosTemario;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class Ejemplo21 extends DefaultHandler {
	
	
	

	       private XMLReader reader;

	       public void LectorXML_SAX() {

	              try {

	                    reader = XMLReaderFactory.createXMLReader();

	                    reader.setContentHandler(this);

	                    reader.setErrorHandler(this);

	              } catch (SAXException e) {

	                    e.printStackTrace();

	              }

	       }

	}


