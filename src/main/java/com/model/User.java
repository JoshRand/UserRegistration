package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ListIndexBase;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="USER_DATA")
public class User
{
	//@NotEmpty(message = "field can't be empty")
	@Id
	@GeneratedValue
	private int userId;
	@Column(name="USER_NAME")
	private String userName;
	private String email;
	private String password;
	private String city;
	private String department;
	private String country;
	public String getHobbiesList()
	{
		return hobbiesList;
	}
	public void setHobbiesList(String hobbiesList)
	{
		this.hobbiesList = hobbiesList;
	}
	public String getLanguageList()
	{
		return languageList;
	}
	public void setLanguageList(String languageList)
	{
		this.languageList = languageList;
	}
	private String hobbiesList;
	private String languageList;
	@ElementCollection(targetClass=String.class)
	//@ElementCollection
	private List<String> hobbies;
	@ElementCollection(targetClass=String.class)
	//@ElementCollection
	private List<String> languages;
	@Override
	public String toString()
	{
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", city=" + city + ", department=" + department + ", country=" + country + ", hobbies=" + hobbies
				+ ", languages=" + languages + "]";
	}
	@Autowired
	public User()
	{
		super();
		//hobbiesList = hobbies.toString();
		//languageList = languages.toString();
		// TODO Auto-generated constructor stub
	}
	

	public List<String> getHobbies()
	{
		return hobbies;
	}
	public void setHobbies(List<String> hobbies)
	{
		this.hobbies = hobbies;
	}


	public List<String> getLanguages()
	{
		return languages;
	}
	public void setLanguages(List<String> languages)
	{
		this.languages = languages;
	}
	public String getuName()
	{
		return userName;
	}
	public void setuName(String userName)
	{
		this.userName = userName;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	
}
