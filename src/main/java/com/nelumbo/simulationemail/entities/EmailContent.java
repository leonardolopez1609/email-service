package com.nelumbo.simulationemail.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailContent {
	@NotNull(message = "El email es requerido")
	@NotBlank(message = "El email es requerido")
	String email;
	@NotNull(message = "La placa es requerida")
	@NotBlank(message = "La placa es requerida")
	String plate;
	@NotNull(message = "El mensaje es requerido")
	@NotBlank(message = "El mensaje es requerido")
	String message;
	@NotNull(message = "El nombre del parqueadero es requerido")
	@NotBlank(message = "El nombre del parqueadero es requerido")
	String parking;
}
