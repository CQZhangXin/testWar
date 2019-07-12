package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.config.RealAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhangxin
 * @title: TestWar
 * @projectName testWar
 * @description: 测试Springboot工程打包war包
 * @date 2019/7/2  13:36
 */
@RestController
@RequestMapping(value = "/TestWar")
public class TestWar {

    @Autowired
    private RealAddress realAddress;

    @RequestMapping(value = "/getMsg")
    public JSONObject getMsg(){
        Map map = new HashMap();
        map.put("预算","C1-PLANNING");
        map.put("共享","FSSC");
        return new JSONObject(map);
    }

    @RequestMapping(value = "/getConfig")
    public String getConfig(){
        return  realAddress.getAddress();
    }

}
