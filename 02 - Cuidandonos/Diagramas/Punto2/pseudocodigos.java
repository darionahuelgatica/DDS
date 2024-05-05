public abstract class EstrategiaTrayecto {
    public Trayecto trayecto;
    public abstract void asumirIncidente();
    public abstract int calcularDemora(Seccion seccion);
    public int calcularDemora(Trayecto trayecto) {
        return trayecto.Secciones.Sum(s => calcularDemora(s));
    }
}

public class EstrategiaPorParadas inherits EstrategiaTrayecto {

    public IEstimadorDemoras estimadorDemoras;
    public int demoraPorParadas;
    public EstrategiaPorParadas(IEstimadorDemoras estimadorDemoras, int demoraPorParadas){
        this.estimadorDemoras = estimadorDemoras;
        this.demoraPorParadas = demoraPorParadas;
    }

    public int calcularDemora(Seccion seccion){
        return estimadorDemoras.estimarDemora(seccion.Origen, seccion.Destino) + demoraPorParadas;
    }
}

public class EstrategiaPuntoAPunto inherits EstrategiaTrayecto {

    public IEstimadorDemoras estimadorDemoras;
    public EstrategiaPorParadas(IEstimadorDemoras estimadorDemoras){
        this.estimadorDemoras = estimadorDemoras;
    }

    public int calcularDemora(Seccion seccion){
        return estimadorDemoras.estimarDemora(seccion.Origen, seccion.Destino);
    }
}

public interface IEstimadorDemoras {
    int estimarDemora(Direccion, Direccion);
}