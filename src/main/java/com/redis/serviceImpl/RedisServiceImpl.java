package com.redis.serviceImpl;


import com.redis.dao.RedisMapper;
import com.redis.model.RedisModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("redisServiceImpl")
public class RedisServiceImpl {

    @Autowired
    private RedisMapper redisMapper;

    public int insertRedis(RedisModel record){
        return redisMapper.insert(record);
    }

}
