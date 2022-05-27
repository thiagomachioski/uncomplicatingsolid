package D.refactoring.config;

public abstract class ExemploBase implements IExemplo {
    String nomeExemplo;

    public ExemploBase(String nomeExemplo) {
        this.nomeExemplo = nomeExemplo;
    }

    private static void darEspacos() {
        System.out.println("\n\n\n");
    }

    public void executarExemplo() {
        darEspacos();
        System.out.println("EXECUTANTO O EXEMPLO: " + nomeExemplo + "\n");
        exemplo();
        darEspacos();
    }
}
