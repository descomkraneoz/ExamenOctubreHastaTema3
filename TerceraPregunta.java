import javax.swing.*;

public class TerceraPregunta {

    /* Crear un programa que calcule cuantas cifras tiene un número entero positivo
    (pista:dividir entre 10) Debe mostrar las cifras separadas por guiones.  8765, 8-7-6-5
     */

    public static void main(String[] args) {

        int numeroLeido=4686;
        //numeroLeido=Integer.parseInt(JOptionPane.showInputDialog("Introduce número entero positivo: "));
        boolean esNumero= (numeroLeido >= 0 && numeroLeido <= 999999999);
        String salida= esNumero?"El número leido es: "+numeroLeido+"\n" :" No ha introducido un número válido: "+numeroLeido +"\n";
        String numeroCadena=String.valueOf(numeroLeido);
        salida+="El número introducido tiene "+numeroCadena.length()+" cifras\n";

        while (numeroLeido>=numeroCadena.length()){
            int cifra=numeroLeido%10;
            numeroLeido=numeroLeido/10;
            salida+=cifra;
            if (cifra<=numeroCadena.length()){
                salida+="  ";
            }else{
                salida+=" - ";
            }

        }

        System.out.println(salida);

    }
}
