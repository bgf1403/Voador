public class Aviao implements Voador{

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    private int horasDeVoo = 0;


    @Override
    public void voar() {

        this.setHorasDeVoo(this.getHorasDeVoo()+13);
        System.out.println("Horas de Vôo do Avião: " + this.getHorasDeVoo());
        System.out.println("Estou voando como um avião");
    }
}
