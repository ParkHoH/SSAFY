package com.xml.sax.weather.real;

public class Weather {
	private String date;
	private String temperatureLow;
	private String temperatureHigh;
	private String cloud;
	
	public Weather() {}

	public Weather(String date, String temperatureLow, String temperatureHigh, String cloud) {
		super();
		this.date = date;
		this.temperatureLow = temperatureLow;
		this.temperatureHigh = temperatureHigh;
		this.cloud = cloud;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTemperatureLow() {
		return temperatureLow;
	}

	public void setTemperatureLow(String temperatureLow) {
		this.temperatureLow = temperatureLow;
	}

	public String getTemperatureHigh() {
		return temperatureHigh;
	}

	public void setTemperatureHigh(String temperatureHigh) {
		this.temperatureHigh = temperatureHigh;
	}

	public String getCloud() {
		return cloud;
	}

	public void setCloud(String cloud) {
		this.cloud = cloud;
	}

	@Override
	public String toString() {
		return "날짜:   " + date + "시  온도:   " + temperatureLow + " ~" + temperatureHigh + "도   " + "구름양:   " + cloud;
	}
	

}
