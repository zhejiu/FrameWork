package com.wsj.spring.aop.impl.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;

public class LoginAspect {

	public void beforeMethod(JoinPoint joinPoint) {
		// 获取目标方法名
		String methodName = joinPoint.getSignature().getName();

		// 获取目标方法参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
//		Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " begin with " + args);
	}

	public void afterMethod(JoinPoint joinPoint) {
		// 获取目标方法名
		String methodName = joinPoint.getSignature().getName();

		// 获取目标方法参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		// Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " after with " + args);
	}
	
	public void returnMethod(JoinPoint joinPoint) {
		// 获取目标方法名
		String methodName = joinPoint.getSignature().getName();

		// 获取目标方法参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		// Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " return with " + args);
	}
	
	public void exceptionMethod(JoinPoint joinPoint) {
		// 获取目标方法名
		String methodName = joinPoint.getSignature().getName();
		
		// 获取目标方法参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		// Object[] args = joinPoint.getArgs();
		
		System.out.println("The method " + methodName + " exception with " + args);
	}
	
	public void aroundMethod(JoinPoint joinPoint) {
		// 获取目标方法名
		String methodName = joinPoint.getSignature().getName();
		
		// 获取目标方法参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		// Object[] args = joinPoint.getArgs();
		
		System.out.println("The method " + methodName + " around with " + args);
	}
}
