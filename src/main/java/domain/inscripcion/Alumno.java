package domain.inscripcion;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    public List<Materia> materiasCursadas;

    public Alumno(){
        this.materiasCursadas = new ArrayList<>();
    }

    public List<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }
    public void agregarMateriaCursada(Materia materia) {
        this.materiasCursadas.add(materia);
    }

    public void imprimirMateriasCursadas() {
        System.out.println("Materias cursadas:");
        for (Materia materia : materiasCursadas) {
            System.out.println(materia.nombre);
        }
    }

}



