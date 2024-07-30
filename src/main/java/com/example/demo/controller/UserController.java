package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
	
//	@Autowired
//	private UserService userService;
//	
//	@Autowired
//	private PermissionService permissionService;
	
	
//	@CrossOrigin
//	@GetMapping("/{userId}/permissions")
//	public ResponseEntity<com.philips.responses.User> getPermissions(@PathVariable Long userId) {
//		return ResponseEntity.ok(permissionService.getResources(userId));
//	}

	@GetMapping()
	public ResponseEntity<String> welcome() {
		return ResponseEntity.ok("welcome");
	}
	
//	@CrossOrigin
//	@PostMapping()
//	public ResponseEntity<Long> registerUser(@RequestBody User user) {
//		return ResponseEntity.ok(userService.registerUser(user));
//	}

}

	

