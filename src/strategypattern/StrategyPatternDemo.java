package strategypattern;

public class StrategyPatternDemo {
    
    public static void main(String[] args)
    {
        Vehiculo v = new Vehiculo();
        v.ConduccionDeportiva();
        v.Acelerar(2.4f);

        System.out.println("");

        v.ConduccionNormal();
        v.Acelerar(2.4f);
    }
}