package com.music.rec.controller;

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

import com.music.rec.entity.Recommend;
import com.music.rec.service.RecommendService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/recom")
public class RecommendController {
	
	@Autowired
	RecommendService recServ;
	
	@GetMapping("/all")
	List<Recommend> findAllRecommends(){
		return recServ.findAllRecommends();
		
	}
	@PostMapping("/post")
	public String addToFavourite(@RequestBody Recommend rec) {
		return recServ.addToRecommend(rec);
	}
	
	@DeleteMapping("/del/{recId}")
	public String deleteRecommend(@PathVariable("recId")Integer recId){
		return recServ.deleteRecommend(recId);
	
	}

}
