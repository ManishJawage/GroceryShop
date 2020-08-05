/*
 * 
 * @Author: Simran
 */
package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserId(int userId);
	public User findByemail(String email);
}
