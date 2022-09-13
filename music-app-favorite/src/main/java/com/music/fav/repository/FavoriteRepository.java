package com.music.fav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.music.fav.entity.Favorite;
@Repository
public interface FavoriteRepository extends JpaRepository<Favorite,Integer>{

}
