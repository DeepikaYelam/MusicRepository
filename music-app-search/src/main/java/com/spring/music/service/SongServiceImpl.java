package com.spring.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.music.entity.Song;
import com.spring.music.repository.SongRepository;
@Service
public class SongServiceImpl implements SongService{
	
	@Autowired
	SongRepository songRepo;

	@Override
	public List<Song> findAllSongs() {
		// TODO Auto-generated method stub
		return songRepo.findAll();
	}

	@Override
	public Song findBySongName(String songName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Song findByArtist(String artist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Song findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Song findByCountry(String country) {
		// TODO Auto-generated metFavorites hod stub
		return null;
	}

	@Override
	public Song saveSongName(Song songName) {
		// TODO Auto-generated method stub
		Song saveSong=songRepo.save(songName);
		return saveSong;
	}

	@Override
	public List<Song> postAllSongs(Song songName) {
		// TODO Auto-generated method stub
		return null;
	}

}
