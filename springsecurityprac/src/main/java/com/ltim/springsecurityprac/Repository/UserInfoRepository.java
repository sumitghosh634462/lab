package com.ltim.springsecurityprac.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ltim.springsecurityprac.Entity.UserInfo;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);

}

