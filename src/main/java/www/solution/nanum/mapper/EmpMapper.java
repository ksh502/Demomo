package www.solution.nanum.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import www.solution.nanum.vo.EmpVO;

public interface EmpMapper {

	// 사원 등록 수행
	int insertEmp(EmpVO emp);

	// 사원 조회 수행
	List<EmpVO> selectEmpList(
			@Param("emp_idnumber1") String emp_idnumber1,
			@Param("emp_idnumber2") String emp_idnumber2);

	//
	
	
}
