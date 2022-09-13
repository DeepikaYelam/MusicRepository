package com.music.rec.service;

import java.util.List;

import com.music.rec.entity.Recommend;

public interface RecommendService {
	
    Recommend findByUserId(Recommend userId);
	
	List<Recommend> findAllRecommends();
	public String addToRecommend(Recommend songName);

	public String deleteRecommend(Integer recId);

}
