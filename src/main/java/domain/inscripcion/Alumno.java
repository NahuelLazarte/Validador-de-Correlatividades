package domain.inscripcion;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Materia> materiasCursadas;

    public Alumno(){
        this.materiasCursadas = new ArrayList<>();
    }

    public List<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }
    public void agregarMateriaCursada(Materia materia) {
        this.materiasCursadas.add(materia);
    }

}



