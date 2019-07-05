package com.zc.mockito.domain.repository;

import com.zc.mockito.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Classname UserRepository
 * @Description TODO
 * @Date 2019/7/5 15:53
 * @Author is zhangchi
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
