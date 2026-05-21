import java.util.ArrayList;
import java.util.Collections;

public class ArrayInteiros {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(50);
        inteiros.add(41);
        inteiros.add(0);
        inteiros.add(-1);

        System.out.println("Inteiros antes de ordenar: " + inteiros);
        Collections.sort(inteiros);
        System.out.println("Inteiros depois de ordenar: " + inteiros);
        System.out.println("\nCollections.binarySearch() 10: " + Collections.binarySearch(inteiros, 10));
        System.out.println("Collections.binarySearch() 20: " + Collections.binarySearch(inteiros, 20));

        ArrayList<Integer> inteiros2 = new ArrayList<>();
        inteiros2.add(30);
        inteiros2.add(52);
        inteiros2.add(20);
        inteiros2.add(-10);
        inteiros2.add(100);
        System.out.println("OS conjuntos não possuem valores em comum? " + Collections.disjoint(inteiros, inteiros2) + "\n");

        inteiros2.add(100);        
        System.out.println("Exibindo a frequencia de valores: " + Collections.frequency(inteiros2, 100) + "\n");

        System.out.println("O maior valor encontrado em inteiros 2 é: " + Collections.max(inteiros2) +
         "\nO menor valor encontrado em inteiros 2 é: " + Collections.min(inteiros2) + "\n");

        Collections.reverse(inteiros2);
        System.out.println("ArrayList inteiros2 invertido: " + inteiros2);

    }
}
