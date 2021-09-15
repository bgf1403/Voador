public class Pato implements Voador {

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    private int energia = 0;


    @Override
    public void voar() {
        this.setEnergia(this.getEnergia()-5);
        System.out.println("Energia do Pato: " + this.getEnergia());
        System.out.println("Estou voando como um pato");
    }
}
