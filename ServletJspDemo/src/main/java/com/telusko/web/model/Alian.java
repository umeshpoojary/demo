package com.telusko.web.model;

public class Alian {
	
	private int aid;
	private String name;
	private String tech;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alian [aid=" + aid + ", name=" + name + ", tech=" + tech + "]";
	}
	
	
	
	

}
