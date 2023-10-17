package src.modelo;

import src.anotaciones.TareaAnotacion;
import src.anotaciones.TareasAnotacion;

import java.util.ArrayList;

@TareasAnotacion( value = {
        @TareaAnotacion(tituloTarea = "Estudiar", descripcion = "para el examen", diaSemana = "Lunes", hora = 10),
        @TareaAnotacion(tituloTarea = "Entrenar", descripcion = "en el gimnasio", diaSemana = "Martes", hora = 20),
        @TareaAnotacion(tituloTarea = "", descripcion = "", diaSemana = "", hora = 0)
})
public class AgendaSemana{
    ArrayList<Tarea>[] tareas;

    public AgendaSemana(ArrayList<Tarea>[] tareas) {
        this.tareas = tareas;
    }

    public ArrayList<Tarea>[] getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea>[] tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "AgendaSemana{" +
                "tareas=" + tareas +
                '}';
    }

    public static void cargadorDeContexto(AgendaSemana agendaSemana){
        TareasAnotacion tareasPadre = agendaSemana.getClass().getAnnotation(TareasAnotacion.class);
        TareaAnotacion[] tareaHijas = tareasPadre.value();

        for (TareaAnotacion tareaHija : tareaHijas) {
            String tituloTarea = tareaHija.tituloTarea();
            String descripcion = tareaHija.descripcion();
            String diaSemana = tareaHija.diaSemana();
            int hora = tareaHija.hora();

            if (tareaHija.tituloTarea() == "Estudiar"){
                agendaSemana.setTareas(new Tarea (tituloTarea, descripcion, diaSemana, hora));
            } else {
                System.out.println("No has introducido tarea");
            }
        }
    }

    private void setTareas(ArrayList<Tarea> tareas) {
        for (int i = 0; i < tareas.length; i++) {
            tareas[0] = tarea;
        }
    }
}

