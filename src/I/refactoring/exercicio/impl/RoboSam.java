package I.refactoring.exercicio.impl;

import I.refactoring.exercicio.abstracts.RoboAbstract;
import I.refactoring.exercicio.interfaces.IRoboComAntenas;
import I.refactoring.exercicio.interfaces.IRoboComBracos;
import I.refactoring.exercicio.interfaces.IRoboGiratorio;

public class RoboSam extends RoboAbstract implements IRoboGiratorio, IRoboComBracos, IRoboComAntenas{

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
