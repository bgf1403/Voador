public class Pato implements Voador {

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    private int energia = 100;


    @Override
    public void voar() {

        System.out.println(energia - 5);
        System.out.println("Estou voando como um pato");
    }
}
