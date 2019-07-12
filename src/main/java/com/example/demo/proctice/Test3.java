package com.example.demo.proctice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhangxin
 * @title: Test3
 * @projectName testWar
 * @description: TODO
 * @date 2019/7/12  18:51
 */
public class Test3 {
    public static void main(String[] args) {
         Map<String, Object> targetParams = new HashMap<>();
         targetParams.put("1","java");
        try {
            Class<?> clazz = Class.forName(targetParams.get("clazz").toString());
            System.out.println(clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
