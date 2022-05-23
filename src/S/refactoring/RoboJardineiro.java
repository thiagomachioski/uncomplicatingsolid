package S.refactoring;

/**
 * SRP refactoring
 * Classe segue o Princípio da Responsabilidade Única
 */
public class RoboJardineiro {

    private String planta;
    private String adubo;
    
    public RoboJardineiro(String planta, String adubo) {
        this.planta = planta;
        this.adubo = adubo;
    }

    public void plantar() {
        /** implementação */
    }
}