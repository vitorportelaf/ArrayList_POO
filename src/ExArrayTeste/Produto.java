package ExArrayTeste;

public class Produto {
    int id;
    String nome;

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return id + " " + nome;
    }
}
