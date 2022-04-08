package com.devmind;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class MyAOP {

    @Pointcut("execution(* run(..))")
    private void anyLoggableMethod() {}

    @Before(value = "anyPublicOperation() || anyLoggableMethod()", argNames = "joinPoint")
    public void beforeCall(JoinPoint joinPoint) {
        System.out.println("Method Name :" + joinPoint.getSignature().toShortString() +
                "| Args => " + Arrays.asList(joinPoint.getArgs()));
    }
}
