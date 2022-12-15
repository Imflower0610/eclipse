package com.example.demo.vo;

import lombok.Getter;
import lombok.Setter;
//아니면 @data도 가능
@Getter
@Setter
public class UsersVO {
	private String id;
	private String pw;
	private String name;
	private boolean isUser;
}
