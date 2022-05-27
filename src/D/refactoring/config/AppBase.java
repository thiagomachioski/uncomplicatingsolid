package D.refactoring.config;

public abstract class AppBase implements IApp {
    String nomeExemplo;

    public AppBase(String nomeExemplo) {
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
