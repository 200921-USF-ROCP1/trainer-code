package com.revature.classes;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="XmlClass")
public class XmlClass {
	private int i;
	private String s;
	private boolean b;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	
	
}
