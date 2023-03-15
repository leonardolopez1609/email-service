package com.nelumbo.simulationemail.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class EmailContentDTO {
	@NotNull(message = "El email es requerido")
	@NotBlank(message = "El email es requerido")
	String email;
	@NotNull(message = "La placa es requerida")
	@NotBlank(message = "La placa es requerida")
	String plate;
	@NotNull(message = "El mensaje es requerido")
	@NotBlank(message = "El mensaje es requerido")
	String message;
	@NotNull(message = "El parqueadero es requerido")
	Long idparking;
	
	public void imp (String plate, String message) {
		log.atWarn().log("Correo: Placa:  "+plate + " --- Mensaje: "+message);;
		
		
	}
}
