package com.devmind.spring.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class User {
	private String userName;
	private String email;
	private String phoneNumber;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthday;
}
