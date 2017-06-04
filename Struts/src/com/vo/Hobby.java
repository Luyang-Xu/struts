package com.vo;

public class Hobby {
	private int hid;
	private int uid;
	private String hdetail;

	public Hobby(int hid, int uid, String hdetail) {
		super();
		this.hid = hid;
		this.uid = uid;
		this.hdetail = hdetail;
	}
	
	public Hobby(int uid, String hdetail) {
		super();
		this.uid = uid;
		this.hdetail = hdetail;
	}

	public Hobby() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getHdetail() {
		return hdetail;
	}

	public void setHdetail(String hdetail) {
		this.hdetail = hdetail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hobby [hid=");
		builder.append(hid);
		builder.append(", uid=");
		builder.append(uid);
		builder.append(", hdetail=");
		builder.append(hdetail);
		builder.append("]");
		return builder.toString();
	}

	
}
