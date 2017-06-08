package strategypattern;

public class Vehiculo
{
    private Contexto contexto;
 
    public Vehiculo()
    {
        contexto = new Contexto();
    }
 
    public void ConduccionDeportiva()
    {
        ITipoConduccion conduccionDeportiva = new ConduccionDeportiva();
        contexto.setTipoConduccion(conduccionDeportiva);
    }
 
    public void ConduccionNormal()
    {
        ITipoConduccion conduccionNormal = new ConduccionNormal();
        contexto.setTipoConduccion(conduccionNormal);
    }
 
    // Métodos que invocan la funcionalidad implementada por la interfaz
    public void Acelerar(float combustible)
    {
        String descripcion = contexto.ObtenerDescripcion();
        int incrementoVelocidad = contexto.IncrementarVelocidad(combustible);
        int potencia = contexto.IncrementarPotencia(combustible);
 
        System.out.println("Tipo de conducción " + descripcion);
        System.out.println("Combustible inyectado: " + combustible);
        System.out.println("Potencia proporcionada: " + potencia);
        System.out.println("Incremento de velocidad: " + incrementoVelocidad);
    }
}