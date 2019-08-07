package com.gameshastra.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

@Data
@Entity
@Table(name = "avatar_ranks")
public class AvatarsRankEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rank;

	@ManyToOne(targetEntity = ShopInventoryEntity.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "avatarid", referencedColumnName = "id")
	@Fetch(FetchMode.JOIN)
	private ShopInventoryEntity shopInventory;

	@Override
	public String toString() {
		return "AvatarsRankEntity [id=" + id + ", rank=" + rank + "]";
	}
	
	

}
