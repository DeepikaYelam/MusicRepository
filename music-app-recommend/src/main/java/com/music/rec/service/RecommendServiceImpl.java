package com.music.rec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.rec.entity.Recommend;
import com.music.rec.repository.RecommendRepository;

@Service
public class RecommendServiceImpl implements RecommendService{
	
	@Autowired
	RecommendRepository recRepo;

	@Override
	public Recommend findByUserId(Recommend userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recommend> findAllRecommends() {
		// TODO Auto-generated method stub
		return recRepo.findAll();
	}

	@Override
	public String addToRecommend(Recommend songName) {
		// TODO Auto-generated method stub
		if(recRepo.existsById(songName.getRecId())) {
			return "Already Existed in Recommended List";
		}
		else {
			Recommend rec=recRepo.save(songName);
			return "Successfully Added to Recommended List";
		}
	}

	@Override
	public String deleteRecommend(Integer recId) {
		// TODO Auto-generated method stub
		recRepo.deleteById(recId);
		return "Unrecommended Successfully";
	}

}
