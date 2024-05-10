package kh.mclass.test1.sub;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	//private TestService service = new TestService;
	@Autowired
	private TestService service;
	//new로 객체를 선언하지 않고 에노테이션으로 호출
	
	//@RequestMapping(method = RequestMethod.GET, path="/test1")
	@GetMapping("/test1")
	public String method1(String a, 
			HttpServletRequest request,
			HttpSession ss,
			HttpServletResponse response) {
		System.out.println(a);
		System.out.println(request.getParameter("a"));
		request.getSession().setAttribute("b", "session각");
		ss.setAttribute("c", a);
		request.setAttribute("serverTime", service.method1());
		return "home";//jsp파일명
	}
}
