package kh.mclass.test1.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.mclass.test1.member.medel.dao.MemberDao;
import kh.mclass.test1.member.medel.dto.MemberRes;

@Service("memberService")
public class MemberService {
	@Autowired
	private MemberDao memberDao;
//	root-context.xml에서 slqSession을 끌고온 것(id가 같아서 끌고 올 수 있었던 것이다)
	
	public List<MemberRes> selectList(){
		return memberDao.selectList();
	}
}
