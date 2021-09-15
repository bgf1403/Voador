public class TorreDeControle {

    private static Voador[] voador = new Voador[10];

    public static void addVoador(Voador umVoador) {
        for(int i= 0; i< voador.length; i++) {
            if(voador[i] == null) {
                voador[i] = umVoador;
                break;
            }
        }
    }

    public static void voemTodos() {
        for(int i = 0; i < voador.length; i++) {
            if(voador[i] == null) {
                break;
            } else {
                voador[i].voar();
            }
        }
    }

    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.setEnergia(100);


        Aviao aviao = new Aviao();
        aviao.setHorasDeVoo(10);

        SuperHomem superhomem = new SuperHomem();
        superhomem.setExperiencia(10);

        TorreDeControle torredecontrole = new TorreDeControle();

        torredecontrole.addVoador(pato);
        torredecontrole.addVoador(aviao);
        torredecontrole.addVoador(superhomem);

        torredecontrole.voemTodos();
    }
}
