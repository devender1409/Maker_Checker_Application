package com.customerapp.model.hibernate.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    @Around("execution( * com.customerapp.model.hibernate.service..*.*(.. ))")
    public Object applyLogging(ProceedingJoinPoint joinPoint)throws Throwable{
        long start=System.currentTimeMillis();
        Object value=joinPoint.proceed();
        long end=System.currentTimeMillis();
        System.out.println("ABC");
       // logger.info("Time Taken To Execute the Method is : "+joinPoint.getSignature().getName()+":"+ (end-start)+"ms" );
        return value;
    }
}
