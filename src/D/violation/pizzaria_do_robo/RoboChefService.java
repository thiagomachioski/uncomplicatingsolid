package D.violation.pizzaria_do_robo;

public class RoboChefService {

    private BracoCortadorDePizza bracoCortadorDePizza;

    public RoboChefService() {
        this.bracoCortadorDePizza = new BracoCortadorDePizza();
    }

    public void cortarPizza(String pizza) {
        String pizzaCortada = bracoCortadorDePizza.cortar(pizza);
        System.out.println(pizzaCortada);
    }
}
