package com.corona.prevention.kit.admin.model;

public class AdminModel {
	
	private int id;
	private String pname;
	private int pcost;
	private String pdesc;
	
	private int userid;
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserpname() {
		return userpname;
	}

	public void setUserpname(String userpname) {
		this.userpname = userpname;
	}

	public String getUserpemail() {
		return userpemail;
	}

	public void setUserpemail(String userpemail) {
		this.userpemail = userpemail;
	}

	public int getUserpcontact() {
		return userpcontact;
	}

	public void setUserpcontact(int userpcontact) {
		this.userpcontact = userpcontact;
	}

	public int getUsertotalAmount() {
		return usertotalAmount;
	}

	public void setUsertotalAmount(int usertotalAmount) {
		this.usertotalAmount = usertotalAmount;
	}

	public String getUsserdeliveryAddress() {
		return usserdeliveryAddress;
	}

	public void setUsserdeliveryAddress(String usserdeliveryAddress) {
		this.usserdeliveryAddress = usserdeliveryAddress;
	}

	public String getUserorderDate() {
		return userorderDate;
	}

	public void setUserorderDate(String userorderDate) {
		this.userorderDate = userorderDate;
	}

	public boolean isUserorderFinalized() {
		return userorderFinalized;
	}

	public void setUserorderFinalized(boolean userorderFinalized) {
		this.userorderFinalized = userorderFinalized;
	}
	private String userpname;
	public AdminModel(int userid, String userpname, String userpemail, int userpcontact, int usertotalAmount,
			String usserdeliveryAddress, String userorderDate, boolean userorderFinalized) {
		super();
		this.userid = userid;
		this.userpname = userpname;
		this.userpemail = userpemail;
		this.userpcontact = userpcontact;
		this.usertotalAmount = usertotalAmount;
		this.usserdeliveryAddress = usserdeliveryAddress;
		this.userorderDate = userorderDate;
		this.userorderFinalized = userorderFinalized;
	}
	
	private String userpemail;
	private int userpcontact;
	private int usertotalAmount;
	private String usserdeliveryAddress;
	private String userorderDate;
	private boolean userorderFinalized;
	
	public AdminModel() {}
	
	public AdminModel(int id, String pname, int pcost, String pdesc) {
		
		this.id = id;
		this.pname = pname;
		this.pcost = pcost;
		this.pdesc = pdesc;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

}
