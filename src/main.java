package src;

import src.modelo.AgendaSemana;
import src.modelo.Tarea;

import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        System.out.println("hola");
        ArrayList<Tarea>[] tareas = new ArrayList[10];
        AgendaSemana agendaSemana = new AgendaSemana(tareas);

        for (Tarea tarea : agendaSemana.getTareas()){
            System.out.println(tarea);
        }



    }
}