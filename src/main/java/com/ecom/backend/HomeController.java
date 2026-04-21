package com.ecom.backend;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	
	/*
	 * When you return object → Serialization happens When you send JSON (POST) →
	 * Deserialization happens Serialization → Java → JSON Deserialization → JSON →
	 * Java
	 */
	
	@RequestMapping("/test")
	@ResponseBody
	public HashMap<String,String> test() {
		HashMap<String,String> ob = new HashMap<>();
		ob.put("StudentName", "vicky");
		ob.put("StudentClass", "X");
		ob.put("StudentRollNo", "10");
		System.out.println("This is for the testing");
		return ob;
	}

	
}
