package com.samal.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SurroundedAspect {
    @Around("@annotation(Surrounded)")
    public Object surround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.print("[");
        Object proceed = joinPoint.proceed();
        System.out.println("]");
        return proceed;
    }
}
