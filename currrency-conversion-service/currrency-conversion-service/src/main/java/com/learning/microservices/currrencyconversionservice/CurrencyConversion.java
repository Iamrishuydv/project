package com.learning.microservices.currrencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long Id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;
	private BigDecimal totalCalculateAmount;
	private String environment;
	
	public CurrencyConversion() {
		
	}
	
	public CurrencyConversion(Long id, String from, String to,  BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalCalculateAmount, String environment) {
		super();
		Id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculateAmount = totalCalculateAmount;
		this.environment = environment;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculateAmount() {
		return totalCalculateAmount;
	}

	public void setTotalCalculateAmount(BigDecimal totalCalculateAmount) {
		this.totalCalculateAmount = totalCalculateAmount;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	
	
	
}
