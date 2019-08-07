package com.gameshastra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userfavourites")
public class UserFavourities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "userid")
	private int userId;
	@Column(name = "albumid")
	private int albumId;
//	@Column(name = "facebookid")
//	private long facebookId;
//
//	public long getFacebookId() {
//		return facebookId;
//	}
//
//	public void setFacebookId(long facebookId) {
//		this.facebookId = facebookId;
//	}

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

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	@Override
	public String toString() {
		return "UserFavourities [id=" + id + ", userId=" + userId + ", albumId=" + albumId + "]";
	}

	
}
