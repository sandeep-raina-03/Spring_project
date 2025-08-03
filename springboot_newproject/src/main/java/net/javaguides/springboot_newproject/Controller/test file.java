package net.javaguides.springboot_newproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot_newproject.dto.Sample_dto;
import net.javaguides.springboot_newproject.service.Newservice;



@RestController
@RequestMapping("/api/users")
public class UserController {      
	
	
	@Autowired
	private Newservice userService;
	
	@PostMapping("/login")
	public String createUser(@RequestBody Sample_dto sample_dto) {
	    return userService.saveUser(sample_dto);   
	}
		   
@GetMapping("/list")
public List <Sample_dto> getAllUsers() {
	return userService.getAllUsers();
}
@PutMapping("/update/{id}")
public ResponseEntity<String> updateUser( 
        @PathVariable long id,
        @RequestBody Sample_dto dto) {

    String result = userService.updateUser(id, dto);
    return ResponseEntity.ok(result);
}
@DeleteMapping("/delete/{id}")
public String deleteUser(@PathVariable long id) {
    userService.deleteUserById(id);
    return "User with ID " + id + " deleted successfully.";
}
}
