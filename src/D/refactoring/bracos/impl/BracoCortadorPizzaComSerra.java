package D.refactoring.bracos.impl;

import D.refactoring.bracos.IBracoCortador;

public class BracoCortadorPizzaComSerra implements IBracoCortador {
    @Override
    public String cortar(String pizza) {
        String pizzaCortada = pizza.replaceAll("_", " ");
        return pizza + " -- cortada com braço de serra ->  " + pizzaCortada;
    }
}
