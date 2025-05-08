package ExArrayListForma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Cilindro(1,1,1,1));
        lista.add(new Circulo(2,2,2));
        lista.add(new Cilindro(3,3,3,3));

        for(Forma forma : lista){
            System.out.println(forma.getClass().getSimpleName());
            System.out.println(forma);
            System.out.println("Área = "+forma.calcularArea());
            if(forma instanceof Cilindro){
                System.out.println("Volume = "+((Volume) forma).calcularVolume());
            }
            System.out.println("-------------------------");
        }
    }
}

