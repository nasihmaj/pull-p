package com.nas.pullp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PullPApplication {


	public String roro(){

		return "kk";
	}

	public void add2(){
		System.out.println("qq");
	}
	public static void main(String[] args) {

		SpringApplication.run(PullPApplication.class, args);
	}

}
