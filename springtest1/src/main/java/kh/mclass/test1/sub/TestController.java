package kh.mclass.test1.sub;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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
	@Qualifier(value = "testDto2") //value를 넣어줘야함(그렇지 않으면 오류발생) 아니면 autowired를 사용하고 xml에서 지정한 id를 이름으로 지정해주면 된다
	private TestDto testDto;
	//spring에선 new로 객체를 선언하지 않고 에노테이션으로 호출
	
	//@Value("t1") //t1에 value지정가능 // 특정상황에서 특정 value값을 꺼내보고 싶을 때 사용되는 어노테이션
	
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
