package com.example.demo.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Zhangxin
 * @title: RealAddress
 * @projectName hop-ecs
 * @description: 获取配置地址信息,并对配置信息的合法性进行校验
 * @date 2019/5/31  3:06
 */
@Component
public class RealAddress {
    @Autowired
    private Envoriment consoleSelfYml;

    private String address;

    @PostConstruct
    public void initAddress() throws Exception {
        boolean getUrlSuccess = false;
        Address address = consoleSelfYml.getAddress();
        String userAddress = "";
        getUrlSuccess =
                (consoleSelfYml.getIstest().equals("true")&&
                        (StringUtils.isEmpty(consoleSelfYml.getIsproduction())||
                        consoleSelfYml.getIsproduction().equals("false"))
                )||
                ((StringUtils.isEmpty(consoleSelfYml.getIstest())||
                        consoleSelfYml.getIstest().equals("false"))&&
                        consoleSelfYml.getIsproduction().equals("true"));

        if(!getUrlSuccess){
            throw new Exception("consoleself的istest与isproduction配置错误");
        }else{
            if(consoleSelfYml.getIstest().equals("true")){
                userAddress = address.getTest();
            }else{
                userAddress = address.getProduction();
            }
        }
        this.address=userAddress;
    }

    public String getAddress(){
        return this.address;
    }

}
