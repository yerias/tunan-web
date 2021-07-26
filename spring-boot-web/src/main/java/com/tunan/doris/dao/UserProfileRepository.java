package com.tunan.doris.dao;


import com.tunan.doris.domain.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tunan
 */
public interface UserProfileRepository extends JpaRepository<UserProfile, String> {
}
