package com.tunan.aspectj.dao;

import com.tunan.aspectj.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tunan
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
