package D.refactoring.bracos.impl;

import D.refactoring.bracos.IBracoCortador;

public class BracoCortadorPizza implements IBracoCortador {

    @Override
    public String cortar(String pizza) {
        String pizzaCortada = pizza.replaceAll("_", " ");

        return pizza + " -- cortada ->  " + pizzaCortada;
    }
}
