package com.esprit.examen.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


/*Q37*/
@Aspect
public class PerformanceAspect {
	
	private static final Logger l = LogManager.getLogger(PerformanceAspect.class);
	
/*Q38*/("execution(* com.esprit.examen.services.*.*(..))")

    public void profile(ProceedingJoinPoint pjp) throws Throwable {
            long start = System.currentTimeMillis();
      
            pjp.proceed();
            long elapsedTime = System.currentTimeMillis() - start;
            l.info("Method execution time: " + elapsedTime + " milliseconds.");
    }

}
