import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Mariana");
        nomes.add("André");
        nomes.add("Paulo");
        nomes.add("Carla");
        nomes.add("Matheus");

        System.out.println("Nomes antes de ordenar: " + nomes);
        Collections.sort(nomes);
        System.out.println("Nomes depois de ordenar: " + nomes);
    
         System.out.println("\nCollections.binarySearch() Juliana: " + Collections.binarySearch(nomes, "Juliana"));
        System.out.println("Collections.binarySearch() Carla: " + Collections.binarySearch(nomes, "Carla"));

        ArrayList<String> nomes2 = new ArrayList<>();
        nomes2.add("Mariana");
        nomes2.add("Andreia");
        nomes2.add("Carlos");
        nomes2.add("Miguel");
        nomes2.add("Paulo");

        /* String n = "Jose";
        n.toUpperCase(); */

        System.out.println("\nNomes antes de ordenar: " + nomes2);
        Collections.sort(nomes2);
        System.out.println("Nomes depois de ordenar: " + nomes2);

        System.out.println("\nOS conjuntos não possuem nomes em comum? " + Collections.disjoint(nomes, nomes2) + "\n");

        nomes2.add("Mariana");        
        System.out.println("Exibindo a frequencia de valores: " + Collections.frequency(nomes2, "Mariana") + "\n");

        System.out.println("O maior valor encontrado em nomes2 é: " + Collections.max(nomes2) +
         "\nO menor valor encontrado em nomes é: " + Collections.min(nomes) + "\n");


        Collections.reverse(nomes2);
        System.out.println("ArrayList nomes2 invertido: " + nomes2);

    }
}
