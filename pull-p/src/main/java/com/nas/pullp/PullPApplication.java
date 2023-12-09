package com.nas.pullp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PullPApplication {

	public void add() {
		System.out.println("hh");
	}

	public void add2(){
		System.out.println("qq");
	}
	public static void main(String[] args) {
		SpringApplication.run(PullPApplication.class, args);
	}

}
