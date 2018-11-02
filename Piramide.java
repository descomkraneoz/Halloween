public class Piramide {
    private final int alturaPiramide;
    private static char SIMBOLO='*';
    private static final char ESPACIO_EN_BLANCO=' ';

    public Piramide(int alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }

    Piramide(){
        this.alturaPiramide=3;
        SIMBOLO='*';
    }

    public int getAlturaPiramide() {
        return alturaPiramide;
    }

    public static char getSIMBOLO() {
        return SIMBOLO;
    }

    public static void setSIMBOLO(char SIMBOLO) {
        Piramide.SIMBOLO = SIMBOLO;
    }

    public static char getEspacioEnBlanco() {
        return ESPACIO_EN_BLANCO;
    }

    public String dibujaPiramide(){
        String salida="";

        for (int i = 1; i <=getAlturaPiramide() ; i++) {
            salida+="\n";
            // j=espacios;
            for (int j = getAlturaPiramide()-i; j >0 ; j--) {
                salida+=getEspacioEnBlanco();
            }
            //k=lineas
            for (int k = 1; k < 2*i; k++) {
                salida+=getSIMBOLO();
            }
        }
        return salida;
    }

    public String dibujarPiramideInvertida(){
        String salida="";

        for (int i = getAlturaPiramide(); i >0 ; i--) {
            salida+="\n";
            // j=espacios;
            for (int j = getAlturaPiramide()-i; j >0 ; j--) {
                salida+=getEspacioEnBlanco();
            }
            //k=lineas
            for (int k = 1; k < 2*i; k++) {
                salida+=getSIMBOLO();
            }
        }
        return salida;

    }
}
