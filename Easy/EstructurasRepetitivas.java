package Easy;

public class EstructurasRepetitivas {
    /*
    Dado un conjunto de *N* datos enteros no negativos, determina el mayor de ellos
     */
    public int elMayorDe(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    /*
    Dado un conjunto de *N* datos enteros no negativos, devuelve el siguiente par:
    el mayor de ellos y su indice
     */
    public int[] elMayorCon(int[] nums) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return new int[] {max, index};
    }
    /*
    Dado un entero regrese la suma de sus digitos
    CON RECURSION
     */
    public int sumaDeDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumaDeDigitos(n / 10);
    }
    /*
    SIN RECURSION
     */
    public int sumaDeDigitos_2(int n) {
        int resultado = 0;
        while (n != 0) {
            resultado = resultado + n % 10;
            n = n / 10;
        }
        return resultado;
    }
    /*
    Dados dos enteros N y M, imprima un rectangulo de tamaño
    N*M asteriscos
    N= renglones
    M= columnas
     */

    public void asteriscos(int n, int m) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.println( "*");
            }
            System.out.println();
        }
    }
    /*
    Realiza un programa que reciba un entero N
    e imprima una pirámide de asteriscos de altura N. Vea los ejemplos de entrada y salida.

    Input: 7
    Output:
              *
             ***
            *****
           *******
          *********
         ***********
        *************

     */
    public void asteriscosPiramidales(int n) {

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
