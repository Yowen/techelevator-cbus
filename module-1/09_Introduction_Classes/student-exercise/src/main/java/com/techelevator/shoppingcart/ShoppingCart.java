package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems = 0;
	private double totalAmountOwed = 0;
	
	public int getTotalNumberOfItems() {
		
		return totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	public double getAveragePricePerItem() {
		if (totalNumberOfItems == 0) {
			return 0;
		}
		else {
			return totalAmountOwed / totalNumberOfItems;
		}
	}
	
	public void addItems (int numberOfItems, double pricePerItem) {
		totalNumberOfItems += numberOfItems;
		totalAmountOwed += numberOfItems * pricePerItem;
	}
	
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0;
	}
}
