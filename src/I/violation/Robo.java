package I.violation;

public class Robo {

    private String nome;
    private boolean possuiAntena;

    public Robo(String nome, boolean possuiAntena) {
        this.nome = nome;
        this.possuiAntena = possuiAntena;
    }

    public void girarEmTorno() {
        System.out.println(this.nome + ": Girando");
    }

    public void rotacionarBracos() {
        System.out.println(this.nome + ": Rotacionando");
    }

    public void balancarAntenas() throws Exception {
        if (this.possuiAntena == true)
            System.out.println(this.nome + ": Balancando antena");
        else
            throw new Exception(this.nome + ": Não possuo antena");
    }
}
