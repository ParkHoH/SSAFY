package com.xml.sax.weather.real;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WeatherSAXHandler extends DefaultHandler {
	
	List<Weather> list;
	Weather weather;
	String txt;

	public WeatherSAXHandler() {
		list = new ArrayList<>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("data")) {
			weather = new Weather();

		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (weather != null) {
			if (qName.equals("tmEf"))
				weather.setDate(txt);

			else if (qName.equals("wf"))
				weather.setCloud(txt);
			
			else if (qName.equals("tmn"))
				weather.setTemperatureLow(txt);
			
			else if (qName.equals("tmx"))
				weather.setTemperatureHigh(txt);

			else if (qName.equals("data")) { // 책 한 권 정보가 끝남
				list.add(weather);
				txt = null;
			}
		}

	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length).trim();
		txt = str;
	}
	
	public List<Weather> getList() {
		return list;
	}
	
}
