package examenfinalparte2;

import javax.swing.JOptionPane;

public class ClaculaPrimo {

    public static boolean numeroPrimo = false;

    public static void main(String arg[]) {
        int digitos;
        int numDigitos;
        digitos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de dígitos del los números:"));
        if (digitos <= 0) {
            JOptionPane.showMessageDialog(null,"Ingrese como parámetro, un numero de digitos correcto (mayor que 0). Ejecute de nuevo el programa");
            
        }
        
        for (int i = 1; i <= 99999; i++) {
            int division = i;

            int contador = 0;

            while (division != 0) {
                division = division / 10;
                contador++;
            }
            numDigitos = contador;

            if (numDigitos == digitos) {
                if (i < 4) {
                    numeroPrimo = true;
                } else {
                    if (i % 2 == 0) {
                        numeroPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            numeroPrimo = true;
                        }
                    }
                }

                if (numeroPrimo == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
