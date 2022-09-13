package com.spring.music.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.LinkedList;
import java.util.List;
import javax.ws.rs.core.MediaType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.spring.music.entity.Song;
import com.spring.music.exception.SongNotFoundException;
import com.spring.music.service.SongServiceImpl;


@WebMvcTest
class MusicControllerTest {

	@MockBean
	SongServiceImpl servImpl;

	@Autowired
	MockMvc mockMvc;

	ObjectMapper objectMapper=new  ObjectMapper();
	ObjectWriter objectWriter=objectMapper.writer();

	Song details=new Song();

	@BeforeEach
	public void setUp(){
		details = new Song();
	}

	@AfterEach
	public void tearDown(){
		details = null;
	}

	@Test
	void testsaveSongName() throws Exception ,SongNotFoundException{

		Song song=new Song(1,"Jaago","Srimanthudu","Mahesh Babu","hhtp","India","audio.mp3");

		when(servImpl.saveSongName(details)).thenReturn(song);

		String val=objectWriter.writeValueAsString(details);

		mockMvc.perform(post("/song/songName").
				contentType(MediaType.APPLICATION_JSON).
				content(val)).
		andExpect(status().isOk());
	}

	@Test
	void testfindAllSongs() throws Exception {
		List<Song> song=new LinkedList<>();

		song.add(new Song(1,"Meghatodam","Airaa","Nayanatara","http","India","airaa.mp3"));
		song.add(new Song(2,"Iwasrun","Aurora","Magnus","http","Canada","aurora.mp3"));
		song.add(new Song(3,"Naalai","Maan Karate","Siva Karthikeyan","http","India","maan.mp3"));
		

		when(servImpl.findAllSongs()).thenReturn(song);

		mockMvc.perform(get("/song/songs")
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}

	

}
