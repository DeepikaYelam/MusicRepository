package com.music.rec.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recommend")
public class Recommend {
	
	@Id
	private Integer recId;
	private String userId;
	private String imgUrl;
	private String songName;
	private String title;
	private String album;
	public Recommend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recommend(Integer recId, String userId, String imgUrl, String songName, String title, String album) {
		super();
		this.recId = recId;
		this.userId = userId;
		this.imgUrl = imgUrl;
		this.songName = songName;
		this.title = title;
		this.album = album;
	}
	public Integer getRecId() {
		return recId;
	}
	public void setRecId(Integer recId) {
		this.recId = recId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return "Recommend [recId=" + recId + ", userId=" + userId + ", imgUrl=" + imgUrl + ", songName=" + songName
				+ ", title=" + title + ", album=" + album + "]";
	}
	

}
