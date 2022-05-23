package S.refactoring;

/**
 * SRP refactoring
 * Classe segue o Princípio da Responsabilidade Única
 */
public class RoboCozinheiro {

    private String tempero;
    private String comida;

    
    public RoboCozinheiro(String tempero, String comida) {
        this.tempero = tempero;
        this.comida = comida;
    }

    public void cozinhar() {
        /** implementação */
    }

}