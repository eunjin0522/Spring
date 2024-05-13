package kh.mclass.test1.sub.model.dto;


//@Component("testDto")
public class TestDto {
	private String t1;
	private String t2;
	private TestFileDto testFileDto;
	private void init() {
//		초기화를 시켜주는 메소드 (만들어서 사용할 수 있다)
		System.out.println(">>init<<");
	}
	
	public TestDto() {
		super();
	}
	
	public TestDto(String t2) {
		super();
		this.t2 = t2;
	}

	public TestDto(String t1, String t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}

	public TestDto(String t1, String t2, TestFileDto testFileDto) {
		super();
		//init(); xml에서 init-method를 설정하면 생성자에 추가하지 않아도 init메소드를 실행시켜준다
		this.t1 = t1;
		this.t2 = t2;
		this.testFileDto = testFileDto;
	}

	@Override
	public String toString() {
		return "TestDto [t1=" + t1 + ", t2=" + t2 + ", testFileDto=" + testFileDto + "]";
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	public TestFileDto getTestFileDto() {
		return testFileDto;
	}

	public void setTestFileDto(TestFileDto testFileDto) {
		this.testFileDto = testFileDto;
	}

	
}
