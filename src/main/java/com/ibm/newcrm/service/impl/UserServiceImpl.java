package com.ibm.newcrm.service.impl;

import com.ibm.newcrm.entity.UserEntity;
import com.ibm.newcrm.repository.UserRepository;
import com.ibm.newcrm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by VivekMadan on 05-07-2017.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public void saveUserDetails(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    @Override
    public UserEntity getUserDetails(String loginId, String firstName) {
        return userRepository.findByLoginIdAndFirstName(loginId, firstName);
    }

	@Override
	public void updateUserDetails(UserEntity userEntity) {
		
	}

	@Override
	public UserEntity findUserById(int id) {
		return userRepository.findOne(id);
	}
}
