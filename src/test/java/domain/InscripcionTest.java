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
    public void inscripcionAprobada (){
        Materia analisisDeSistemas = new Materia();
        Materia paradigmasDeProgramacion = new Materia();

        Materia disenio = new Materia();
        disenio.agregarCorrelativa(analisisDeSistemas);
        disenio.agregarCorrelativa(paradigmasDeProgramacion);

        Alumno jose = new Alumno();
        jose.agregarMateriaCursada(analisisDeSistemas);
        jose.agregarMateriaCursada(paradigmasDeProgramacion);

        List<Materia> materiasAInscribirse = new ArrayList<>();
        materiasAInscribirse.add(disenio);

        Inscripcion inscripcion = new Inscripcion(jose,materiasAInscribirse);
        Assert.assertTrue(inscripcion.aprobada());
    }
    @Test
    public void inscripcionNoAprobada (){
        Materia algoritmos = new Materia();
        Materia matDiscreta = new Materia();
        Materia arqComputadores = new Materia();

        Materia sistemasOperativos = new Materia();
        sistemasOperativos.agregarCorrelativa(algoritmos);
        sistemasOperativos.agregarCorrelativa(matDiscreta);
        sistemasOperativos.agregarCorrelativa(arqComputadores);

        Alumno jose = new Alumno();
        jose.agregarMateriaCursada(algoritmos);
        jose.agregarMateriaCursada(matDiscreta);

        List<Materia> materiasAInscribirse = new ArrayList<>();
        materiasAInscribirse.add(sistemasOperativos);

        Inscripcion inscripcion = new Inscripcion(jose,materiasAInscribirse);
        Assert.assertFalse(inscripcion.aprobada()); //Jose no tiene cursada arqComputadores
    }
}

