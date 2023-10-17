package modelo;

import java.util.LocalTime;
import java.util.LocalDate;

public class AgendaSemana{
    ArrayList <Tarea> tareas;

    public AgendaSemana(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }
}

