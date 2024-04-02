package domain;

import java.util.List;

public class Inscripcion {
    private Alumno solicitante;
    private List<Materia> asignaturas;

    public Inscripcion(Alumno solicitante, List<Materia> asignaturas){
        this.solicitante = solicitante;
        this.asignaturas = asignaturas;
    }

    public Boolean Aprobada(){
        return asignaturas.stream().allMatch((asignatura) ->
            asignatura.GetCorrelativas().stream().allMatch((correlativa) ->
                solicitante.Aprobo(correlativa)));
    }
}