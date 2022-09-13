package com.music.fav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.fav.entity.Favorite;
import com.music.fav.exception.FavoriteDoesNotExistException;
import com.music.fav.repository.FavoriteRepository;
@Service
public class FavoriteServiceImpl implements FavoriteService{
	
	@Autowired
	FavoriteRepository favRepo;

	@Override
	public List<Favorite> getAllFavourites() {
		// TODO Auto-generated method stub
		return favRepo.findAll();
	}

	@Override
	public String addToFavourite(Favorite songName) {
		// TODO Auto-generated method stub
		if(favRepo.existsById(songName.getFavId())) {
			return "Already Existed in Favorite List";
		}
		else {
			Favorite fav=favRepo.save(songName);
			return "Successfully Added to Favorite List";
			
		}
		
	}

	@Override
	public String deletefav(Integer favId) throws FavoriteDoesNotExistException {
		// TODO Auto-generated method stub
        favRepo.deleteById(favId);
		
		return "Unfavorited Successfully";
	}

}
