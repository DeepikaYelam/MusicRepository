package com.music.fav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MusicAppFavoriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicAppFavoriteApplication.class, args);
	}

}
