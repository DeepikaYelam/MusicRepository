package com.music.fav.controller;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
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
import com.music.fav.entity.Favorite;
import com.music.fav.exception.FavoriteNotFoundException;
import com.music.fav.service.FavoriteServiceImpl;

@WebMvcTest
public class FavoriteControllerTest {
	@MockBean
	FavoriteServiceImpl servImpl;

	@Autowired
	MockMvc mockMvc;

	ObjectMapper objectMapper=new  ObjectMapper();
	ObjectWriter objectWriter=objectMapper.writer();

	Favorite details=new Favorite();

	@BeforeEach
	public void setUp(){
		details = new Favorite();
	}

	@AfterEach
	public void tearDown(){
		details = null;
	}

	@Test
	void testaddToFavourite() throws Exception ,FavoriteNotFoundException{

		Favorite fav=new Favorite(1,"Jaago","Srimanthudu","hhtp","audio.mp3");

		when(servImpl.addToFavourite(details)).thenReturn("Added");

		String val=objectWriter.writeValueAsString(details);

		mockMvc.perform(post("/fav/post").
				contentType(MediaType.APPLICATION_JSON).
				content(val)).
		andExpect(status().isOk());
	}

	@Test
	void testgetAllFavourites() throws Exception {
		List<Favorite> fav=new LinkedList<>();

		fav.add(new Favorite(1,"Meghatodam","Airaa","http","airaa.mp3"));
		fav.add(new Favorite(2,"Iwasrun","Aurora","http","aurora.mp3"));
		fav.add(new Favorite(3,"Naalai","Maan Karate","http","maan.mp3"));
		

		when(servImpl.getAllFavourites()).thenReturn(fav);

		mockMvc.perform(get("/fav/all")
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
	
//	@Test
//	void testdeletefav() throws Exception{
//		Favorite details=new Favorite(2,"Iwasrun","Aurora","http","aurora.mp3");
//
//		when(servImpl.deletefav(2)).thenReturn("User deleted with email "+details.getFavId());
//
//		mockMvc.perform(delete("/fav/del/2").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isAccepted());
//	}


	

}
