
package com.mycompany.actfor;

public class Actfor {

    public static void main(String[] args) {
        int arreglo[] = {4, 15, 1, 10, 30, 8, 2};
        int arreglo2[] = new int [arreglo.length];
        int mayor = 0, pos = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j =0; j < arreglo.length; j++) {
                if (mayor < arreglo[j]){
                    mayor = arreglo[j];
                    pos = j;
                }
            }
            arreglo2[i] = mayor;
            arreglo[pos] = 0;
            mayor = 0;
            System.out.println(arreglo2[i]); 
        }
    }
}
