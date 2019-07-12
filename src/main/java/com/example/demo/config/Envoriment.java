package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Zhangxin
 * @title: Envoriment
 * @projectName testWar
 * @description: TODO
 * @date 2019/7/2  14:32
 */
@Component
@ConfigurationProperties(prefix = "consoleself")
public class Envoriment {
    private String istest;
    private String isproduction;
    private Address address;

    public String getIstest() {
        return istest;
    }

    public void setIstest(String istest) {
        this.istest = istest;
    }

    public String getIsproduction() {
        return isproduction;
    }

    public void setIsproduction(String isproduction) {
        this.isproduction = isproduction;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
