package com.example.demo;

public class SSLC {

	private int Tamil;
	private int English;
	private int Maths;
	private int Science;
	private int Socialscience;
	private int highestMark = Integer.MIN_VALUE;
	private int lowestMark = Integer.MAX_VALUE;
	private int Total_mark;
	private float Percentage;
	
	public float getPercentage() {
		return Percentage;
	}
	public void setPercentage(float percentage) {
		Percentage = percentage;
	}
	public int getTotal_mark() {
		return Total_mark;
	}
	public void setTotal_mark(int total_mark) {
		Total_mark = total_mark;
	}
	public int getTamil() {
		return Tamil;
	}
	public void setTamil(int tamil) {
		Tamil = tamil;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getSocialscience() {
		return Socialscience;
	}
	public void setSocialscience(int socialscience) {
		Socialscience = socialscience;
	}
	public int getHighestMark() {
		return highestMark;
	}
	public void setHighestMark(int highestMark) {
		this.highestMark = highestMark;
	}
	public int getLowestMark() {
		return lowestMark;
	}
	public void setLowestMark(int lowestMark) {
		this.lowestMark = lowestMark;
	}
	
}
