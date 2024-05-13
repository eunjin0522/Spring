package kh.mclass.test1.member.medel.dto;


public class MemberRes {
	private String memId;
	private String memPwd;
	private String memEmail;
	public MemberRes(String memId, String memPwd, String memEmail) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memEmail = memEmail;
	}
	public MemberRes() {
		super();
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPwd() {
		return memPwd;
	}
	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	
}
