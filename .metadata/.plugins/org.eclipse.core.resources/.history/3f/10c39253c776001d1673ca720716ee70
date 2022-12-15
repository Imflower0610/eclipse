package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.VO.EmpVO;
import com.dw.emp.mapper.EmpMapper;


@Service
public class EmpService {
	@Autowired
	EmpMapper empMapper;
	
	public List<EmpVO> selectEmp(){
		return empMapper.selectEmp();
	}
	public EmpVO selectEmpfindByEmpno(int empno) {
		return empMapper.selectEmpfindByEmpno(empno);
	}
	public int insertEmp(EmpVO emp) {
		return empMapper.insertEmp(emp);
	}
	public int deleteEmp(int empno) {
		return empMapper.deleteEmp(empno);
	}
	public int updateEmp(EmpVO emp) {
		return empMapper.updateEmp(emp);
	}
}
