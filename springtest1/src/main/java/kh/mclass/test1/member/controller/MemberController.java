package kh.mclass.test1.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kh.mclass.test1.member.medel.dto.MemberRes;
import kh.mclass.test1.member.model.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	@GetMapping("/member/list")
	public String selectList(
			//Model 생성된 객체를 집어넣어줄것이다 request는 넘 크기 때문이야
			//model과 view는 사실상 한 세트다. 그것을 한 세트로 작성하기 위한 자료형이라고 봐도 될 듯...?
			Model model
			) {
		List<MemberRes> list = memberService.selectList();
		model.addAttribute("memberlist",list);
		return "member/list";
		//views까지 prefix로 설정되어 있기 때문에 그 밑에있는 파일경로만 적어주면 된다.
	}
}
