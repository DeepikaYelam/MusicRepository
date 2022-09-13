package com.spring.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.music.entity.Song;
@Repository
public interface SongRepository extends JpaRepository<Song,Integer>{

}
