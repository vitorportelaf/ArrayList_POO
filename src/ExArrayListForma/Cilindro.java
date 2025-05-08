package ExArrayListForma;

public class Cilindro extends Forma implements Volume{
    private double altura;

    public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
        super(coordenadaX, coordenadaY, raio);
        this.altura = altura;
    }

    public double calcularVolume(){
        return Math.PI*Math.pow(getRaio(), 2)*altura;
        //return 0;
    }

    @Override
    public double calcularArea() {
        return 2;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux+="Altura: "+altura;
        return aux;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}