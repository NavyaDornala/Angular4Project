package com.ts.rest;

public class Event {
   public String uname;
   public String event;
   public String decoration;
   public String catering;
   public String venue;
   public String photography;
   public String date;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getEvent() {
	return event;
}
public void setEvent(String event) {
	this.event = event;
}
public String getDecoration() {
	return decoration;
}
public void setDecoration(String decoration) {
	this.decoration = decoration;
}
public String getCatering() {
	return catering;
}
public void setCatering(String catering) {
	this.catering = catering;
}
public String getVenue() {
	return venue;
}
public void setVenue(String venue) {
	this.venue = venue;
}
public String getPhotography() {
	return photography;
}
public void setPhotography(String photography) {
	this.photography = photography;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public Event(String uname, String event, String decoration, String catering, String venue, String photography,
		String date) {
	super();
	this.uname = uname;
	this.event = event;
	this.decoration = decoration;
	this.catering = catering;
	this.venue = venue;
	this.photography = photography;
	this.date = date;
}
public Event() {
	super();
	// TODO Auto-generated constructor stub
}
   
}
