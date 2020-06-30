package com.model;

public class Department
{
	private int departmentId;
	private String departmentName;
	public int getCityId()
	{
		return cityId;
	}
	public void setCityId(int cityId)
	{
		this.cityId = cityId;
	}
	private int cityId;
	
	public int getDepartmentId()
	{
		return departmentId;
	}
	public void setDepartmentId(int countryId)
	{
		this.departmentId = countryId;
	}
	public String getDepartmentName()
	{
		return departmentName;
	}
	public void setDepartmentName(String departmentName)
	{
		this.departmentName = departmentName;
	}
	public Department(int departmentId, String departmentName)
	{
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		
	}
	
	
}
