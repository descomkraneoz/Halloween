public class PiramideNumerica {
    private final int filasPiramide;
    private static final char ESPACIO_EN_BLANCO=' ';

    public PiramideNumerica(int filasPiramide) {
        this.filasPiramide = filasPiramide;
    }

    public int getFilasPiramide() {
        return filasPiramide;
    }

    public static char getEspacioEnBlanco() {
        return ESPACIO_EN_BLANCO;
    }

    public String dibujaPiramide(){
        String salida="";
        int contador=0;
        for (int i = 1; i <=getFilasPiramide() ; i++) {
            salida+="\n";
            for (int j = 0; j <i ; j++) {
                contador++;
                salida+=" "+contador;
            }contador=0;
        }
        return salida;
    }

    public String dibujarPiramideInvertida(){
        String salida="";
        int contador=0;

        for (int i = getFilasPiramide(); i >0 ; i--) {
            salida+="\n";
            for (int j = 0; j <i ; j++) {
                contador++;
                salida+=" "+contador;
            }contador=0;

        }
        return salida;

    }
}
