package D.violation;

public class RoboChefFacade {

    private BracoCortadorDePizza bracoCortadorDePizza;

    public RoboChefFacade() {
        this.bracoCortadorDePizza = new BracoCortadorDePizza();
    }

    public void cortarPizza(String pizza) {
        String pizzaCortada = bracoCortadorDePizza.cortar(pizza);
        System.out.println(pizzaCortada);
    }
}
