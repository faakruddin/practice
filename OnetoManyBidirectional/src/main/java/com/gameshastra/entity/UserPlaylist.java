package com.gameshastra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userplaylist")
public class UserPlaylist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "userid")
	private int userid;
	@Column(name = "usedcount")
	private int usedcount;
	@Column(name = "albumid")
	private int albumid;
	@Column(name = "weeklycount")
	private int weeklyCount;

	public int getWeeklyCount() {
		return weeklyCount;
	}

	public void setWeeklyCount(int weeklyCount) {
		this.weeklyCount = weeklyCount;
	}

	public int getAlbumid() {
		return albumid;
	}

	public void setAlbumid(int albumid) {
		this.albumid = albumid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getUsedcount() {
		return usedcount;
	}

	public void setUsedcount(int usedcount) {
		this.usedcount = usedcount;
	}

	@Override
	public String toString() {
		return "UserPlaylist [id=" + id + ", userid=" + userid + ", usedcount=" + usedcount + ", albumid=" + albumid
				+ ", weeklyCount=" + weeklyCount + "]";
	}

}
