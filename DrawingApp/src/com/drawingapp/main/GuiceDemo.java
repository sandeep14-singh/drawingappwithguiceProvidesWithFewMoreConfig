package com.drawingapp.main;

import com.drawingapp.module.AppModule;
import com.drawingapp.requests.SquareRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {
	
	private static final String SQAURE_REQ = "SQUARE";	
	
	private static void sendRequest(String sqaureReq) {
		
		if(sqaureReq.equals(SQAURE_REQ)){			
			Injector injector = Guice.createInjector(new AppModule());			
			SquareRequest request = injector.getInstance(SquareRequest.class);
			request.makeRequest();
		}			
		
	}
	
	public static void main(String[] args) {		
		sendRequest(SQAURE_REQ);
	}
}
