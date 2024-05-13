package kh.mclass.test1.member.medel.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.mclass.test1.member.medel.dto.MemberRes;

@Repository("memDao")
public class MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
//	root-context.xml에서 slqSession을 끌고온 것(id가 같아서 끌고 올 수 있었던 것이다)
	
	public List<MemberRes> selectList(){
		return sqlSession.selectList("Member.list");//Member : mapper의 namespace
	}
	public MemberRes selectOne(String memId){
		System.out.println("selectOne : "+memId);
		return sqlSession.selectOne("Member.one",memId);//Member : mapper의 namespace
	}
	public int insert() {
		//sqlSession.insert("Member.insert");
		return 0;
	}
	public int update() {
		//sqlSession.update("Member.update");
		return 0;
	}
}
