package Easy;

public class EstructurasCondicionales {
    /*
    Dados tres enteros A,B,C, calcula el numero minimo de intercambios
    que se necesitan para ordenarlos

    Ejemplo:
    Input: 1 2 3
    Output: 0
    Porque los numeros ya estan ordenados

    Input: 3 2 1
    Output: 1
    Basta intercambiar el 1 con el 3 para ordenar los numeros
     */

    public int intercambioMinimo(int a, int b, int c) {
        if (a < b && b < c) {
            return 0;
        }
        if ( (a < b && b > c ) || (a > b && b < c) ) {
            return 1;
        }
        return 2;
    }

//   ----------------------------------------------------------------------------------

    /*
    Dados A, B, C marcar si el orden es ascendente, descendente, todos iguales
    o no hay orden.
    C = Creciente
    D = Descendente
    I = Iguales
    X = Sin orden
     */
    public char detectandoOrden(int a, int b, int c) {
        if (a == b && a == c) {
            return 'I';
        }
        if (a <= b && b <= c) {
            return 'C';
        }
        if (a >= b && b >= c) {
            return 'D';
        }
        return 'X';
    }

//   -------------------------------------------------------------------------------------


}
