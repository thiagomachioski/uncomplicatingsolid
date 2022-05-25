package D.violation;

public class BracoCortadorDePizza {

    public BracoCortadorDePizza() { }

    public static String cortar(String pizza) {
        String pizzaCortada = pizza.replaceAll("_", " ");

        return pizza + " -- cortada ->  " + pizzaCortada;
    }

}
