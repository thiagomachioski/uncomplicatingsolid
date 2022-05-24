package O.violation;

/**
 * OCP Violation
 * Violação do Princípio Aberto-Fechado
 */
public class RoboCozinheiro {
    private String nome;
    private String faca;
    private String bolo;
    private String pincel;
    private String parede;

    public RoboCozinheiro(String nome, String faca, String bolo, String pincel, String parede) {
        this.nome = nome;
        this.faca = faca;
        this.bolo = bolo;
        this.pincel = pincel;
        this.parede = parede;
    }

    public String getNome() {
        return this.nome;
    }

    public void cortarBolo() {
        /** implementação */
    }

    public void pintarParede() {
        /** implementação */
    }
}