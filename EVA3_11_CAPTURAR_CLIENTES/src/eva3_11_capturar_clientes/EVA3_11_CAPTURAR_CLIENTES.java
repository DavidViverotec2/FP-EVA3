package eva3_11_capturar_clientes;

import java.util.Scanner;

public class EVA3_11_CAPTURAR_CLIENTES {

    public static void main(String[] args) {
        String[] clientes = new String[5];
        double[] credito = new double[5];
        capturarClientes(clientes,credito);
        System.out.println("Clientes: ");
        imprimir(clientes);
        System.out.println("Credito: ");
       imprimir(credito);
        System.out.println("Todo: ");
       imprimir(clientes, credito);
    }
    
    public static void capturarClientes(String[] clientes, double credito[]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < clientes.length; i++) {
            System.out.print("Nombre del cliente: ");
            clientes[i] = entrada.nextLine();
            System.out.println("Credito: ");
            credito[i] = entrada.nextDouble();
            entrada.nextLine();
        }
    }
    
    public static void imprimir(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    public static void imprimir(double[] credito) {
        for (int i = 0; i < credito.length; i++) {
            System.out.print("[" + credito[i] + "]");
        }
        System.out.println("");
    }
    
    public static void imprimir(String[] arreglo, double[] credito) {
        for (int i = 0; i < credito.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            System.out.print("[" + credito[i] + "]");
        }
       //  System.out.println("");
    }
    
}
