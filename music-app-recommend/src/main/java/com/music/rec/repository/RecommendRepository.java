package com.music.rec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.music.rec.entity.Recommend;
@Repository
public interface RecommendRepository extends JpaRepository<Recommend,Integer>{

}
