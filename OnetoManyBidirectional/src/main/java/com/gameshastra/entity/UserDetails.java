package com.gameshastra.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "user_details")
public class UserDetails {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "facebookid")
	private long facebookId;
	@Column(name = "name")
	private String name;
	@Column(name = "avatar")
	private String avatar;
	@Column(name = "totalmatches")
	private int totalMatches;
	@Column(name = "totalcoins")
	private int totalCoins;
	@Column(name = "totalwins")
	private int totalWins;
	@Column(name = "level")
	private int level;
	@Column(name = "levelmatches")
	private int levelMatches;
	@Column(name = "levelwins")
	private int levelWins;
	@Column(name = "achivementachieved")
	private String achivementsAchieved;
	@Column(name = "questionsanswered")
	private int questionsAnswered;
	@Column(name = "correctanswers")
	private int correctAnswers;
	@Column(name = "prefered_languages")
	private String preferedLanguages;
	@Column(name = "fcmkey")
	private String fcmkey;
	@Column(name = "consecutivewins")
	private int consecutiveWins;
	@Column(name = "xp")
	private int xp;
	@Column(name = "isactive")
	private byte isActive;
	@Column(name = "deactivatedon")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar deactivatedOn;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = DailyRewards.class)
	@JoinColumn(name = "id", referencedColumnName = "userId")
	@Fetch(FetchMode.JOIN)
	private DailyRewards dailyRewards;

	@OneToMany(targetEntity = InventoryTransEntity.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	@Fetch(FetchMode.JOIN)
	private List<InventoryTransEntity> invenEntity;

	public List<InventoryTransEntity> getInvenEntity() {
		return invenEntity;
	}

	public void setInvenEntity(List<InventoryTransEntity> invenEntity) {
		this.invenEntity = invenEntity;
	}

	public byte getIsActive() {
		return isActive;
	}

	public DailyRewards getDailyRewards() {
		return dailyRewards;
	}

	public void setDailyRewards(DailyRewards dailyRewards) {
		this.dailyRewards = dailyRewards;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public Calendar getDeactivatedOn() {
		return deactivatedOn;
	}

	public void setDeactivatedOn(Calendar deactivatedOn) {
		this.deactivatedOn = deactivatedOn;
	}

	public long getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(long facebookId) {
		this.facebookId = facebookId;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getConsecutiveWins() {
		return consecutiveWins;
	}

	public void setConsecutiveWins(int consecutiveWins) {
		this.consecutiveWins = consecutiveWins;
	}

	public String getFcmkey() {
		return fcmkey;
	}

	public void setFcmkey(String fcmkey) {
		this.fcmkey = fcmkey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreferedLanguages() {
		return preferedLanguages;
	}

	public void setPreferedLanguages(String preferedLanguages) {
		this.preferedLanguages = preferedLanguages;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public int getTotalCoins() {
		return totalCoins;
	}

	public void setTotalCoins(int totalCoins) {
		this.totalCoins = totalCoins;
	}

	public int getTotalWins() {
		return totalWins;
	}

	public void setTotalWins(int totalWins) {
		this.totalWins = totalWins;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevelMatches() {
		return levelMatches;
	}

	public void setLevelMatches(int levelMatches) {
		this.levelMatches = levelMatches;
	}

	public int getLevelWins() {
		return levelWins;
	}

	public void setLevelWins(int levelWins) {
		this.levelWins = levelWins;
	}

	public String getAchivementsAchieved() {
		return achivementsAchieved;
	}

	public void setAchivementsAchieved(String achivementsAchieved) {
		this.achivementsAchieved = achivementsAchieved;
	}

	public int getQuestionsAnswered() {
		return questionsAnswered;
	}

	public void setQuestionsAnswered(int questionsAnswered) {
		this.questionsAnswered = questionsAnswered;
	}

	public int getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(int correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", facebookId=" + facebookId + ", name=" + name + ", avatar=" + avatar
				+ ", totalMatches=" + totalMatches + ", totalCoins=" + totalCoins + ", totalWins=" + totalWins
				+ ", level=" + level + ", levelMatches=" + levelMatches + ", levelWins=" + levelWins
				+ ", achivementsAchieved=" + achivementsAchieved + ", questionsAnswered=" + questionsAnswered
				+ ", correctAnswers=" + correctAnswers + ", preferedLanguages=" + preferedLanguages + ", fcmkey="
				+ fcmkey + ", consecutiveWins=" + consecutiveWins + ", xp=" + xp + ", isActive=" + isActive
				+ ", deactivatedOn=" + deactivatedOn + "]";
	}

}
