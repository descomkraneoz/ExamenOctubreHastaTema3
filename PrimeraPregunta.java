import javax.swing.*;

public class PrimeraPregunta {

    /* Hacer un programa que pida dos números y que imprima
    la suma de todos los numeros impares que van del primero
    al segundo y diga cuantos hay */

    public static void main(String[] args) {

        int limiteInferior=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero: "));

        int limiteSuperior=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero: "));


        int contadorImpares=0;
        int sumaImpares=0;

        if(limiteInferior<limiteSuperior) {
            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                if (i % 2 != 0) {
                    contadorImpares++;
                    sumaImpares += i;
                }
            }
        }else {
            for (int i = limiteSuperior; i <= limiteInferior; i++) {
                if (i % 2 != 0) {
                    contadorImpares++;
                    sumaImpares += i;
                }
            }
        }
        String salida="Entre el "+limiteInferior+" y el "+limiteSuperior+"\n";
        salida+="La suma de los impares es "+sumaImpares+"\n";
        salida+="La cantidad de impares es de: "+contadorImpares;
        System.out.println(salida);

    }

}
