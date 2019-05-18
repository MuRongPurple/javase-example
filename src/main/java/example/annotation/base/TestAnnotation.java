package example.annotation.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 元注解
 *
 * 元注解是什么意思呢？
 *
 * 元注解是可以注解到注解上的注解，或者说元注解是一种基本注解，但是它能够应用到其它的注解上面。
 *
 * 如果难于理解的话，你可以这样理解。元注解也是一张标签，但是它是一张特殊的标签，它的作用和目的就是给其他普通的标签进行解释说明的。
 *
 * 元标签有 @Retention、@Documented、@Target、@Inherited、@Repeatable 5 种。
 * ---------------------
 * 作者：frank909
 * 来源：CSDN
 * 原文：https://blog.csdn.net/briblue/article/details/73824058
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    int id() default -1;
    String msg() default "Hi";
}
