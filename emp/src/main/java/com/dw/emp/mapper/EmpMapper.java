package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.VO.EmpVO;


@Mapper
public interface EmpMapper {
	/**
	 * @Since : 2022. 11. 28.
	 * @Author : Imflower
	 * @Return : List<EmpVO>
	 * @Comment : EMP테이블 전체조회
	 */
	public List<EmpVO> selectEmp();//메소드정의

	public EmpVO selectEmpfindByEmpno(int empno);
	
	int insertEmp(EmpVO vo);
	
	int deleteEmp(int empno);
	
	int updateEmp(EmpVO vo);
}
