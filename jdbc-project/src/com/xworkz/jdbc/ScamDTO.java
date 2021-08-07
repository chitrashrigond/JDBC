package com.xworkz.jdbc;

import java.io.Serializable;

public class  ScamDTO implements Serializable{

	private int S_ID;
	private String S_NAME;
	private String S_TYPE;
	private int S_YEAR;
	private String S_BY;
	private int S_AMOUNT; 
	private String S_LOCATION;
	private String S_DESCRIPTION;
	
	public ScamDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ScamDTO(int s_ID, String s_NAME, String s_TYPE, int s_YEAR, String s_BY, int s_AMOUNT, String s_LOCATION,
			String s_DESCRIPTION) {
		super();
		S_ID = s_ID;
		S_NAME = s_NAME;
		S_TYPE = s_TYPE;
		S_YEAR = s_YEAR;
		S_BY = s_BY;
		S_AMOUNT = s_AMOUNT;
		S_LOCATION = s_LOCATION;
		S_DESCRIPTION = s_DESCRIPTION;
	}


	@Override
	public String toString() {
		return "ScamDTO [S_ID=" + S_ID + ", S_NAME=" + S_NAME + ", S_TYPE=" + S_TYPE + ", S_YEAR=" + S_YEAR + ", S_BY="
				+ S_BY + ", S_AMOUNT=" + S_AMOUNT + ", S_LOCATION=" + S_LOCATION + ", S_DESCRIPTION=" + S_DESCRIPTION
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + S_AMOUNT;
		result = prime * result + ((S_BY == null) ? 0 : S_BY.hashCode());
		result = prime * result + ((S_DESCRIPTION == null) ? 0 : S_DESCRIPTION.hashCode());
		result = prime * result + S_ID;
		result = prime * result + ((S_LOCATION == null) ? 0 : S_LOCATION.hashCode());
		result = prime * result + ((S_NAME == null) ? 0 : S_NAME.hashCode());
		result = prime * result + ((S_TYPE == null) ? 0 : S_TYPE.hashCode());
		result = prime * result + S_YEAR;
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
		ScamDTO other = (ScamDTO) obj;
		if (S_AMOUNT != other.S_AMOUNT)
			return false;
		if (S_BY == null) {
			if (other.S_BY != null)
				return false;
		} else if (!S_BY.equals(other.S_BY))
			return false;
		if (S_DESCRIPTION == null) {
			if (other.S_DESCRIPTION != null)
				return false;
		} else if (!S_DESCRIPTION.equals(other.S_DESCRIPTION))
			return false;
		if (S_ID != other.S_ID)
			return false;
		if (S_LOCATION == null) {
			if (other.S_LOCATION != null)
				return false;
		} else if (!S_LOCATION.equals(other.S_LOCATION))
			return false;
		if (S_NAME == null) {
			if (other.S_NAME != null)
				return false;
		} else if (!S_NAME.equals(other.S_NAME))
			return false;
		if (S_TYPE == null) {
			if (other.S_TYPE != null)
				return false;
		} else if (!S_TYPE.equals(other.S_TYPE))
			return false;
		if (S_YEAR != other.S_YEAR)
			return false;
		return true;
	}

	public int getS_ID() {
		return S_ID;
	}

	public void setS_ID(int s_ID) {
		S_ID = s_ID;
	}

	public String getS_NAME() {
		return S_NAME;
	}

	public void setS_NAME(String s_NAME) {
		S_NAME = s_NAME;
	}

	public String getS_TYPE() {
		return S_TYPE;
	}

	public void setS_TYPE(String s_TYPE) {
		S_TYPE = s_TYPE;
	}

	public int getS_YEAR() {
		return S_YEAR;
	}

	public void setS_YEAR(int s_YEAR) {
		S_YEAR = s_YEAR;
	}

	public String getS_BY() {
		return S_BY;
	}

	public void setS_BY(String s_BY) {
		S_BY = s_BY;
	}

	public int getS_AMOUNT() {
		return S_AMOUNT;
	}

	public void setS_AMOUNT(int s_AMOUNT) {
		S_AMOUNT = s_AMOUNT;
	}

	public String getS_LOCATION() {
		return S_LOCATION;
	}

	public void setS_LOCATION(String s_LOCATION) {
		S_LOCATION = s_LOCATION;
	}

	public String getS_DESCRIPTION() {
		return S_DESCRIPTION;
	}

	public void setS_DESCRIPTION(String s_DESCRIPTION) {
		S_DESCRIPTION = s_DESCRIPTION;
	}

}
