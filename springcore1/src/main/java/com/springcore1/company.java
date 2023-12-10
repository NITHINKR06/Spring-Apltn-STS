package com.springcore1;


public class company

{

public int companyId;

public String companyAddress;

public company(int companyId, String companyAddress) {

super();

this.companyId = companyId;

this.companyAddress = companyAddress;

}

public company(int companyId) {

super();

this.companyId = companyId;

}

public company(String companyAddress) {

super();

this.companyAddress = companyAddress;

}

@Override

public String toString() {

return "company [companyId=" + companyId + ", companyAddress=" + companyAddress + "]";

}

}
