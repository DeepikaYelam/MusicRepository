package com.music.fav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.music.fav.entity.Favorite;
import com.music.fav.exception.FavoriteDoesNotExistException;
import com.music.fav.service.FavoriteService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/fav")

public class FavoriteController implements FavoriteService{
	
	@Autowired
	FavoriteService favServ;
	
	@GetMapping("/all")  
	public List<Favorite> getAllFavourites() {
		List<Favorite> all=favServ.getAllFavourites();
		return all;
	}
	
	@PostMapping("/post")
	public String addToFavourite(@RequestBody Favorite fav) {
		return favServ.addToFavourite(fav);
	}
	
	@DeleteMapping("/del/{favId}")
	public String deletefav(@PathVariable("favId")Integer favId) throws FavoriteDoesNotExistException {
		return favServ.deletefav(favId);
	
	}

}
