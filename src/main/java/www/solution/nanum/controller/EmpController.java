package www.solution.nanum.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import www.solution.nanum.service.EmpService;
import www.solution.nanum.vo.EmpVO;

@Controller
public class EmpController {

	@Autowired
	private EmpService service;
	
	// 사원 등록 Form 페이지로 이동
	@GetMapping(value = "empRegistForm")
	public String empRegistForm() {
		return "emp/empRegistForm";
	}
	
	// 사원 조회 페이지로 이동
	@GetMapping(value = "empSearch")
	public String empSearch() {
		return "emp/empSearch";
	}
	
	// 사원 등록 수행
	@PostMapping(value = "empRegist")
	public String empRegist(@ModelAttribute EmpVO emp, Model model) {
		int insertCount = service.registEmp(emp);
		
		if(insertCount > 0) {
			return "main";
		} else {
			System.out.println("사원 등록 실패");
			return "main";
		}
		
	}
	
	// 사원 조회 수행
	@PostMapping(value = "empSearch")
	public String empSearch(Model model, 
			@RequestParam(defaultValue = "") String emp_idnumber1,
			@RequestParam(defaultValue = "") String emp_idnumber2) {
		
		List<EmpVO> empList = service.getEmpList(emp_idnumber1, emp_idnumber2);
		
		model.addAttribute("empList", empList);
		
		return "emp/empSearch";
	}
	
	
	
}
