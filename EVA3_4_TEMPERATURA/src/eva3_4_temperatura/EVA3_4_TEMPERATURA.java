package eva3_4_temperatura;

import java.util.Scanner;

public class EVA3_4_TEMPERATURA {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do{
            imprimirMenu();
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("** Convertir de grados Fahrenheit a Celsius **");
                    mostrarFarCelsius();
                    break;
                case 2:
                    System.out.println("** Convertir de grados Fahrenheit a Kelvin **");
                    mostrarFarKelvin();
                    break;
                case 3:
                    System.out.println("** Convertir de grados Celsius a Kelvin **");
                    mostrarCelKelvin();
                    break;
                    
        }}while(opcion != 4);
        System.out.println("Hasta Luego");
        }
    
    public static void imprimirMenu(){
        System.out.println("-- BIENVENIDO AL SISTEMA --");
        System.out.println("1. Convertir de grados Fahrenheit a Celsius");
        System.out.println("2. Calcular una potencia");
        System.out.println("3. Imprimir un mensaje");
        System.out.println("4. Terminar");
        System.out.print("Elige la opcion que ocupes: ");
        System.out.println("");
    }
    
    public static void mostrarFarCelsius() {
        Scanner entrada = new Scanner(System.in);
        int grados;
        
        System.out.println("Vamos a realizar la convercion");
        System.out.print("Ingresa los grados: ");
        grados = entrada.nextInt();

        double resu = convertirFarCelsius(grados);    
        System.out.println(grados + " grados Fahrenheit = " + resu + " grados Celsius");
        System.out.println("");
    }

    
    public static double convertirFarCelsius(double farCel) {
        double resu = (farCel - 32) / 1.8;
        return resu;
    }
    
    public static void mostrarFarKelvin() {
        Scanner entrada = new Scanner(System.in);
        int grados;
        
        System.out.println("Vamos a realizar la convercion");
        System.out.print("Ingresa los grados: ");
        grados = entrada.nextInt();

        double resu = convertirFarKelvin(grados);    
        System.out.println(grados + " grados Fahrenheit = " + resu + " grados Kelvin");
        System.out.println("");
    }
    
    public static double convertirFarKelvin(double farKel) {
        double resu = (((farKel - 32) / 1.8)+273.15);
        return resu;
    }
    
    public static void mostrarCelKelvin() {
        Scanner entrada = new Scanner(System.in);
        int grados;
        
        System.out.println("Vamos a realizar la convercion");
        System.out.print("Ingresa los grados: ");
        grados = entrada.nextInt();

        double resu = convertirFarKelvin(grados);    
        System.out.println(grados + " grados Celsius = " + resu + " grados Kelvin");
        System.out.println("");
    }
    
    public static double convertirCelKelvin(double celKel) {
        double resu = (celKel + 273.15);
        return resu;
    }
}
