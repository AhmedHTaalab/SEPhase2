package com.SE.FawryPhase2.Model.ServiceFactory;

import org.springframework.stereotype.Component;

@Component
public abstract class HandlerFactory {
	public Form createdForm;
	
	public abstract  Form create_Form();
	
		

}
