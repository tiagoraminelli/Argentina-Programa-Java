public class Main {
    public static void main(String[] args) {
       /*Clase 1 - “Desarrollador Java inicial”
		Introducción a Algoritmos y Java
		1. Vamos a practicar operaciones básicas con números
		a. Usando la sentencia while, imprima todos los números entre 2 variables “a”
		y “b”. Su código puede arrancar (por ejemplo):
		int numeroInicio = 5;
		int numeroFin = 14;*/

        //Comentario ironico
        //comentario paradoxico

        /*int numeroInicial = 5;
        int numeroFin = 14;
        int marcador = numeroInicial;
        booleano soloPares = true;*/

        /*while ( marcador <= numeroFin )
        {
            //Todos los numeros:
            //sistema _fuera_ println ( marcador );

            //Pares:
            if ( soloPares && marcador % 2 == 0 )
            {
                sistema _ fuera _ println ( marcador );
            }
            //Enumerador:
            marcador ++;
        }
        */

        /*for (int nuevoMarcador = numeroFin; nuevoMarcador >= 0; nuevoMarcador--) {
            System.out.println(nuevoMarcador);
        }*/

        float ingresos = 2112409;
        int superficie  = 50;
        int energía = 9000;
        if ((ingresos <= 748382.07) &&
         (superficie <= 30) &&
         (energía <= 3330) ) {
         System.out.println("Categoría A");
         } else if((ingresos <= 1112459.83) &&
         (superficie <= 45) &&
         (energía <= 5000) ) {
         System.out.println("Categoría B");
         }
    }
}








