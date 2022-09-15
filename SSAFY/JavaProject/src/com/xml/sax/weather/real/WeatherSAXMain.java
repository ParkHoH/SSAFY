package com.xml.sax.weather.real;

import java.net.URL;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class WeatherSAXMain {

	public static void main(String[] args) {
		String url = "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108";
		SAXParserFactory f = SAXParserFactory.newInstance();
			
		try {
			SAXParser parser = f.newSAXParser();
			WeatherSAXHandler handler = new WeatherSAXHandler();
			parser.parse(new URL(url).openConnection().getInputStream(), handler);

			List<Weather> list = handler.getList();
			for (Weather w : list) {
				System.out.println(w);
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

}
