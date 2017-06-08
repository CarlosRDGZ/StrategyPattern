package strategypattern;

public class ConduccionDeportiva implements ITipoConduccion
{
    @Override
    public String ObtenerDescripcion()
    {
        return "Conduccion Deportiva";
    }
 
    @Override
    public int ObtenerPotencia(float decilitrosCombustible)
    {
        return (int)(decilitrosCombustible * 0.987) + 5;
    }
    
    @Override
    public int ObtenerIncrementoVelocidad(float decilitrosCombustible)
    {
        return (int)(decilitrosCombustible * 0.618) + 3;
    }
}