package strategypattern;

public class Contexto
{
    // Referencia a la interfaz
    private ITipoConduccion tipoConduccion;
 
    // Propiedad que establecerá un nuevo tipo de conducción (cambio de estrategia)
    public ITipoConduccion getTipoConduccion()
    {
        return tipoConduccion;
    }
    
    public void setTipoConduccion(ITipoConduccion tipoConduccion)
    {
        this.tipoConduccion = tipoConduccion;
    }
 
    // Métodos de servicio (invocan los métodos implementados por las estrategias)
    public String ObtenerDescripcion()
    {
        return tipoConduccion.ObtenerDescripcion();
    }
 
    public int IncrementarVelocidad(float combustible)
    {
        return tipoConduccion.ObtenerIncrementoVelocidad(combustible);
    }
 
    public int IncrementarPotencia(float combustible)
    {
        return tipoConduccion.ObtenerPotencia(combustible);
    }
}