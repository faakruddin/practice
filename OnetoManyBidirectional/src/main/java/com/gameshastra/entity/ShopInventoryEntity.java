package com.gameshastra.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

@Data
@Entity
@Table(name = "shopinventory")
public class ShopInventoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;
	@Column(name = "price")
	private int price;
	@Column(name = "qty")
	private int qty;
	@Column(name = "pricetype")
	private String priceType;
	@Column(name = "imageurl")
	private String imageUrl;
	@Column(name = "activedate")
	private Calendar activeDate;

	@OneToMany(targetEntity = AvatarsRankEntity.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "avatarid", referencedColumnName = "id")
	@Fetch(FetchMode.JOIN)
	private List<AvatarsRankEntity> ranks;

	public List<AvatarsRankEntity> getRanks() {
		return ranks;
	}

	public void setRanks(List<AvatarsRankEntity> ranks) {
		this.ranks = ranks;
	}

	@Override
	public String toString() {
		return "ShopInventoryEntity [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", qty="
				+ qty + ", priceType=" + priceType + ", imageUrl=" + imageUrl + ", activeDate=" + activeDate
				+ ", ranks=" + ranks + "]";
	}

}
