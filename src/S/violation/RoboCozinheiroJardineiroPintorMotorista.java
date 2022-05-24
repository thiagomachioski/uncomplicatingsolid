package S.violation;

/**
 * SRP Violation
 * Violação do Princípio da Responsabilidade Única
 */
public class RoboCozinheiroJardineiroPintorMotorista {

    private String tempero;
    private String comida;
    private String planta;
    private String adubo;
    private String parede;
    private String tinta;
    private String destino;
    private String carro;


    public RoboCozinheiroJardineiroPintorMotorista(
            String tempero, String comida,
            String planta, String adubo,
            String parede, String tinta,
            String destino, String carro) {

        this.tempero = tempero;
        this.comida = comida;
        this.planta = planta;
        this.adubo = adubo;
        this.parede = parede;
        this.tinta = tinta;
        this.destino = destino;
        this.carro = carro;
    }

    public void cozinhar() {
        /** implementação */
    }

    public void plantar() {
        /** implementação */
    }

    public void pintar() {
        /** implementação */
    }

    public void dirigir() {
        /** implementação */
    }

}