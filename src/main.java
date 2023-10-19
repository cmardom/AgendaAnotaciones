package src;

import src.modelo.AgendaSemana;
import src.modelo.Tarea;

import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        ArrayList<Tarea> tareas = new ArrayList<>();
        AgendaSemana agendaSemana = new AgendaSemana();

       agendaSemana.cargadorDeContexto(agendaSemana);

        System.out.println(agendaSemana);






    }
}