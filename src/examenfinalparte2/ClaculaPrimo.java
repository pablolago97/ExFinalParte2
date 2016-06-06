package examenfinalparte2;

import javax.swing.JOptionPane;

public class ClaculaPrimo {
    
    //Variable 'static' declarada fuera de los argumentos
    /**
     * Variable tipo 'boolean' declarada fuera de los argumentos con valor 'static'
     */
    public static boolean numeroPrimo = false;

    public static void main(String arg[]) {
        
        //Variables
        /**
         * Variable 'digitos' declarada
         */
         
        int digitos;
        
        //Ejecución
        /**
         * Salida por pantalla de una ventana emergente para dar valor a la variable declarada anteriormente
         */
        digitos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de dígitos del los números:"));
        if (digitos <= 0) {
            /*Posible mejora con un bucle 'while' para evitar su ejecución reiterada*/
            JOptionPane.showMessageDialog(null, "Ingrese como parámetro, un numero de digitos correcto (mayor que 0). Ejecute de nuevo el programa");
        }
        /**
         * Llamada del metodo 'CalcularPrimo' directamente de la clase por su estado 'public'
         */
        
        Metodos.CalcularPrimo(digitos);
    }
}
