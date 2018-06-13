package com.erik.display_date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

@SpringBootApplication
@Controller
public class DisplayDateApplication {
	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		LocalDateTime this_date = LocalDateTime.now();
		model.addAttribute("date",this_date.toLocalDate());
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		LocalTime this_time = LocalTime.now();
		model.addAttribute("time",this_time);
		return "time.jsp";
	}
	}
