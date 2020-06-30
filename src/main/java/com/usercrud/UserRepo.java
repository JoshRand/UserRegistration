package com.usercrud;
import org.springframework.data.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository("UserRepo")
public interface UserRepo extends CrudRepository<User,Integer>
{
	public User findByUserName(String stuname);
}
