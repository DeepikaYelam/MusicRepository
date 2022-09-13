package com.music.com.controller;

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
import com.music.com.entity.Comment;
import com.music.com.service.CommentServiceImpl;

@WebMvcTest
class CommandControllerTest {

	@MockBean
	CommentServiceImpl servImpl;

	@Autowired
	MockMvc mockMvc;

	ObjectMapper objectMapper=new  ObjectMapper();
	ObjectWriter objectWriter=objectMapper.writer();

	Comment details=new Comment();

	@BeforeEach
	public void setUp(){
		details = new Comment();
	}

	@AfterEach
	public void tearDown(){
		details = null;
	}

	@Test
	void testsaveComment() throws Exception{

		Comment com=new Comment("Keep it up");

		when(servImpl.saveComment(details)).thenReturn(com);

		String val=objectWriter.writeValueAsString(details);

		mockMvc.perform(post("/com/addcom").
				contentType(MediaType.APPLICATION_JSON).
				content(val)).
		andExpect(status().isOk());
	}

	@Test
	void testGetAllCommentDetails() throws Exception {
		List<Comment> com=new LinkedList<>();

		com.add(new Comment("Very Good"));
		com.add(new Comment("Welldone"));
		com.add(new Comment("Keep Going"));
		

		when(servImpl.getAllCDetails()).thenReturn(com);

		mockMvc.perform(get("/com/all")
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
}
