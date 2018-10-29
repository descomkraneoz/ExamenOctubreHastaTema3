import javax.swing.*;

public class SegundaPregunta {

    /* Hacer un programa que muestre los numeros del 1 al 100
    en una tabla de 10x10. Que salga bonita

    salida en consola y Joptionpane
     */

    public static void main(String[] args) {

        int numeroPrimero=1;
        String salida="";
        salida+="<html><table width=\"100%\" heigth=\"100%\" border=\"1\" bordercolor=\"#0000FF\" cellspacing=\"10\" cellpadding=\"10\"><tr>";

        for (int j = 0; j < 10; j++) {

            for (int i = numeroPrimero; i < numeroPrimero+10; i++) {
                salida+="<td>"+i+"</td>";
            }
            salida+="</tr>";
            numeroPrimero+=10;
        }

        salida+="</table></html>";

        System.out.println(salida);
        JOptionPane.showMessageDialog(null,salida,"Tabla 10x10",JOptionPane.INFORMATION_MESSAGE);

    }

}
