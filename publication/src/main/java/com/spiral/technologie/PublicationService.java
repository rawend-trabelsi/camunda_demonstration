package com.spiral.technologie;

import org.camunda.bpm.engine.ProcessEngine;

import org.springframework.stereotype.Service;
@Service
public class PublicationService {
    // Votre code ici
private ProcessEngine processEngine;
	
	public PublicationService(ProcessEngine processEngine) {
		
		this.processEngine = processEngine;
	}

	public void demarrerProcess() {
		
		processEngine.getRuntimeService()
		.startProcessInstanceByMessage("NouvelleIdee", "pub-1");
	}

	public void notifierMessage() {
		// TODO Auto-generated method stub
		processEngine.getRuntimeService()
		.correlateMessage("VedioEditee", "pub-1");
	}
	

}
