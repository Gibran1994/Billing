package com.billing.pojo;

import java.util.List;

public class CreateBillPojo {

	private Integer generatedBy;
	private String customerName;
	private List<BillItemList> billItemList;
	
	public Integer getGeneratedBy() {
		return generatedBy;
	}
	public void setGeneratedBy(Integer generatedBy) {
		this.generatedBy = generatedBy;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public List<BillItemList> getBillItemList() {
		return billItemList;
	}
	public void setBillItemList(List<BillItemList> billItemList) {
		this.billItemList = billItemList;
	}
}
