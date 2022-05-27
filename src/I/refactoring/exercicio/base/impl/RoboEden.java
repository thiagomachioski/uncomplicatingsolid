package I.refactoring.exercicio.base.impl;

import I.refactoring.exercicio.base.RoboAbstract;
import I.refactoring.exercicio.base.IRoboComBracos;
import I.refactoring.exercicio.base.IRoboGiratorio;

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
