package com.redis.controller;


import com.redis.model.RedisModel;
import com.redis.model.Result;
import com.redis.serviceImpl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/hello")
public class RedisController {

    @Autowired
    RedisServiceImpl redisServiceImpl;


    @RequestMapping(value = "/test")
    public ModelAndView testMybatis(){
        Result result = new Result();
        try {
            RedisModel redis = new RedisModel(6l,"url:http://fanyi.baidu.com","message_message");
            int i = redisServiceImpl.insertRedis(redis);
            if(i==0){
                result.setSuccess(false);
                result.setMessage("插入失败！可能原因是主键重复了！");
            }
            result.setSuccess(true);
            result.setMessage("插入成功，恭喜，框架调通了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ModelAndView mv = new ModelAndView("index");
        mv.getModel().put("result",result);
        return mv;
    }

}
