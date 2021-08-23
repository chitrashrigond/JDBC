package com.xworkz.hybernet.soap.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.xworkz.hybernet.soap.constant.Type;
@Entity
@Table (name="soap_details")
public class SoapDTO implements Serializable{
	@Column (name="C_ID")
	@ID
	private int id;
	@Column (name="C_NAME")
	private String name;
	@Column (name="C_TYPE")
	private Type type;
	@Column (name="C_ODOUR")
	private boolean odour;
	@Column( name="C_CERTIFIED")
	private boolean certified;
	@Column( name="C_PRICE")
	private int price;
	
	public SoapDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SoapDTO(int id, String name, Type type, boolean odour, boolean certified, int price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.odour = odour;
		this.certified = certified;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "SoapDTO [id=" + id + ", name=" + name + ", type=" + type + ", odour=" + odour + ", certified="
				+ certified + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (certified ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (odour ? 1231 : 1237);
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoapDTO other = (SoapDTO) obj;
		if (certified != other.certified)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (odour != other.odour)
			return false;
		if (price != other.price)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public boolean isOdour() {
		return odour;
	}
	public void setOdour(boolean odour) {
		this.odour = odour;
	}
	public boolean isCertified() {
		return certified;
	}
	public void setCertified(boolean certified) {
		this.certified = certified;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
