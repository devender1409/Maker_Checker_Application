package com.customerapp.model.hibernate.service.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private Logger logger= LogManager.getLogger(LoggingAspect.class);

    @Around("execution( * com.customerapp.model.hibernate.service..*.*(.. ))")
    public Object applyLogging(ProceedingJoinPoint joinPoint)throws Throwable{
        long start=System.currentTimeMillis();
        Object value=joinPoint.proceed();
        long end=System.currentTimeMillis();
        logger.info("Time Taken To Execute the Method is : "+joinPoint.getSignature().getName()+":"+ (end-start)+"ms" );
        return value;
    }
}
