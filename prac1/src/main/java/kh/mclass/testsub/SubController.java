package kh.mclass.testsub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubController {
	
	@Autowired
	private SubService subservice;
	
	@GetMapping("/sublick")
	public String method1() {
		
		
		return "home";
	}
}
