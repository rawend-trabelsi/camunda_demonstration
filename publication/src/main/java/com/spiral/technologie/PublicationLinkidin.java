package com.spiral.technologie;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PublicationLinkidin implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
	System.out.println("publication linkdine réussite");
		
	}

}
