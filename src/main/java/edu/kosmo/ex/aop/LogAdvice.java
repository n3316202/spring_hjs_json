package edu.kosmo.ex.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;


@Log4j
@Component
@Aspect
public class LogAdvice {	 

	/*
	@Before("within(edu.bit.board.service.*)")
	public void printLogging()  {
		System.out.println("공통기능 - 프린트 로그");		
	}
	*/
	@Before("within(edu.kosmo.ex.service.*)")
	public void logBefore()  {
		System.out.println("공통기능 - 로그비포=====================================");		
	}
	
	@After("within(edu.kosmo.ex.service.*)")
	public void logAfter()  {
		System.out.println("공통기능 - 로그애프터************************************");		
	}

	@Around("within(edu.kosmo.ex.service.*)")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		
		String signatureStr = joinpoint.getSignature().toShortString();
		
		System.out.println( signatureStr + " is start.");
		
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();
			
			return obj;
		} finally {
		
			long et = System.currentTimeMillis();
			
			System.out.println( signatureStr + " is finished.");
			System.out.println( signatureStr + " 경과시간 : " + (et - st));
		}
		
	}
}
