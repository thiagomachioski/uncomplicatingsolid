package I.refactoring.exercicio.base.impl;

import I.refactoring.exercicio.base.RoboAbstract;
import I.refactoring.exercicio.base.IRoboComAntenas;
import I.refactoring.exercicio.base.IRoboComBracos;
import I.refactoring.exercicio.base.IRoboGiratorio;

public class RoboSam extends RoboAbstract implements IRoboGiratorio, IRoboComBracos, IRoboComAntenas {

    public RoboSam(String nome) {
        super(nome);
    }

    @Override
    public void balancarAntenas() {
        System.out.println(getNome() + ": Balancando antena");
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
