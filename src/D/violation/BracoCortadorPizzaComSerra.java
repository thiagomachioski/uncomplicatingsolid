package D.violation;

public class BracoCortadorPizzaComSerra {

    public String cortar(String pizza) {
        String pizzaCortada = pizza.replaceAll("_", " ");
        return pizza + " -- cortada com serra ->  " + pizzaCortada;
    }
}
