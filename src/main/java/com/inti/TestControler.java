package com.inti;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {
	
	@GetMapping("/bonjour")
	public String test()
	{
		//commentaire
		return "Bonjour Dardour Mohammed";
	}

}
