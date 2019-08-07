package com.gameshastra.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchasecoins")
public class PurchaseCoins {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "userid")
	private int userId;
	@Column(name = "transactionnumber")
	private int transactionNumber;
	@Column(name = "coinspurchased")
	private int coinsPurchased;
	@Column(name = "paymenttype")
	private String paymentType;
	@Column(name = "purchasedate")
	private Calendar purchaseDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public int getCoinsPurchased() {
		return coinsPurchased;
	}

	public void setCoinsPurchased(int coinsPurchased) {
		this.coinsPurchased = coinsPurchased;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Calendar getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Calendar purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "PurchaseCoins [id=" + id + ", userId=" + userId + ", transactionNumber=" + transactionNumber
				+ ", coinsPurchased=" + coinsPurchased + ", paymentType=" + paymentType + ", purchaseDate="
				+ purchaseDate + "]";
	}

}
