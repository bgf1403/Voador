public class Aviao implements Voador{

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    private int horasDeVoo = 100;


    @Override
    public void voar() {
        System.out.println(13+horasDeVoo);
        System.out.println("Estou voando como um avião");
    }
}
