package com.revature.app;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.classes.JsonClass;
import com.revature.classes.XmlClass;

public class App {
	public static void main(String[] args) {
		//xmlMethod();
		jsonMethod();
	}
	
	public static void jsonMethod() {
		JsonClass json = new JsonClass(), empty;
		json.setI(56);
		json.setB(false);
		json.setS("Hi there!");
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			String s = mapper.writeValueAsString(json);
			System.out.println(s);
			
			empty = mapper.readValue(s, JsonClass.class);
			System.out.println(empty.getI() + " " + empty.getS());
		} catch (Exception e) {
			
		}
	}
	
	public static void xmlMethod() {
		XmlClass xml = new XmlClass(), empty;
		xml.setI(10);
		xml.setS("Hello");
		xml.setB(true);
		
		try {
			JAXBContext context = JAXBContext.newInstance(XmlClass.class);
			
			// Marshalling
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			marshaller.marshal(xml, System.out);
			
			// Unmarshalling
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			empty = (XmlClass) unmarshaller.unmarshal(new StringReader(
					"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n"
					+ "<XmlClass>\r\n"
					+ "    <b>true</b>\r\n"
					+ "    <i>10</i>\r\n"
					+ "    <s>Hello</s>\r\n"
					+ "</XmlClass>"));
			
			System.out.println(empty.getI() + " " + empty.getS());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
