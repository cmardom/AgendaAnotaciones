package anotaciones;

import java.lang.annotation.*;
import java.util.LocalDate;
import java.util.LocalTime;

@Documented
@Target(Element.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeteable(AgendaSemana.class)
public @interface Tarea{
    String tituloTarea();
    String descripcion();
    LocalDate diaSemana();
    LocalTime hora();
}