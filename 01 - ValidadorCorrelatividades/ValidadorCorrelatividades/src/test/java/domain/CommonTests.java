package domain;

import java.util.List;

public abstract class CommonTests {
    protected Materia analisis1;
    protected Materia discreta;
    protected Materia fisica1;
    protected Materia algoritmos;
    protected Materia sistemasYOrganizaciones;
    protected Materia arquitectura;
    protected Materia analisisDeSistemas;
    protected Materia paradigmas;
    protected Materia fisica2;
    protected Materia disenoDeSistemas;
    protected Materia operativos;

    protected Alumno dario;

    public CommonTests(){
        analisis1 = new Materia("Analisis Matematico I", null);
        discreta = new Materia("Matematica Discreta", null);
        fisica1 = new Materia("Fisica I", null);
        algoritmos = new Materia("Algoritmos y Estructuras de Datos", null);
        sistemasYOrganizaciones = new Materia("Sistemas y Organizaciones", null);
        arquitectura = new Materia("Arquitectura de las Computadoras", null);

        analisisDeSistemas = new Materia("Analisis de Sistemas", List.of(algoritmos, sistemasYOrganizaciones));
        paradigmas = new Materia("Paradigmas de Programación", List.of(algoritmos, discreta));
        fisica2 = new Materia("Fisica II", List.of(fisica1, analisis1));
        disenoDeSistemas = new Materia("Diseño de Sistemas", List.of(fisica1, analisis1));
        operativos = new Materia("Sistemas Operativos", List.of(discreta, algoritmos, arquitectura));

        dario = new Alumno("Dario", "1638555", List.of(analisis1, discreta, fisica1, algoritmos, sistemasYOrganizaciones, paradigmas, analisisDeSistemas));
    }
}
