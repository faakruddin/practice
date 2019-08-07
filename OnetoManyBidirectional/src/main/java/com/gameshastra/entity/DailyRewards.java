package com.gameshastra.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "daily_rewards")
public class DailyRewards {
	@Id
	@Column(name = "userid"/* , insertable = false, updatable = false */)
	private int userId;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastlogin")
	private Calendar lastLogin;
	@Column(name = "consecutivelogin")
	private int consecutiveLogin;
	@Column(name = "claimedreward")
	private int claimedRewards;
	@Column(name = "weekcount")
	private int weekCount;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastclaimeddate")
	private Calendar lastClaimedDate;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Calendar getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Calendar lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getConsecutiveLogin() {
		return consecutiveLogin;
	}

	public void setConsecutiveLogin(int consecutiveLogin) {
		this.consecutiveLogin = consecutiveLogin;
	}

	public int getClaimedRewards() {
		return claimedRewards;
	}

	public void setClaimedRewards(int claimedRewards) {
		this.claimedRewards = claimedRewards;
	}

	public int getWeekCount() {
		return weekCount;
	}

	public void setWeekCount(int weekCount) {
		this.weekCount = weekCount;
	}

	public Calendar getLastClaimedDate() {
		return lastClaimedDate;
	}

	public void setLastClaimedDate(Calendar lastClaimedDate) {
		this.lastClaimedDate = lastClaimedDate;
	}

	@Override
	public String toString() {
		return "DailyRewards [userId=" + userId + ", lastLogin=" + lastLogin + ", consecutiveLogin=" + consecutiveLogin
				+ ", claimedRewards=" + claimedRewards + ", weekCount=" + weekCount + ", lastClaimedDate="
				+ lastClaimedDate + "]";
	}

}
