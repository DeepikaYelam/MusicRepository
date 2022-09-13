package com.spring.music.service;

import java.util.List;

import com.spring.music.entity.Song;

public interface SongService {
	public List<Song> findAllSongs();
	public Song findBySongName(String songName);
	public Song findByArtist(String artist);
	public Song findByTitle(String title);
	public Song findByCountry(String country);
	public Song saveSongName(Song songName);//Post Method
	public List<Song> postAllSongs(Song songName);

}
