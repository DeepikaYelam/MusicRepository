package com.spring.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.music.entity.Song;
import com.spring.music.service.SongServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/song")
public class SongController {
	
	@Autowired
	SongServiceImpl songServ;
	
	@GetMapping("/songs")
	public List<Song> findAllSongs() {
		List<Song> all=songServ.findAllSongs();
		return all;
	}
	
	@PostMapping("/songName")
	public Song saveSongName(@RequestBody Song song) {
		return songServ.saveSongName(song);
	}

}
