package com.ci1330.ecci.ucr.ac.cr.annotations;

import com.ci1330.ecci.ucr.ac.cr.bean.AutowireEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Elias Calderon, Josue Leon, Kevin Leon
 * @Date 17/09/2017
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.CONSTRUCTOR})
public @interface AtomicAutowire {

}
