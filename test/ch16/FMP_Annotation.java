package test.ch16;
import java.lang.annotation.*;
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface FMP_Annotation{
    String describe();
    Class<?> type() default Void.class;
}