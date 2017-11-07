package com.zrkj.admin.web.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.zrkj.admin.web.annotation.SysOperation;

/**
 * 系统操作，切面处理类
 *
 * @author zx
 * @date 2017年11月3日12:19:00
 */
@Aspect
@Component
public class SysOperationAspect {

	@Pointcut("@annotation(com.zrkj.admin.web.annotation.SysOperation)")
	public void operationPointCut() {

	}

	@Around("operationPointCut()")
	public Object aroundOperation(ProceedingJoinPoint point) throws Throwable {
		Object result = print(point);
		return result;
	}

	private Object print(ProceedingJoinPoint point) {
		Object result = null;
		try {
			result = point.proceed();
		} catch (Throwable e) {
		}

		MethodSignature signature = (MethodSignature) point.getSignature();
		Method method = signature.getMethod();
		SysOperation syslog = method.getAnnotation(SysOperation.class);
		if (syslog != null) {
			System.out.println("系统操作注解上的描述：");
			System.out.println(syslog);
		}
		// 请求的方法名
		String className = point.getTarget().getClass().getName();
		String methodName = signature.getName();
		System.out.println(className + "." + methodName + "()");
		// 请求的参数
		Object[] args = point.getArgs();
		System.out.println(args[0]);

		return result;
	}

}
