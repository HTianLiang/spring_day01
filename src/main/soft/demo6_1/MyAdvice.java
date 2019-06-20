package soft.demo6_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//通知类
@Aspect
//表示该类是一个通知类
public class MyAdvice {

    //为了方便修改，可直接使用该方法
    @Pointcut("execution(* soft.demo6_1.*Impl.*(..))")
    public void pc(){}

    //前置通知
    @Before("execution(* soft.demo6_1.*Impl.*(..))") //指定切入点
    public void before(){
        System.out.println("------前置通知------");
    }
    //后置通知
    @AfterReturning("MyAdvice.pc()") //直接使用便于修改的切入点方法
    public void afterReturning(){
        System.out.println("------后置通知(如果出现异常不会被调用)------");
    }
    //环绕通知
    @Around("MyAdvice.pc()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("------环绕通知(之前部分)------");
        Object proceed = pjp.proceed();//调用目标方法
        System.out.println("------环绕通知(之后部分)------");
        return proceed;
    }
    //异常通知
    @AfterThrowing("MyAdvice.pc()")
    public void afterException(){
        System.out.println("------异常通知(异常出现了！！！)------");
    }
    //后置通知
    @After("MyAdvice.pc()")
    public void after(){
        System.out.println("------后置通知(出现异常也会被调用)------");
    }
}
