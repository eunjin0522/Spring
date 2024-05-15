package kh.mclass.test1.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

//xml에서 설정 , 어노테이션 안 씀
public class LoginInterceptor implements HandlerInterceptor {
	//preHandle(): 실제 controller가 실행되기 전에 실행되며 boolean 타입의 값을 return한다.
	//true라면 요청한 handler를 처리하고 false라면 처리하지 않음
	
	//로그인 필터 : 후처리 필요없음
	//postHandler : after처리를 해준다 / response를 하는 도중에 post도 함
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//마지막에 doFilter가 걸려있다
		System.out.println(">>>>>>>>>> preHandle <<<<<<<<<<");
		
		//session 객체를 가져옴
		HttpSession session = request.getSession();
		//login처리를 담당하는 사용자 정보를 담고 있는 객체를 가져옴
		Object obj = session.getAttribute("sslogin");
		
		// login X
		if (obj == null) {
			response.sendRedirect(request.getContextPath()+"/login");
			//더이상 컨트롤러 요청으로 가지 않도록 false 반환
			return false;
		}else {
			//preHandle의 return 은 컨트롤러 요청 url로 가도 되냐 안되냐를 허가하는 의미
			//따라서 true일 경우 컨트롤러 url로 가게 됨
			return true;
		}
	}
}
