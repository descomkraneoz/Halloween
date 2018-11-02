public class SecuenciaCollatz {
    private int numeroPedido;

    public SecuenciaCollatz(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    private String calculoSecuencia(){
        String salida="";

        while (getNumeroPedido()!=1){
            if (getNumeroPedido()%2==0){
                salida+=getNumeroPedido()+",";
                numeroPedido=getNumeroPedido()/2;
            }else{
                salida+=getNumeroPedido()+",";
                numeroPedido=(getNumeroPedido()*3)+1;
            }
            if (numeroPedido==1){
                salida+=1;
            }
        }

        return salida;
    }

    public String mostrarCollatz(){
        String salida="El número ingresado es: ";
        salida+=getNumeroPedido()+"\n";
        salida+="La secuencia de Collatz es: ";
        salida+=calculoSecuencia();

        return salida;
    }
}
