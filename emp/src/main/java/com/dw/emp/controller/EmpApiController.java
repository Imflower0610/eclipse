package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.VO.EmpVO;
import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.service.EmpService;


@RestController
public class EmpApiController {

	@Autowired
	EmpService empService;
	@GetMapping("/api/v1/emp")
	public List<EmpVO> callEmp() {
		return empService.selectEmp();
	}
	
	@GetMapping("/api/v1/emp/{empno}")
	public EmpVO callEmp(@PathVariable int empno) {
		return empService.selectEmpfindByEmpno(empno);
	}

	@PostMapping("/api/v1/emp/insert")
	public int callEmpinsert(@RequestBody EmpVO emp) {
		return empService.insertEmp(emp);
	}

	@DeleteMapping("/api/v1/emp/{empno}")
	   public int callEmpDelete(@PathVariable int empno) {
		return empService.deleteEmp(empno);
	   }
	
	@PatchMapping("/api/v1/emp/")
	public int callEmpUpdate(@RequestBody EmpVO emp) {
		return empService.updateEmp(emp);
	}
}
