package com.sovince.jpademo.dao;

import com.sovince.jpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2018/9/8
 * Time: 15:49
 */
public interface UserRepository extends JpaRepository<User,Long>{

    List<User> getByUsernameContaining(String username);

    User getByUsernameIs(String username);

    User getByUserId(long userId);
}
