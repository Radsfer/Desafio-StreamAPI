package dio.desafio.streamapi;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 15 - Verifique se a lista contém pelo menos um número negativo
        Boolean algumNegativo = numeros.stream()
                .anyMatch(n -> n < 0);
        System.out.println("Tem algum número negátivo na lista? R: " + algumNegativo);

    }
}
