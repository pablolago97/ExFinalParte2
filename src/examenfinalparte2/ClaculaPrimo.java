package examenfinalparte2;

import javax.swing.JOptionPane;

public class ClaculaPrimo {
    
    //Variable 'static' declarada fuera de los argumentos
    
    public static boolean numeroPrimo = false;

    public static void main(String arg[]) {
        
        //Variables
        int digitos;
        
        //Ejecución
        digitos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de dígitos del los números:"));
        if (digitos <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese como parámetro, un numero de digitos correcto (mayor que 0). Ejecute de nuevo el programa");
        }
        Metodos.CalcularPrimo(digitos);
    }
}
