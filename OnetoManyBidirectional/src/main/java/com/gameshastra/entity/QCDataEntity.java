package com.gameshastra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "qcdata")
public class QCDataEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "gameid")
	private int gameId;
	@Column(name = "questions")
	private String questions;
	@Column(name = "answers")
	private String answers;
	@Column(name = "options")
	private String options;
	@Column(name = "complexityid")
	private int complexityid;
	@Column(name = "songtitle")
	private String songTitle;
	@Column(name = "imageurl")
	private String imageurl;


	public int getId() {
		return id;
	}

	public String getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getComplexityid() {
		return complexityid;
	}

	public void setComplexityid(int complexityid) {
		this.complexityid = complexityid;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "QCDataEntity [questions=" + questions + ", answers=" + answers + ", options=" + options + "]";
	}

}
