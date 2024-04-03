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
                allMatch( materia -> materia.getCorrelativas().stream().allMatch(correlativa -> this.alumno.getMateriasCursadas().contains(correlativa)) );
    }

}