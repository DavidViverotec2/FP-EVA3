package eva3_1_metodos;
public class EVA3_1_METODOS {
    public static void main(String[] args) {
        // Invocar al metodo
        // Llamada al procedimiento o funcion
        // 1. Si queremos recuperar el valor
        int resu = calcularCuadrado(4);
        System.out.println("El cuadrado de 4 es " + resu);
        
        // 2. Usar el valor sin guardarlo
        System.out.println("El cuadrado de 4 es " + calcularCuadrado(4));
    }
    
    // Modificadores
    // Modificador de acceso: public, privade, pretected, default
    // static --> Se necesitan para usar nuestros metodos en el main
    // public static
            // Valor de retorno ( tipo de dato )
              // Nombre del metodo ( usar verbo)
                // Lista de parametros
                // 0 o N cantidad
    public static int calcularCuadrado(int num){ // Encabezado del metodo ( Header )
        // {} --> Implementacion del metodo ( Cuerpo del metodo)
        int cuadrado = num * num;
        return cuadrado;
        // Ya no se puede poner codigo aqui
    }  
}
