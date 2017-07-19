package com.ibm.newcrm.repository;

import com.ibm.newcrm.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by VivekMadan on 05-07-2017.
 */
public interface UserRepository extends CrudRepository<UserEntity, Integer>
{
    @Query("SELECT u FROM UserEntity u WHERE u.USER_LOGIN_ID = :loginId AND u.USER_FNAME = :firstName")
    public UserEntity findByLoginIdAndFirstName(@Param("loginId") String loginId, @Param("firstName") String firstName);

}
