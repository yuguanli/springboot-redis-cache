package com.ygl.springboot.redis.cache.config;
import org.springframework.core.annotation.AliasFor;
import java.lang.annotation.*;

/**
 * @author wjw
 * 2018/7/12
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CacheExpire {
    /**
     * expire time, default 60s
     */
    @AliasFor("expire")
    long value() default 0L;

    /**
     * expire time, default 60s
     */
    @AliasFor("value")
    long expire() default 0L;

    /**
     * 晚上12点过期
     * @return
     */
    String expireDay() default "ENDDAY";

}
