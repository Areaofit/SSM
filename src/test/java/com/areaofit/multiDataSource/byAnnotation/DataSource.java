package com.areaofit.multiDataSource.byAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，在DAO层方法上进行注解来切换数据源
 * @author Administrator
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSource {
	DynamicDataSourceGlobal value() default DynamicDataSourceGlobal.READ;
}
