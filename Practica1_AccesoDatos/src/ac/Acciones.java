package ac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Acciones {

	public void crear() {

		Element personas = new Element("personas");
		Document doc = new Document(personas);

		Element persona = new Element("persona");
		personas.addContent(persona);

		Element nombre = new Element("nombre");
		nombre.setText("Juan Alberto");
		persona.addContent(nombre);

		Element apellido = new Element("apellido");
		apellido.setText("Garcia");
		persona.addContent(apellido);

		Element edad = new Element("edad");
		edad.setText("28");
		persona.addContent(edad);

		Element altura = new Element("altura");
		altura.setText("1.83");
		persona.addContent(altura);

		Element foto = new Element("foto");
		foto.setText(
				"https://lh3.googleusercontent.com/-0Wa7kboTHnc/YC_p1ZxRlaI/AAAAAAAAPuw/fqtjhATtShYHClCq0l-8SpVIwYikK_UyQCLcBGAsYHQ/image.png");
		persona.addContent(foto);

		XMLOutputter xml = new XMLOutputter();		
		xml.setFormat(Format.getPrettyFormat());
		try {
			xml.output(doc, new FileWriter("personas.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void añadir() {
		
        try {
        	SAXBuilder builder = new SAXBuilder();
			Document document = builder.build(new File("personas.xml"));
		} catch (JDOMException | IOException e ) {
				e.printStackTrace();
		} 
	}

}
