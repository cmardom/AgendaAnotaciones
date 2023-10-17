package src.modelo;

import src.anotaciones.TareaAnotacion;

@TareaAnotacion(tituloTarea = "Tarea de prueba", descripcion = "Descripcion de tarea")
public class Tarea {
    private String tituloTarea;
    private String descripcion;
    private String diaSemana;
    private int hora;

    public Tarea(String tituloTarea, String descripcion, String diaSemana, int hora) {
        this.tituloTarea = tituloTarea;
        this.descripcion = descripcion;
        this.diaSemana = diaSemana;
        this.hora = hora;
    }

    public String getTituloTarea() {
        return tituloTarea;
    }

    public void setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "tituloTarea='" + tituloTarea + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", diaSemana='" + diaSemana + '\'' +
                ", hora=" + hora +
                '}';
    }
}
