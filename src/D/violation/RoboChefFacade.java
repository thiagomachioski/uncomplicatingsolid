package D.violation;

public class RoboChefFacade {

    private final BracoCortadorPizzaComSerra bracoCortadorPizzaComSerra = new BracoCortadorPizzaComSerra();

    public void cortarPizza(String pizza) {
        String pizzaCortada = this.bracoCortadorPizzaComSerra.cortar(pizza);
        System.out.println(pizzaCortada);
    }

}
