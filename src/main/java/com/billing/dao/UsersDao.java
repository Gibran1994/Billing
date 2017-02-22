package com.billing.dao;

import java.util.List;

import com.billing.model.Users;

public interface UsersDao {

	List<Users> fetchUserByUserNamePassword(String username,String password);
}
