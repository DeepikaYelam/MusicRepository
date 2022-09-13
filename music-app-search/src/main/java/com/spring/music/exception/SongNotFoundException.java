package com.spring.music.exception;

public class SongNotFoundException extends RuntimeException{
	
	public SongNotFoundException() {

    }
	public SongNotFoundException(String message) {

	        super(message);
	   }

}
