package com.example.demo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpVO extends BaseVO {
 private int empno;//사원번호
 private String ename;//사원이름
 private String job;//직업
 private int sal;//급여
 private String hiredate;//고용일자
}
