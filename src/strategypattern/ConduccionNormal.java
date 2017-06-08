package strategypattern;

public class ConduccionNormal implements ITipoConduccion
{
    @Override
    public String ObtenerDescripcion()
    {
        return "Conduccion Normal";
    }
 
    @Override
    public int ObtenerPotencia(float decilitrosCombustible)
    {
        return (int)(decilitrosCombustible * 0.842) + 3;
    }
 
    @Override
    public int ObtenerIncrementoVelocidad(float decilitrosCombustible)
    {
        return (int)(decilitrosCombustible * 0.422) + 2;
    }
}