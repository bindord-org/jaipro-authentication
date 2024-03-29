package com.bindord.eureka.auth.annotation;

import java.lang.annotation.*;


@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JsonClassName {

    Class<?> name() default Void.class;
}
