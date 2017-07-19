package com.ibm.newcrm.controller;

import com.ibm.newcrm.dto.SearchUser;
import com.ibm.newcrm.dto.UserDto;
import com.ibm.newcrm.entity.UserEntity;
import com.ibm.newcrm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import javax.ws.rs.PathParam;


/**
 * Created by VivekMadan on 05-07-2017.
 */
@RestController	
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/user")
    public String createUser(@RequestBody UserDto user)
    {
        System.out.println(user);
        UserEntity entity = new UserEntity();
        entity.setUSER_LOGIN_ID(user.getLoginId());
        entity.setUSER_FNAME(user.getFirstName());
        entity.setUSER_MNAME(user.getMiddleName());
        entity.setUSER_LNAME(user.getLastName());
        entity.setUSER_EMAILID(user.getEmail());
        entity.setUSER_MOBILE_NUMBER(user.getMobileNo());
        entity.setPARTNER(user.getPartner());
        entity.setUSER_PASSWORD("test");
        entity.setCREATED_DT(new Date());
        userService.saveUserDetails(entity);
        return "ok";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/user")
    public @ResponseBody UserDto searchUser(@RequestParam("loginId") String loginId, @RequestParam("firstName") String firstName)
    {
        System.err.println("Login Id: " + loginId + ", First Name: " + firstName);
        UserEntity entity = userService.getUserDetails(loginId,firstName);
        System.err.println(entity);
        UserDto dto = null;
        if(entity != null)
        {
        	dto = new UserDto();
        	dto.setUserId(entity.getUSER_ID());
        	dto.setLoginId(entity.getUSER_LOGIN_ID());
        	dto.setFirstName(entity.getUSER_FNAME());
        	dto.setMiddleName(entity.getUSER_MNAME());
        	dto.setLastName(entity.getUSER_LNAME());
        	dto.setEmail(entity.getUSER_EMAILID());
        	dto.setMobileNo(entity.getUSER_MOBILE_NUMBER());
        	dto.setPartner(entity.getPARTNER());
        }
        return dto;
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/user")
    public String editUser(@RequestBody UserDto dto)
    {
    	System.err.println(dto);
    	
    	UserEntity entity = userService.findUserById(dto.getUserId());
    	entity.setUSER_LOGIN_ID(dto.getLoginId());
    	entity.setUSER_FNAME(dto.getFirstName());
    	entity.setUSER_MNAME(dto.getMiddleName());
    	entity.setUSER_LNAME(dto.getLastName());
    	entity.setUSER_EMAILID(dto.getEmail());
    	entity.setUSER_MOBILE_NUMBER(dto.getMobileNo());
    	entity.setPARTNER(dto.getPartner());
    	entity.setSTATUS(dto.getStatus() != null && dto.getStatus().equalsIgnoreCase("Active") ? 'A' : 'D');
    	
    	userService.saveUserDetails(entity);
    	
    	return "ok";
    }
}
