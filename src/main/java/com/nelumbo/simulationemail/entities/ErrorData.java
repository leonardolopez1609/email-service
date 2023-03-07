package com.nelumbo.simulationemail.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorData {
	 private String message;
}
