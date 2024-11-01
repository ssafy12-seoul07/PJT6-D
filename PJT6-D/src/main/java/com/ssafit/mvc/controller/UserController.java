package com.ssafit.mvc.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.mvc.model.dto.User;
import com.ssafit.mvc.model.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private final UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//회원 전체 조회
	@GetMapping("")
	public ResponseEntity<?> getAllUser(){
		List<User> list = userService.getAllUsers();
		if(list==null || list.size()==0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user를 찾을 수 없습니다.");
		} else {
			return new ResponseEntity<List<User>>(list, HttpStatus.OK);
		}
	}
	
	//회원 한명 조회(id로)
	@GetMapping("/{id}")
	public ResponseEntity<?> getUserById(@PathVariable("id") String id){
		User user = userService.getUserById(id);
		if(user==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("해당 user를 찾을 수 없습니다");
		} else {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
	}
	
	//회원가입
	@PostMapping("")
	public ResponseEntity<?> signup(@RequestBody User user){
		user.setId(UUID.randomUUID().toString());
		user.setRegistDate(LocalDate.now().toString());
		boolean result = userService.addUser(user);
		if(result) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
