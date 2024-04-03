package domain.inscripcion;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    public List<Materia> correlativas;
    public String nombre;

    public Materia(String nombre){
        this.correlativas = new ArrayList<>();
        this.nombre = nombre;
    }
    public List<Materia> getCorrelativas() {
        return correlativas;
    }
    public void agregarCorrelativa(Materia correlativa) {
        this.correlativas.add(correlativa);
    }
}