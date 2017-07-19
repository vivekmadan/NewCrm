package com.ibm.newcrm.service;

import com.ibm.newcrm.entity.UserEntity;

/**
 * Created by VivekMadan on 05-07-2017.
 */
public interface UserService{
        public void saveUserDetails(UserEntity userEntity);
        public UserEntity getUserDetails(String loginId, String firstName);
        public void updateUserDetails(UserEntity userEntity);
        public UserEntity findUserById(int id);
}
