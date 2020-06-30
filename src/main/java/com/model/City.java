package com.model;

public class City
{
	private int cityId;
	private String cityName;
	
	public String getCityName()
	{
		return cityName;
	}
	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}
	public int getCityId()
	{
		return cityId;
	}
	public void setCityId(int cityId)
	{
		this.cityId = cityId;
	}
	public City(int cityId   , String cityName)
	{
		super();
		this.cityName = cityName;
		this.cityId = cityId;
	}
	
	
}
