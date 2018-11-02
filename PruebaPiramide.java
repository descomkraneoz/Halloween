public class PruebaPiramide {
    public static void main(String[] args) {

        /*Piramide miPiramide=new Piramide(5);
        System.out.println(miPiramide.dibujaPiramide());
        System.out.println(miPiramide.dibujarPiramideInvertida());
        Piramide.setSIMBOLO('$');
        System.out.println(miPiramide.dibujaPiramide());
        Piramide p2=new Piramide();
        System.out.println(p2.dibujarPiramideInvertida());
        Piramide.setSIMBOLO('@');
        System.out.println(p2.dibujaPiramide());*/

        PiramideNumerica p1=new PiramideNumerica(5);
        System.out.println(p1.dibujaPiramide());
        System.out.println(p1.dibujarPiramideInvertida());

    }
}
