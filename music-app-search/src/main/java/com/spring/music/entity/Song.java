package com.spring.music.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="music")
public class Song {
	
	@Id
	private Integer songId;
	private String songName;
	private String title;
	private String artist;
	private String country;
	private String imgUrl;
	private String audio;
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Song(Integer songId, String songName, String title, String artist, String country, String imgUrl,
			String audio) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.imgUrl = imgUrl;
		this.audio = audio;
	}
	
	public Integer getSongId() {
		return songId;
	}
	public void setSongId(Integer songId) {
		this.songId = songId;
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
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
		return "Song [songId=" + songId + ", songName=" + songName + ", title=" + title + ", artist=" + artist
				+ ", country=" + country + ", imgUrl=" + imgUrl + ", audio=" + audio + "]";
	}
	
	

}
