package com.sovince.jpademo.dao;

import com.sovince.jpademo.entity.Weibo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2018/9/8
 * Time: 16:36
 */
public interface WeiboRepository extends JpaRepository<Weibo,Long> {
}
