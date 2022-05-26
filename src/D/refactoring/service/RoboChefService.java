package D.refactoring.service;

import D.refactoring.bracos.IBracoCortador;

public class RoboChefService {
    private IBracoCortador bracoCortador;
    public RoboChefService(IBracoCortador bracoCortador) {
        this.bracoCortador = bracoCortador;
    }

    public void cortarPizza(String pizza) {
        String pizzaCortada = bracoCortador.cortar(pizza);
        System.out.println(pizzaCortada);
    }
}
