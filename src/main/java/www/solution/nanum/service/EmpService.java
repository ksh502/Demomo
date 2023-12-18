package www.solution.nanum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.solution.nanum.mapper.EmpMapper;
import www.solution.nanum.vo.EmpVO;

@Service
public class EmpService {

	@Autowired
	private EmpMapper mapper;
	
	// 사원 등록 수행
	public int registEmp(EmpVO emp) {
		System.out.println("EmpService - registEmp()");
		return mapper.insertEmp(emp);
	}

	// 사원 조회 수행
	public List<EmpVO> getEmpList(String emp_idnumber1, String emp_idnumber2) {
		return mapper.selectEmpList(emp_idnumber1, emp_idnumber2);
	}

}
