package kh.mclass.test1.sub;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kh.mclass.test1.sub.model.dto.TestDto;

@Controller
public class TestController {
	//private TestService service = new TestService;
	@Autowired
	private TestService testservice;
	@Autowired
	private TestDto testDto;
	//new로 객체를 선언하지 않고 에노테이션으로 호출
	
	//@RequestMapping(method = RequestMethod.GET, path="/test1")
	@GetMapping("/test1")
	public String method1(
			@RequestParam(defaultValue = "default값이예요", required = false, name="a") String bbb, 
			HttpServletRequest request,
			HttpSession ss,
			HttpServletResponse response) {
		System.out.println("여기서 testDto 빈 확인하기");
		System.out.println(testDto);
		System.out.println(bbb);
		System.out.println(request.getParameter("a"));
		request.getSession().setAttribute("b", "session각");
		ss.setAttribute("c", bbb);
		request.setAttribute("serverTime", testservice.method1());
		return "home";//jsp파일명
	}
}
