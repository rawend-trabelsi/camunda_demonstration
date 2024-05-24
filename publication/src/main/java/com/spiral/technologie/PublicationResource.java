package com.spiral.technologie;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicationResource {
	private PublicationService service;
	public PublicationResource(PublicationService service) {
		this.service=service;	}
@GetMapping("/demarrer-process")
public ResponseEntity<String> demarrerProcess(){
	service.demarrerProcess();
	return ResponseEntity.ok("le processus a démaré ");
	
}
@GetMapping("/video_editer")
public  ResponseEntity<String> notifierVideoEditer()
{
	service.notifierMessage();
	return ResponseEntity.ok("la notification est bien envoyé  ");
	
}
}
