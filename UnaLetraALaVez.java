import javax.swing.*;

public class UnaLetraALaVez {
    public static void main(String[] args) {

        String mensaje=JOptionPane.showInputDialog("Introduce tu mensaje: ");
        String salida="";
        salida+="Tu mensaje tiene "+mensaje.length()+" caracteres\n";
        salida+="El primer caracter en la posición 0 es "+"\'"+mensaje.charAt(0)+"\'.\n";
        salida+="El último caracter en la posición "+mensaje.length()+" es "+"\'"+mensaje.charAt(mensaje.length()-1)+"\'\n";
        salida+="A continuación se muestra el mensaje ordenando todos los caracteres y espacios en blanco: \n";

        for (int i = 0; i <mensaje.length() ; i++) {
            int contador=0;
            contador=contador+i;
            salida+=contador+" - "+mensaje.charAt(i)+"\n";

        }
        int posicionLetra=0;
        int numeroDeLetras=0;
        char letraBuscar=JOptionPane.showInputDialog("Introduce el caracter a buscar en el mensaje: ").charAt(0);
        String mensajeMinusculas=mensaje.toLowerCase();
        posicionLetra=mensajeMinusculas.indexOf(letraBuscar);
        while (posicionLetra!=-1){
            numeroDeLetras++;
            posicionLetra=mensajeMinusculas.indexOf(letraBuscar,posicionLetra+1);
        }

        salida+="Tu mensaje contiene la letra 'a' "+numeroDeLetras+" veces. ¿No es eso interesante?";

        System.out.println(salida);
        JOptionPane.showMessageDialog(null,salida);

    }
}
