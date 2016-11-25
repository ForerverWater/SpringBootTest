package com.water.ch5;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch522Application {
	
	@Value("${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;
	
	@RequestMapping("/")
	String index(){
		//return "Hello Spring Boot";
		try {
			System.out.println("bookAuthor="+new String(bookAuthor.getBytes("ISO-8859-1"),"utf-8") );
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "书的作者是"+bookAuthor+",书名是="+bookName;
	}
	
	public static void main(String[] args) {
		//SpringApplication.run(Ch522Application.class, args);
		SpringApplication app = new SpringApplication(Ch522Application.class);
		app.setShowBanner(false);
		app.run(args);
	}
}
