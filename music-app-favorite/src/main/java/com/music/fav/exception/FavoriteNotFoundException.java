package com.music.fav.exception;

public class FavoriteNotFoundException extends RuntimeException{
	
    public FavoriteNotFoundException() {

    }

    public FavoriteNotFoundException(String message) {
        super(message);
    }


}
