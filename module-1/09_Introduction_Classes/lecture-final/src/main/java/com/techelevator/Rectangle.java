package com.techelevator;

public class Rectangle {
	
	public int height;
	public int width;
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = Math.abs(height);
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
}
