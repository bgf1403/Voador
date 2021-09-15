public class SuperHomem implements Voador{

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    private int experiencia = 0;

    @Override
    public void voar() {

        this.setExperiencia(this.getExperiencia()+3);
        System.out.println("Experiência do Super-Homem: " + this.getExperiencia());
        System.out.println("Estou voando como um campeão");
    }
}
