package ac;

import java.awt.Image;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Acciones {

	// metodo para resetear el xml

	public void reset() {

		// creo los elementos del xml

		Element personas = new Element("personas");
		Document doc = new Document(personas);

		Element persona = new Element("persona");
		personas.addContent(persona);

		Element nombre = new Element("nombre");
		nombre.setText("placeholder");
		persona.addContent(nombre);

		Element apellido = new Element("apellido");
		apellido.setText("placeholder");
		persona.addContent(apellido);

		Element edad = new Element("edad");
		edad.setText("0");
		persona.addContent(edad);

		Element altura = new Element("altura");
		altura.setText("0");
		persona.addContent(altura);

		Element foto = new Element("foto");
		foto.setText("placeholder");
		persona.addContent(foto);

		// machaco el xml con la información nueva

		XMLOutputter xml = new XMLOutputter();
		xml.setFormat(Format.getPrettyFormat());
		try {
			xml.output(doc, new FileWriter("personas.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// varios metodos para añadir nodos a los xml

	public void añadir(String a, String b, int c, double d, String f) {

		try {

			// leer y hacer un jdom document

			SAXBuilder builder = new SAXBuilder();
			Document document = builder.build(new File("personas.xml"));

			// conseguir el root

			Element root = document.getRootElement();

			// crear una nueva persona

			Element persona = new Element("persona");

			// agregarle los atributos

			Element nombre = new Element("nombre");
			nombre.addContent(a);
			persona.addContent(nombre);

			Element apellido = new Element("apellido");
			apellido.addContent(b);
			persona.addContent(apellido);

			Element edad = new Element("edad");
			edad.addContent(String.valueOf(c));
			persona.addContent(edad);

			Element altura = new Element("altura");
			altura.addContent(String.valueOf(d));
			persona.addContent(altura);

			Element foto = new Element("foto");
			foto.addContent(f);
			persona.addContent(foto);

			// añadirlo al documento

			root.addContent(persona);
			FileWriter writer = new FileWriter("personas.xml");
			XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
			outputter.output(document, writer);
			writer.close();

		} catch (JDOMException | IOException e) {
			e.printStackTrace();
		}

	}

	private void añadirSalvado(String a, String b, int c, double d, String f) {

		try {

			// leer y hacer un jdom document

			SAXBuilder builder = new SAXBuilder();
			Document document = builder.build(new File("recuperacion.xml"));

			// conseguir el root

			Element root = document.getRootElement();

			// crear una nueva persona

			Element persona = new Element("persona");

			// agregarle los atributos

			Element nombre = new Element("nombre");
			nombre.addContent(a);
			persona.addContent(nombre);

			Element apellido = new Element("apellido");
			apellido.addContent(b);
			persona.addContent(apellido);

			Element edad = new Element("edad");
			edad.addContent(String.valueOf(c));
			persona.addContent(edad);

			Element altura = new Element("altura");
			altura.addContent(String.valueOf(d));
			persona.addContent(altura);

			Element foto = new Element("foto");
			foto.addContent(f);
			persona.addContent(foto);

			root.addContent(persona);
			FileWriter writer = new FileWriter("recuperacion.xml");
			XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
			outputter.output(document, writer);
			writer.close();

		} catch (JDOMException | IOException e) {
			e.printStackTrace();
		}

	}

	public void añadir(String a, String b, int c, double d) {

		try {

			// leer y hacer un jdom document

			SAXBuilder builder = new SAXBuilder();
			Document document = builder.build(new File("personas.xml"));

			// conseguir el root

			Element root = document.getRootElement();

			// crear una nueva persona

			Element persona = new Element("persona");

			// agregarle los atributos

			Element nombre = new Element("nombre");
			nombre.addContent(a);
			persona.addContent(nombre);

			Element apellido = new Element("apellido");
			apellido.addContent(b);
			persona.addContent(apellido);

			Element edad = new Element("edad");
			edad.addContent(String.valueOf(c));
			persona.addContent(edad);

			Element altura = new Element("altura");
			altura.addContent(String.valueOf(d));
			persona.addContent(altura);

			Element foto = new Element("foto");
			foto.addContent("sin foto");
			persona.addContent(foto);

			root.addContent(persona);
			FileWriter writer = new FileWriter("personas.xml");
			XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
			outputter.output(document, writer);
			writer.close();

		} catch (JDOMException | IOException e) {
			e.printStackTrace();
		}

	}

	// metodo para modificar campos del xml

	public void modificar(String a, String b) {
		// leo el xml
		try {

			Scanner sc = new Scanner(System.in);
			SAXBuilder builder = new SAXBuilder();
			Document document = builder.build(new File("personas.xml"));

			Element root = document.getRootElement();

			List<Element> ppl = root.getChildren();
			// recorro la lista donde estan todos los elementos
			for (int i = 0; i < ppl.size(); i++) {
				Element p = ppl.get(i);

				// comparo si coincide con lo metido como parametros

				if (p.getChildText("nombre").equals(a) && p.getChildText("apellido").equals(b)) {
					System.out.println(
							"es usted " + p.getChildText("nombre") + " " + p.getChildText("apellido") + " ? (s/n)");
					char real = sc.next().toLowerCase().charAt(0);
					if (real == 's') {

						// pido por teclado el campo a cambiar y el valor y luego lo cambio y machaco el
						// xml con la info nueva
						System.out.println("que campo le gustaria cambiar?");
						String campo = sc.next().toLowerCase();
						System.out.println("cual es el nuevo valor que desea ponerle? ");
						String valor = sc.next();

						p.getChild(campo).setText(valor);

						XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
						outputter.output(document, new FileWriter("personas.xml"));

					}
				}

			}

		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// metodo para borrar nodos

	public void borrar(String a, String b) {
		try {
			Scanner sc = new Scanner(System.in);
			SAXBuilder builder = new SAXBuilder();
			SAXBuilder builder2 = new SAXBuilder();
			Document document = builder.build(new File("personas.xml"));
			Document document2 = builder2.build(new File("recuperacion.xml"));
			XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
			Element root = document.getRootElement();
			Element salvado = document2.getRootElement();
			List<Element> ppl = root.getChildren();

			for (int i = 0; i < ppl.size(); i++) {
				Element p = ppl.get(i);
				if (p.getChildText("nombre").equals(a) && p.getChildText("apellido").equals(b)) {
					System.out.println("esta seguro de que quiere borrar " + p.getChildText("nombre") + " "
							+ p.getChildText("apellido") + " ? (s/n)");
					char real = sc.next().toLowerCase().charAt(0);
					if (real == 's') {
						añadirSalvado(p.getChildText("nombre"), p.getChildText("apellido"),
								Integer.parseInt(p.getChildText("edad")), Double.parseDouble(p.getChildText("altura")),
								p.getChildText("foto"));

						root.getChildren().remove(i);

						outputter.output(document, new FileWriter("personas.xml"));
						System.out.println("hecho!");
					}
				}

			}

		} catch (JDOMException | IOException e) {

			e.printStackTrace();
		}
	}

	// metodo para recuperar el ultimo usuario borrado

	public void recuperar() {
		try {

			SAXBuilder builder = new SAXBuilder();

			Document document = builder.build(new File("recuperacion.xml"));

			XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
			Element root = document.getRootElement();

			List<Element> ppl = root.getChildren();

			Element p = ppl.get((ppl.size() - 1));

			añadir(p.getChildText("nombre"), p.getChildText("nombre"), Integer.parseInt(p.getChildText("edad")),
					Double.parseDouble(p.getChildText("altura")), p.getChildText("foto"));

			root.getChildren().remove((ppl.size() - 1));

			outputter.output(document, new FileWriter("recuperacion.xml"));

		} catch (JDOMException | IOException e) {

			e.printStackTrace();
		}
	}

	// metodo para leer la imagen

	public void imagen(String f) {
		// creo una variable de la clase imagen
		Image imagen = null;

		try {

			// creo una variable de la clase url

			URL url = new URL(f);
			// leemos la url y almacenamos la imagen en la variable
			imagen = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("URL de la imagen no encontrado");
		}
		// creo el jframe y todo lo necesario y lo hago visible
		JFrame frame = new JFrame();

		frame.setSize(500, 500);

		JLabel label = new JLabel(new ImageIcon(imagen));
		frame.add(label);
		frame.setVisible(true);
	}

// metodo para rellenar un arrayList con todos los usuarios dentro del xml con objetos de la clase Persona
	public ArrayList Objetizar() {
		ArrayList<Persona> gente = new ArrayList();
		SAXBuilder builder = new SAXBuilder();
		Document document;
		try {
			document = builder.build(new File("personas.xml"));
			Element root = document.getRootElement();

			List<Element> ppl = root.getChildren();

			for (int i = 0; i < ppl.size(); i++) {
				Element p = ppl.get(i);
				int age = Integer.parseInt(p.getChildText("edad"));
				double height = Double.parseDouble(p.getChildText("altura"));
				String name = p.getChildText("nombre");
				String surname = p.getChildText("apellido");
				String photo = p.getChildText("foto");

				Persona per = new Persona(name, surname, age, height, photo);

				gente.add(per);

			}

		} catch (JDOMException | IOException e) {

			e.printStackTrace();
		}
		return gente;
	}
}
