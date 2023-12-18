package www.solution.nanum.vo;

public class EmpVO {
	private String emp_number;
	private String emp_name;
	private String emp_idnumber1;
	private String emp_idnumber2;
	
	
	// 기본 생성자
	public EmpVO() {}

	// 파라미터 생성자
	public EmpVO(String emp_number, String emp_name, String emp_idnumber1, String emp_idnumber2) {
		super();
		this.emp_number = emp_number;
		this.emp_name = emp_name;
		this.emp_idnumber1 = emp_idnumber1;
		this.emp_idnumber2 = emp_idnumber2;
	}
	
	
	
	// Getter & Setter
	public String getEmp_number() {
		return emp_number;
	}

	public void setEmp_number(String emp_number) {
		this.emp_number = emp_number;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_idnumber1() {
		return emp_idnumber1;
	}

	public void setEmp_idnumber1(String emp_idnumber1) {
		this.emp_idnumber1 = emp_idnumber1;
	}

	public String getEmp_idnumber2() {
		return emp_idnumber2;
	}

	public void setEmp_idnumber2(String emp_idnumber2) {
		this.emp_idnumber2 = emp_idnumber2;
	}

	
	
}
