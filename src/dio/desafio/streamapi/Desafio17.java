package dio.desafio.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 17 - Filtrar os números primos da lista
        List<Integer> primos = numeros.stream()
                .filter(n -> {
                    if (n <= 1) {
                        return false;
                    }
                    for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .collect(Collectors.toList());
        System.err.println("Lista de números primos:" + primos);

    }
}
