package com.gameshastra.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "inventorytransactions")
public class InventoryTransEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "userid")
	private int userId;
	@Column(name = "inventoryid")
	private int inventoryId;
	@Column(name = "type")
	private String type;
	@Temporal(TemporalType.TIMESTAMP)
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
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Calendar getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Calendar purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	@Override
	public String toString() {
		return "InventoryTrans [id=" + id + ", userId=" + userId + ", inventoryId=" + inventoryId + ", type=" + type
				+ ", purchaseDate=" + purchaseDate + "]";
	}
	
	

}
