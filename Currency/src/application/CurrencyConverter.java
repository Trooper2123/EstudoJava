package application;

public class CurrencyConverter {

    private static final double IOF = 1.06;

     protected static double converter(double dayPrice, double qtd){
        return (dayPrice * qtd) * IOF;
    }

}
