package ExArrayTeste;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto(1, "A"));
        lista.add(new Produto(2, "B"));
        lista.add(0, new Produto(3, "C"));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).id);
        }

        System.out.println(" ");

        for(Produto p : lista){
            System.out.println(p.nome);
        }

        System.out.println(" ");

        System.out.println(lista);
    }
}