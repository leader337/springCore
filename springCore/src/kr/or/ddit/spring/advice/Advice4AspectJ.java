package kr.or.ddit.spring.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Repository;

@Aspect
@Repository("advice4AspectJ")
public class Advice4AspectJ {
//	@Before(value="execution(* kr.or.ddit.spring..*.*(..))")
	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getName();
		
		System.out.println("beforMethod 실행 "+className + "."+methodName);
	}
	
	@AfterThrowing(pointcut="execution(* kr.or.ddit.spring..*.*(..))", throwing="ex")
	public void afterThrowingMethod(JoinPoint joinPoint, Exception ex) throws Throwable{
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getName();
		
		System.err.println(className + "."+methodName+"  exception: "+ex.getMessage());
	}
	
//	@Around(value="execution(* kr.or.ddit.spring..*.*(..))")
	public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getName();
		
		System.out.println(className + "."+methodName+"  start !!");
		Object[] args= joinPoint.getArgs();
		for(Object arg:args){
			System.out.println("arg: "+arg);
		}
		
		long startTime = System.currentTimeMillis();
		//이부분이 핵심로직이 실행되는 것을 대체 하는 라인
		Object retVal = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		
		System.out.println(className + "."+methodName+"  end !!"
				+", return value="+retVal + " ,lead time = "+(endTime-startTime) +"ms");
		
		return retVal;
	}
	
	@AfterReturning(pointcut="execution(* kr.or.ddit.spring..*.*(..))" , returning="retVal")
	public void afterReturningMethod(JoinPoint joinPoint, Object retVal){
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getName();
		Object[] args= joinPoint.getArgs();
		for(Object arg:args){
			System.out.println("arg: "+arg);
		}
		System.out.println("afterReturningMethod 실행 "+className + "."+methodName
				+", return value="+retVal);
	}
	
	
	
	
	
	
}
