package com.duanjunyu.entity;

public class Move {
	private Integer mid;
	private String mname;
	private String name;
	private Integer price;
	private String uptime;
	private String longtime;
	private String mtype;
	private String year;
	private String address;
	private String type;
	
	private String tname;

	@Override
	public String toString() {
		return "Move [mid=" + mid + ", mname=" + mname + ", name=" + name + ", price=" + price + ", uptime=" + uptime
				+ ", longtime=" + longtime + ", mtype=" + mtype + ", year=" + year + ", address=" + address + ", type="
				+ type + ", tname=" + tname + "]";
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public String getLongtime() {
		return longtime;
	}

	public void setLongtime(String longtime) {
		this.longtime = longtime;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Move(Integer mid, String mname, String name, Integer price, String uptime, String longtime, String mtype,
			String year, String address, String type, String tname) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.name = name;
		this.price = price;
		this.uptime = uptime;
		this.longtime = longtime;
		this.mtype = mtype;
		this.year = year;
		this.address = address;
		this.type = type;
		this.tname = tname;
	}

	public Move() {
		super();
	}

	
}
