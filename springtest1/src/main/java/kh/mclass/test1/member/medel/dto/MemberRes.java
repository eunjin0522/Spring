package kh.mclass.test1.member.medel.dto;

import lombok.Data;

//@Setter //setter만 생성
//@Getter //getter만 생성

@Data //getter,setter생성
//@ToString //tostring
//@AllArgsConstructor //생성자생성
//@NoArgsConstructor //기본생성자
public class MemberRes {
	private String memId;
	private String memPwd;
	private String memEmail;
	
}
