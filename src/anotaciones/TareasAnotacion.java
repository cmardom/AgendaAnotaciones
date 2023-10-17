package src.anotaciones;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TareasAnotacion {
    TareaAnotacion[] value();
}
