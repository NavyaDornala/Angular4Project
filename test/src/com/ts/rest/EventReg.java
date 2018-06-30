package com.ts.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EventReg {
    private String uname;
    private String event;
    private boolean decoration;
    private boolean catering;
    private boolean  photography;
    private boolean venue;
    private String date;
    
	
	public String getUname() {
		return uname;
	}

   public EventReg(String uname, String event, boolean decoration, boolean catering, boolean photography,
			boolean venue, String date) {
		super();
		this.uname = uname;
		this.event = event;
		this.decoration = decoration;
		this.catering = catering;
		this.photography = photography;
		this.venue = venue;
		this.date = date;
	}

@XmlElement
	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getEvent() {
		return event;
	}

	@XmlElement
	public void setEvent(String event) {
		this.event = event;
	}


	public boolean isDecoration() {
		return decoration;
	}

	@XmlElement
	public void setDecoration(boolean decoration) {
		this.decoration = decoration;
	}


	public boolean isCatering() {
		return catering;
	}

	@XmlElement
	public void setCatering(boolean catering) {
		this.catering = catering;
	}


	public boolean isPhotography() {
		return photography;
	}

	@XmlElement
	public void setPhotography(boolean photography) {
		this.photography = photography;
	}


	public boolean isVenue() {
		return venue;
	}

	@XmlElement
	public void setVenue(boolean venue) {
		this.venue = venue;
	}


	public String getDate() {
		return date;
	}

	@XmlElement
	public void setDate(String date) {
		this.date = date;
	}


	public EventReg() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}

