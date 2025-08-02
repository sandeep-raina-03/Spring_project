 package net.javaguides.springboot_newproject.service;
 //import org.springframework.stereotype.Service;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot_newproject.dto.Sample_dto;
import net.javaguides.springboot_newproject.entity.UserEntity;

@Service
public interface Newservice {
	
//	   List<UserEntity> getAllUsers();

	String saveUser(Sample_dto request);
	List<Sample_dto> getAllUsers();
	String updateUser(long id,Sample_dto dto);
	void deleteUserById(long id);
	}

