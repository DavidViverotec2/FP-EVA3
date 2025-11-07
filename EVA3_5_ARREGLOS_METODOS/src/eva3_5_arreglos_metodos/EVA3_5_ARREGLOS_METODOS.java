package eva3_5_arreglos_metodos;

public class EVA3_5_ARREGLOS_METODOS {
    
    public static void main(String[] args) {
        int[] miArreglo;
        miArreglo = crearArreglo(10,100);
        imprimirArreglo(miArreglo);
    }
    
   // CREAR UN ARREGLO Y LO DEVUELVA LLENO DE VALORES ALEATORIOS 
   public static int[] crearArreglo(int tamaño, int valorAleatorio) {
       int resu[] = new int[tamaño];
       for (int i = 0; i < tamaño; i++) {
           resu[i] = (int) (Math.random() * valorAleatorio);
       }
       return resu;
   }
   
   // IMPRIMIR EL ARREGLO
   public static void imprimirArreglo(int[] arreglo) {
       for (int i = 0; i < arreglo.length; i++) {
           System.out.print("[" + arreglo[i] + "]");
       }
       System.out.println("");
   }
}
