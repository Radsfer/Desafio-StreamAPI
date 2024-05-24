package dio.desafio.streamapi;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // 14 - encontrar o maior número primo
        Integer maiorPrimo = numeros.stream()
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
                .max(Integer::compareTo)
                .orElse(null);
        System.out.println("O maior número primo é: " + maiorPrimo);

    }
}
