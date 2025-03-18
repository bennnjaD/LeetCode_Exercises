package Medium;

public class SortingAlgorithms {

    public void bubbleSort(int[] numbers) {
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;
            for(int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers [i+1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
    }

    //Defino la variable en true para que se inicie la primer iteracion

    // Recorro hasta numbers.length - 1. Ya que el ultimo numero sera comparado
    // con el anterior

    // Si hubo un swapp debe haber al menos otra iteracion.

    // Se itera hasta que en la ultima iteracion no se haya realizado ningun swapp
    // Eso quiere decir que esta todo ordenado.

}
