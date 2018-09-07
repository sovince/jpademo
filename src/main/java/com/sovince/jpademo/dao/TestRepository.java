package com.sovince.jpademo.dao;

import com.sovince.jpademo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test,Integer> {
}
