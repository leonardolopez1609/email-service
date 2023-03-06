package com.nelumbo.simulationemail.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailContent {

	String email;
	String plate;
	String message;
	String parking;
	
}
