package eva3_8_paso_referencia;

public class EVA3_8_PASO_REFERENCIA {

    public static void main(String[] args) {
        int[] datos = new int[1];
        datos[0] = 5;
        
        System.out.println(datos);
        System.out.println("Original = " + datos[0]);
        incrementar(datos);
        System.out.println("Despues de aumnetar = " + datos[0]);
    }
    
    // Incrementa un valor en 1
    public static void incrementar(int[] arreglo) {
        System.out.println(arreglo);
        for ( int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] + 1;
        }
    }
}
