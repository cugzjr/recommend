package com.xxxx.server.dao;

import com.xxxx.server.pojo.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;


public interface UserRespository extends Neo4jRepository<User, Long> {

    User findByUserId(Integer userId);
}
