public class SuperHomem implements Voador{

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    private int experiencia = 100;

    @Override
    public void voar() {
        System.out.println(experiencia+3);
        System.out.println("Estou voando como um campeão");
    }
}
