package kh.mclass.test1.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kh.mclass.test1.member.medel.dao.MemberDao;
import kh.mclass.test1.member.medel.dto.MemberRes;

@Service("memberService")
@Transactional //MemberService class전체에 적용
public class MemberService {
	@Autowired
	private MemberDao memberDao;
//	root-context.xml에서 slqSession을 끌고온 것(id가 같아서 끌고 올 수 있었던 것이다)
	
	//@Transactional //아래 method안에서 오류가 발생할 경우 자동으로 rollback 처리해주는 어노테이션
	public List<MemberRes> selectList(){
		//memberDao.insert(); 
		//memberDao.update(); //update는 0이어도 오류가 아니다. 0행이 업데이트 될 수도 있음
		return memberDao.selectList();
	}
	public MemberRes selectOne(String memId){
		//memberDao.insert(); 
		//memberDao.update(); //update는 0이어도 오류가 아니다. 0행이 업데이트 될 수도 있음
		return memberDao.selectOne( memId);
	}
	public void insertAbc() {
		
	}
}
