package src.anotaciones;

import java.lang.annotation.*;


@Documented
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(TareasAnotacion.class)
public @interface TareaAnotacion {
    String tituloTarea() default "VOID";
    String descripcion() default "VOID";
    String diaSemana() default "Lunes";
    int hora() default 12;
}