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
@Table(name = "qcdetails")
public class QuickChallengeDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gameid")
	private int gameid;
	@Column(name = "player1")
	private int player1;
	@Column(name = "player2")
	private int player2;
	@Column(name = "result")
	private String result;
	@Column(name = "album")
	private int album;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "p1date")
	private Calendar p1date;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "p2date")
	private Calendar p2date;
	@Column(name = "p1ansstats")
	private String p1AnsStats;
	@Column(name = "p2ansstats")
	private String p2AnsStats;
	@Column(name = "status")
	private String status;
	@Column(name = "expirytime")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar expiryTime;
	@Column(name = "lastremindedat")
	private Calendar lastRemindedAt;
	@Column(name = "p1score")
	private int p1score;
	@Column(name = "p2score")
	private int p2score;
	@Column(name = "p1usedbooster")
	private String p1UsedBoosters;
	@Column(name = "p2usedbooster")
	private String p2UsedBoosters;

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public String getP1UsedBoosters() {
		return p1UsedBoosters;
	}

	public void setP1UsedBoosters(String p1UsedBoosters) {
		this.p1UsedBoosters = p1UsedBoosters;
	}

	public String getP2UsedBoosters() {
		return p2UsedBoosters;
	}

	public void setP2UsedBoosters(String p2UsedBoosters) {
		this.p2UsedBoosters = p2UsedBoosters;
	}

	public int getP1score() {
		return p1score;
	}

	public void setP1score(int p1score) {
		this.p1score = p1score;
	}

	public int getP2score() {
		return p2score;
	}

	public void setP2score(int p2score) {
		this.p2score = p2score;
	}

	public int getPlayer1() {
		return player1;
	}

	public void setPlayer1(int player1) {
		this.player1 = player1;
	}

	public int getPlayer2() {
		return player2;
	}

	public void setPlayer2(int player2) {
		this.player2 = player2;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getAlbum() {
		return album;
	}

	public void setAlbum(int album) {
		this.album = album;
	}

	public Calendar getP1date() {
		return p1date;
	}

	public void setP1date(Calendar p1date) {
		this.p1date = p1date;
	}

	public Calendar getP2date() {
		return p2date;
	}

	public void setP2date(Calendar p2date) {
		this.p2date = p2date;
	}

	public String getP1AnsStats() {
		return p1AnsStats;
	}

	public void setP1AnsStats(String p1AnsStats) {
		this.p1AnsStats = p1AnsStats;
	}

	public String getP2AnsStats() {
		return p2AnsStats;
	}

	public void setP2AnsStats(String p2AnsStats) {
		this.p2AnsStats = p2AnsStats;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Calendar getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(Calendar expiryTime) {
		this.expiryTime = expiryTime;
	}

	public Calendar getLastRemindedAt() {
		return lastRemindedAt;
	}

	public void setLastRemindedAt(Calendar lastRemindedAt) {
		this.lastRemindedAt = lastRemindedAt;
	}

	@Override
	public String toString() {
		return "QuickChallengeDetailsEntity [gameId=" + gameid + ", player1=" + player1 + ", player2=" + player2
				+ ", result=" + result + ", album=" + album + ", p1date=" + p1date + ", p2date=" + p2date
				+ ", p1AnsStats=" + p1AnsStats + ", p2AnsStats=" + p2AnsStats + ", status=" + status + ", ExpiryTime="
				+ expiryTime + ", lastRemindedAt=" + lastRemindedAt + "]";
	}

}
