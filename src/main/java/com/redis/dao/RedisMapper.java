package com.redis.dao;

import com.redis.model.RedisModel;

public interface RedisMapper {
    int deleteByPrimaryKey(Long advId);

    int insert(RedisModel record);

    int insertSelective(RedisModel record);

    RedisModel selectByPrimaryKey(Long advId);

    int updateByPrimaryKeySelective(RedisModel record);

    int updateByPrimaryKey(RedisModel record);
}