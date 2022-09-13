package com.music.fav.service;

import java.util.List;

import com.music.fav.entity.Favorite;
import com.music.fav.exception.FavoriteDoesNotExistException;

public interface FavoriteService {
	
	public List<Favorite> getAllFavourites(); //Get Method
	
	public String addToFavourite(Favorite songName);   //Post Method

	public String deletefav(Integer favId) throws FavoriteDoesNotExistException;     //Delete Method

}
