package net.javaguides.springboot_newproject.serviceImpl;
import net.javaguides.springboot_newproject.dto.Sample_dto;
import net.javaguides.springboot_newproject.entity.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot_newproject.Repository.UserRepository;
import net.javaguides.springboot_newproject.service.Newservice;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NewserviceImp implements Newservice {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public String saveUser(Sample_dto request) {
		
		UserEntity user=new UserEntity();
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		
		userRepo.save(user);
		return "Success";
	}
	
	@Override
	public List <Sample_dto> getAllUsers(){
		return userRepo.findAll()
				.stream()
				.map(user -> new Sample_dto(user.getId(),user.getName(), user.getEmail()))
        .collect(Collectors.toList());
	}
	
	@Override
	public String updateUser(long id, Sample_dto dto) {
	    UserEntity user = userRepo.findById(id)
   .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

    user.setName(dto.getName());
    user.setEmail(dto.getEmail());
    userRepo.save(user);

  
	    return "User updated successfully";
	}
	@Override
	public void deleteUserById(long id) {
		userRepo.deleteById(id);
	
	}
}
