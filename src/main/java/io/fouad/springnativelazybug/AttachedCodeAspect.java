package io.fouad.springnativelazybug;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AttachedCodeAspect {

    @Around("@annotation(attachedCode)")
    public Object aroundErrorCode(ProceedingJoinPoint joinPoint, AttachedCode attachedCode) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (Exception e) {
            throw new CodedException(attachedCode.value());
        }
    }
}