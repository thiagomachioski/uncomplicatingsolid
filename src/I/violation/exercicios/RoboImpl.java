package I.violation.exercicios;

public class RoboImpl implements IRobo {

    private final String nome;
    private final boolean possuiAntena;

    public RoboImpl(String nome, boolean possuiAntena) {
        this.nome = nome;
        this.possuiAntena = possuiAntena;
    }

    @Override
    public void girarEmTorno() {
        System.out.println(this.nome + ": Girando");
    }

    @Override
    public void rotacionarBracos() {
        System.out.println(this.nome + ": Rotacionando");
    }

    @Override
    public void balancarAntenas() throws Exception {
        if (this.possuiAntena)
            System.out.println(this.nome + ": Balancando antena");
        else
            throw new Exception(this.nome + ": Não possuo antena");
    }
}
