package S.refactoring;

/**
 * SRP refactoring
 * Classe segue o Princípio da Responsabilidade Única
 */
public class RoboMotorista {
    
    private String destino;
    private String carro;

    public RoboMotorista(String destino, String carro) {
        this.destino = destino;
        this.carro = carro;
    }

    public void dirigir() {
        /** implementação */
    }

}
