package com.example.test.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class TestAPI {
	

	private static final Log logger = LogFactory.getLog(TestAPI.class);
	
	
	
	@GetMapping("/test")
	public String testCall() {
	
		
		 logger.info("Entry in to Testcall method ");
		
		 logger.info("Exit from Testcall method");
		 System.out.println("Printing on console");
		 return "Printing the logs on console";
		
	}

}
