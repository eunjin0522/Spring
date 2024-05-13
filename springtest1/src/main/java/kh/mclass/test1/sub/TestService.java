package kh.mclass.test1.sub;

import org.springframework.stereotype.Service;

//@Component //이걸 쓰면 controller에서 new로 객채를 선언하지 않아도 호출가능 html의 div 같은 존재
@Service("testService")
public class TestService {
	public String method1() {
		return ">>>service return value<<<";
	}
}
