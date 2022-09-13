package com.music.rec.controller;

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
import com.music.rec.entity.Recommend;
import com.music.rec.service.RecommendServiceImpl;

@WebMvcTest
class RecommendControllerTest {

	@MockBean
	RecommendServiceImpl servImpl;

	@Autowired
	MockMvc mockMvc;

	ObjectMapper objectMapper=new  ObjectMapper();
	ObjectWriter objectWriter=objectMapper.writer();

	Recommend details=new Recommend();

	@BeforeEach
	public void setUp(){
		details = new Recommend();
	}

	@AfterEach
	public void tearDown(){
		details = null;
	}

	@Test
	void testaddToRecommend() throws Exception{

		Recommend rec=new Recommend(1,"abcd@gmail.com","Jaago","Srimanthudu","hhtp","audio.mp3");

		when(servImpl.addToRecommend(details)).thenReturn("Added");

		String val=objectWriter.writeValueAsString(details);

		mockMvc.perform(post("/recom/post").
				contentType(MediaType.APPLICATION_JSON).
				content(val)).
		andExpect(status().isOk());
	}

	@Test
	void testfindAllRecommends() throws Exception {
		List<Recommend> rec=new LinkedList<>();

		rec.add(new Recommend(1,"airaa@gmail.com","Meghatodam","Airaa","http","airaa.mp3"));
		rec.add(new Recommend(2,"aurora@gmail.com","Iwasrun","Aurora","http","aurora.mp3"));
		rec.add(new Recommend(3,"maan@gmail.com","Naalai","Maan Karate","http","maan.mp3"));
		

		when(servImpl.findAllRecommends()).thenReturn(rec);

		mockMvc.perform(get("/recom/all")
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
	
//	@Test
//	void testdeleteRecommend() throws Exception{
//		Recommend details=new Recommend(3,"maan@gmail.com","Naalai","Maan Karate","http","maan.mp3");
//
//		when(servImpl.deleteRecommend(3)).thenReturn("User deleted with email "+details.getRecId());
//
//		mockMvc.perform(delete("/recom/del/3").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isAccepted());
//	}


	

}

