package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AlumnoTests extends CommonTests {
    private Alumno billGates;

    public AlumnoTests(){
        billGates = new Alumno("Bill Gates", "1638555", List.of(algoritmos));
    }

    @Test
    public void DarioAproboAlgoritmos(){
        Assert.assertTrue(dario.Aprobo(algoritmos));
    }
    @Test
    public void DarioAproboPdeP(){
        Assert.assertTrue(dario.Aprobo(paradigmas));
    }

    @Test
    public void BillGatesNoAproboFisica1(){
        Assert.assertFalse(billGates.Aprobo(fisica1));
    }

    @Test
    public void DarioAproboFisica1(){
        Assert.assertTrue(dario.Aprobo(fisica1));
    }

    @Test
    public void DarioNoAproboFisica2(){
        Assert.assertFalse(dario.Aprobo(fisica2));
    }
}