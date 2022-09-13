package com.music.fav.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="favorite")
public class Favorite {
	@Id
	private Integer favId;
	private String songName;
	private String title;
	private String imgUrl;
	private String audio;
	
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Favorite(Integer favId, String songName, String title, String imgUrl, String audio) {
		super();
		this.favId = favId;
		this.songName = songName;
		this.title = title;
		this.imgUrl = imgUrl;
		this.audio = audio;
	}

	public Integer getFavId() {
		return favId;
	}

	public void setFavId(Integer favId) {
		this.favId = favId;
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

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	@Override
	public String toString() {
		return "Favorite [favId=" + favId + ", songName=" + songName + ", title=" + title + ", imgUrl=" + imgUrl
				+ ", audio=" + audio + "]";
	}
	
	
	

}
