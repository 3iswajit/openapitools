package com.code.openapi.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.code.openapi.api.ApiUtil;
import com.code.openapi.api.UsersApi;
import com.code.openapi.api.UsersApiDelegate;
import com.code.openapi.model.UserModel;

public class UserService implements UsersApiDelegate{
	
	@Override
    public ResponseEntity<UserModel> getUserById(Long userId) {
		UserModel user = new UserModel();
		user.setName("Obito");
		user.setEmail("Obito@gmail.com");
        return new ResponseEntity<>(user,HttpStatus.OK);

    }
	
	@Override
    public ResponseEntity<String> saveUser(UserModel userModel) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
