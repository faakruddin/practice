package com.gameshastra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userbooster")
public class UserBoosters {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "userid")
	private int userId;
	@Column(name = "boosterid")
	private int boosterid;
	@Column(name = "count")
	private int count;
	@Column(name = "used")
	private int used;
//	@Column(name = "facebookid")
//	private long facebookId;

	public int getId() {
		return id;
	}

//	public long getFacebookId() {
//		return facebookId;
//	}
//
//	public void setFacebookId(long facebookId) {
//		this.facebookId = facebookId;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBoosterId() {
		return boosterid;
	}

	public void setBoosterId(int boosterId) {
		this.boosterid = boosterId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}

	@Override
	public String toString() {
		return "UserBoosters [id=" + id + ", userId=" + userId + ", boosterid=" + boosterid + ", count=" + count
				+ ", used=" + used + "]";
	}

	
	
}
