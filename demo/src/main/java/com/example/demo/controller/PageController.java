package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String callIndxPage() {
		//return에 html파일 이름을 작성
		return "index";
		
	}
	//사용자가 home주소 입력시 home이름을 가진 html을 return
	@GetMapping("/home")
	   public String callHomePage(HttpServletRequest request) {
		
		String ip = request.getRemoteAddr();
		   System.out.println("요청받은 IP : " + ip);
		   
	      return "home";
	   }
	@GetMapping("/movie")
	   public String callMoviepage() {
	      return "movie";
	   }
	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}
	@GetMapping("/login2")
	public String callLoginPage2() {
		return "login2";
	}
	@GetMapping("/login3")
	public String calLoginPage3() {
		return "login3";
	}
	@GetMapping("/emp")
	public String callemppage() {
		return "emp";
	}
	@GetMapping("/dept")
	public String calldeptpage() {
		return "dept";
	}
	@GetMapping("/users")
	public String calluserspage(HttpServletRequest req, ModelMap map) {
		//ModelMap : Html에 데이터르르 전달함 (html에 데이터를 전달하는 방법은 크게 2가지)
		//1. AJAX를 이용한 데이터 처리
		//2. ModelMap을 활용한 데이터 처리
		//실무에서는 1번과 2번을 번갈아가면서 사용
		//2번은 사용하지 않는 곳도 있기 때문에 우리는 1번만 사용
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");
		System.out.println("name===> " +name);
		map.addAttribute("name", name);//
		
		return "users";
	}
}
