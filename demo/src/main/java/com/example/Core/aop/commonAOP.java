package com.example.Core.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class commonAOP {
    @Pointcut("within(com.example.Controller..*)")
    public void log(){}

    @Around("log()")
    public Object showlog(ProceedingJoinPoint joinPoint) throws Throwable{     
        log.info("【AOP】joinPoint.method name = {}",joinPoint.getSignature());
        return joinPoint.proceed();
    }
}
