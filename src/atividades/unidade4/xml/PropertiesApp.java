package atividades.unidade4.xml;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesApp {

	public static void main(String[] args) throws Exception {
		Properties sites = new Properties();
		sites.loadFromXML(new FileInputStream("/home/fennder/Documents/Workspace/eclipse-workspace/JavaOO/src/atividades/unidade4/xml/sites.xml"));
		System.out.println(sites.getProperty("1"));

	}

}
