package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class InscripcionTests extends CommonTests {
    @Test
    public void DarioPuedeCursarDDSyFisica2(){
        Inscripcion inscripcion = new Inscripcion(dario, List.of(disenoDeSistemas, fisica2));
        Assert.assertTrue(inscripcion.Aprobada());
    }

    @Test
    public void DarioNoPuedeCursarOperativos(){
        Inscripcion inscripcion = new Inscripcion(dario, List.of(operativos));
        Assert.assertFalse(inscripcion.Aprobada());
    }

    @Test
    public void DarioNoPuedeCursarDDSyFisica2ConOperativos(){
        Inscripcion inscripcion = new Inscripcion(dario, List.of(disenoDeSistemas, fisica2, operativos));
        Assert.assertFalse(inscripcion.Aprobada());
    }
}
