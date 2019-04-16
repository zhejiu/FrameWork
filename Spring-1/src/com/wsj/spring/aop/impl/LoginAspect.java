package com.wsj.spring.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // 声明该类是一个切面
@Component // 把该类交给IOC容器管理
public class LoginAspect {

	// 声明该方法是一个前置通知：在目标方法前执行
	@Before("execution (public int com.wsj.spring.aop.impl.ArithmeticCalculatorImpl.*(int,int))")
	public void beforeMethod(JoinPoint joinPoint) {
		// 获取目标方法名
		String methodName = joinPoint.getSignature().getName();

		// 获取目标方法参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
//		Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " begin with " + args);
	}

	// 声明该方法是一个后置通知（无论是否遇到异常，该方法都会执行）
	@After("execution (public int com.wsj.spring.aop.impl.ArithmeticCalculatorImpl.*(int,int))")
	private void afterMethod(JoinPoint joinPoint) {
		// 获取目标方法名
		String methodName = joinPoint.getSignature().getName();

		// 获取目标方法参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		// Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " after with " + args);
	}
}
