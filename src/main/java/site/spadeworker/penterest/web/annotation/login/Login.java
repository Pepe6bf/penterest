package site.spadeworker.penterest.web.annotation.login;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
// 리플렉션 용
@Retention(RetentionPolicy.RUNTIME)
public @interface Login {
}
