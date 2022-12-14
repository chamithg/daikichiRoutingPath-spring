package com.codingdojo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutingPathApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutingPathApplication.class, args);
	}
	@RequestMapping("")
	public String welcome() {
		return "Welcome";
		
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
		
	}
	@RequestMapping("/tomorrow")
	public String tommorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
		
	}
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") String number) {
		int num = Integer.parseInt(number);
		if(num%2 == 0 ) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}	
	}
	@RequestMapping("/travel/{location}")
	public String travel(@PathVariable("location") String location) {
		
		return "Congratulations! You will soon travel to "+location+"!";
	
	}
	
	

}
