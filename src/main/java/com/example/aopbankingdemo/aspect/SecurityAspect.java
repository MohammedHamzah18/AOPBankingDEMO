 /* package com.example.aopbankingdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecurityAspect {

    @After("execution(* com.example.aopbankingdemo.dao.AccountDAOImpl.withdrawMoney(..))")
    public void checkSecurity() {
        System.out.println("SECURITY: Checking user authorization");
    }
} */