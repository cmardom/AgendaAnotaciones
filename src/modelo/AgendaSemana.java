package src.modelo;

import src.anotaciones.TareaAnotacion;
import src.anotaciones.TareasAnotacion;


import java.util.ArrayList;

@TareasAnotacion( value = {
        @TareaAnotacion(tituloTarea = "Estudiar", descripcion = "para el examen", diaSemana = "Lunes", hora = 10),
        @TareaAnotacion(tituloTarea = "Entrenar", descripcion = "en el gimnasio", diaSemana = "Martes", hora = 20),
        @TareaAnotacion(tituloTarea = "", descripcion = "", diaSemana = "", hora = 0)
})
public class AgendaSemana {
    ArrayList<Tarea> tareas;

    public AgendaSemana() {
        tareas = new ArrayList<>();
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "AgendaSemana{" +
                "tareas=" + tareas +
                '}';
    }

    public void cargadorDeContexto(AgendaSemana agendaSemana) {
        TareasAnotacion tareasPadre = agendaSemana.getClass().getAnnotation(TareasAnotacion.class);
        TareaAnotacion[] tareaHijas = tareasPadre.value();

        //por cada elemento tareaAnotacion al que vamos a llamar tareaHija, recorremos la tareaHijas real
        for (TareaAnotacion tareaHija : tareaHijas) {
            String tituloTarea = tareaHija.tituloTarea();
            String descripcion = tareaHija.descripcion();
            String diaSemana = tareaHija.diaSemana();
            int hora = tareaHija.hora();

            if (tareaHija.tituloTarea().equals("Estudiar")) {
                //(new Tarea (tituloTarea, descripcion, diaSemana, hora));
                agendaSemana.getTareas().add(new Tarea(tituloTarea, descripcion, diaSemana, hora));
            }
        }
    }

}



