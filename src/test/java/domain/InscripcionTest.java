package domain;
import domain.inscripcion.Alumno;
import domain.inscripcion.Inscripcion;
import domain.inscripcion.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InscripcionTest {
    @Test
    public void alumnoPuedeCursaDisenio(){
        Materia analisisDeSistemas = new Materia("analisisDeSistemas");
        Materia paradigmasDeProgramacion = new Materia("paradigmasDeProgramacion");
        Materia nada = new Materia ("nada");


        Materia disenio = new Materia("disenio");
        disenio.agregarCorrelativa(analisisDeSistemas);
        disenio.agregarCorrelativa(paradigmasDeProgramacion);


        Alumno jose = new Alumno();
        jose.agregarMateriaCursada(analisisDeSistemas);
        jose.agregarMateriaCursada(paradigmasDeProgramacion);


        List<Materia> materiasAInscribirse = new ArrayList<>();
        materiasAInscribirse.add(disenio);

        Inscripcion inscripcion = new Inscripcion(jose,materiasAInscribirse);
        inscripcion.imprimirMateriasAInscribirse();

        jose.imprimirMateriasCursadas();
        Assert.assertTrue(inscripcion.aprobada());

        disenio.agregarCorrelativa(nada);
        //Assert.assertTrue(inscripcion.aprobada());
    }

}

