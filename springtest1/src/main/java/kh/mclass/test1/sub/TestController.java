package kh.mclass.test1.sub;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kh.mclass.test1.sub.model.dto.TestDto;

@Controller
public class TestController {
	//private TestService service = new TestService;
	@Autowired
	private TestService testservice;
	
	
	
	  @GetMapping("/login") 
	  public String login( Model model ) {
		  
	  return "home";
	  }
	 
	 
	
	@GetMapping(path="/test1")
	public String method1(
			@RequestParam(defaultValue = "default값이예요", required = false, name="a") String bbb, 
			HttpServletRequest request,
			HttpSession ss,
			HttpServletResponse response) {

		
		System.out.println(bbb);
		System.out.println(request.getParameter("a"));
		request.getSession().setAttribute("b", "session각");
		ss.setAttribute("c", bbb);
		request.setAttribute("serverTime", testservice.method1());
		return "home";//jsp파일명
	}
}
