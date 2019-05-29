package com.techelevator.tickets;

import java.math.BigDecimal;

public class Under21Ticket extends Ticket {

	private BigDecimal upCharge;
	
	public Under21Ticket(double price, double upCharge) {
		super(price);
		this.upCharge = new BigDecimal(upCharge);
	}
	
	@Override
	public BigDecimal getFee() {
		return super.getFee().add(upCharge);
	}
	
}
