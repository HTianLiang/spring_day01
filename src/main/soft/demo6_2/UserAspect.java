package soft.demo6_2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class UserAspect {

    @Pointcut("execution(* soft.demo6_2.*Impl.*(..))")
    public void pc(){}

    //前置
    @Before("UserAspect.pc()")
    public void before(){
        System.out.println("------前置------");
    }
    //后置
    @AfterReturning("UserAspect.pc()")
    public void afterReturning(){
        System.out.println("------后置(如果出现异常不会被调用)------");
    }
    //环绕
    @Around("UserAspect.pc()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("------环绕(之前部分)------");
        Object proceed = pjp.proceed();//调用目标方法
        System.out.println("------环绕(之后部分)------");
        return proceed;
    }
    //异常
    @AfterThrowing("UserAspect.pc()")
    public void afterException(){
        System.out.println("-------异常(异常出现了！！！)------");
    }
    //后置
    @After("UserAspect.pc()")
    public void after(){
        System.out.println("------后置(出现异常也会被调用)------");
    }
}
