// The model code in the MVC model

package com.pcsglobal.web.model;

public class Allien 
{
	private int aid;
	private String aname;
	private String tech;
	/**
	 * @return the aid
	 */
	public int getAid() {
		return aid;
	}
	/**
	 * @param aid the aid to set
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}
	/**
	 * @return the aname
	 */
	public String getAname() {
		return aname;
	}
	/**
	 * @param aname the aname to set
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}
	/**
	 * @return the tech
	 */
	public String getTech() {
		return tech;
	}
	/**
	 * @param tech the tech to set
	 */
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "Allien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	
}
