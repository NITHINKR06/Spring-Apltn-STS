package com.springcore1;


public class company

{

public company() {
		super();
		// TODO Auto-generated constructor stub
	}

public int companyId;

public String companyAddress;



public int getCompanyId() {
	return companyId;
}



public void setCompanyId(int companyId) {
	this.companyId = companyId;
}



public String getCompanyAddress() {
	return companyAddress;
}



public void setCompanyAddress(String companyAddress) {
	this.companyAddress = companyAddress;
}



public company(int companyId, String companyAddress) {
	super();
	this.companyId = companyId;
	this.companyAddress = companyAddress;
}



@Override

public String toString() {

return "company [companyId=" + companyId + ", companyAddress=" + companyAddress + "]";

}

}
