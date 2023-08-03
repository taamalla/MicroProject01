package com.esprit.examen.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
/*q35*/
public class LoggingAspect {
	
	private static final Logger l = LogManager.getLogger(LoggingAspect.class);

	@Before("execution(/*Q36*/)")
	public void logMethodEntry(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		l.info("In method : " + name + " : ");
	}

	@AfterReturning("execution(/*Q36*/))")
	public void logMethodExit1(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		l.info("Out of method without errors : " + name );
	}

	@AfterThrowing("execution(/*Q36*/))")
	public void logMethodExit2(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		l.error("Out of method with erros : " + name );
	}
	
	@After("execution(/*Q36*/))")
	public void logMethodExit(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		l.info("Out of method : " + name );
	}

}
