package com.example.demo.mb2;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Attach 
{
	private int num;
	private int pnum;
	private String fname;
	private float fsize;
	private String contentType;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public float getFsize() {
		return fsize;
	}
	public void setFsize(float fsize) {
		this.fsize = fsize;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
}
