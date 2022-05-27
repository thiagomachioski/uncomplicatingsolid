package D.refactoring;

import D.refactoring.config.ExemploBase;
import D.refactoring.config.impl.DIPExemploImpl;

public class App  {

    public static void main(String[] args) {
        DIPExemploImpl exemploInversaoDaDependencia = new DIPExemploImpl();

        executarExemplo(exemploInversaoDaDependencia);
    }

    private static void executarExemplo(ExemploBase base) {
        base.executarExemplo();
    }

}
