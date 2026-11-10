package com.example.aopbankingdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Pointcut declaration
   /* @Pointcut("execution(* com.example.aopbankingdemo.dao.*.withdrawMoney(..))")
    public void withdrawalMethod() {
    }

    // Advice using the declared pointcut
    @After("withdrawalMethod()")
    public void withdrawalLogging() {
        System.out.println("BANK LOG: Withdrawal started"); */

   /* @Pointcut("execution(* com.example.aopbankingdemo.dao.AccountDAOImpl.*(..))")
    public void accountMethods() {
    }

    @Pointcut("execution(* com.example.aopbankingdemo.dao.AccountDAOImpl.depositMoney(..))")
    public void depositMethod() {
    }

    @Before("accountMethods() && depositMethod()")
    public void bankingAdvice() {
        System.out.println("BANK LOG: Deposit operation"); */

  /*  @Pointcut("execution(* com.example.aopbankingdemo.dao.AccountDAOImpl.depositMoney(..))")
    public void depositMethod() {
    }

    @Pointcut("execution(* com.example.aopbankingdemo.dao.AccountDAOImpl.withdrawMoney(..))")
    public void withdrawMethod() {
    }

    @Before("depositMethod() || withdrawMethod()")
    public void bankingAdvice() {
        System.out.println("BANK LOG: Money operation"); */

    @Pointcut("execution(* com.example.aopbankingdemo.dao.*.*(..))")
    public void allDaoMethods() {
    }

    @Pointcut("execution(* com.example.aopbankingdemo.dao.AccountDAOImpl.depositMoney(..))")
    public void depositMethod() {
    }

    @Before("allDaoMethods() && !depositMethod()")
    public void bankingAdvice() {
        System.out.println("BANK LOG: Banking operation");
    }
    }


