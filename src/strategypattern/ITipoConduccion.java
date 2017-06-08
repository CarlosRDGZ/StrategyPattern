package strategypattern;

public interface ITipoConduccion
{
    String ObtenerDescripcion();
    int ObtenerPotencia(float decilitrosCombustible);
    int ObtenerIncrementoVelocidad(float decilitrosCombustible);
}