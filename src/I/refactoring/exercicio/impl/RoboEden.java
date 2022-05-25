package I.refactoring.exercicio.impl;

import I.refactoring.exercicio.abstracts.RoboAbstract;
import I.refactoring.exercicio.interfaces.IRoboComBracos;
import I.refactoring.exercicio.interfaces.IRoboGiratorio;

public class RoboEden extends RoboAbstract implements IRoboGiratorio, IRoboComBracos {

    public RoboEden(String nome) {
        super(nome);
    }

    @Override
    public void rotacionarBracos() {
        System.out.println(getNome() + ": Rotacionando");
    }

    @Override
    public void girarEmTorno() {
        System.out.println(getNome() + ": Girando");
    }
}
