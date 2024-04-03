package domain.inscripcion;
import java.util.List;




public class Inscripcion { //Se necesita un alumno, la lista de materias que se quiere anotar y verificar la inscripcion
    private Alumno alumno;
    private List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno,List<Materia> materiasAInscribirse){
        this.alumno = alumno;
        this.materiasAInscribirse = materiasAInscribirse;
    }
    public Boolean aprobada(){//se verifica si para cada materia a inscribirse el alumno la tiene cursada
        return this.materiasAInscribirse.stream().
                allMatch( materia -> materia.correlativas.stream().allMatch(correlativa -> this.alumno.materiasCursadas.contains(correlativa)) );
    }

    public void imprimirMateriasAInscribirse() {
        System.out.println("Materias a inscribirse:");
        for (Materia materia : materiasAInscribirse) {
            System.out.println(materia.nombre);
        }
    }

}