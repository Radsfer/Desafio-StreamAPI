package dio.desafio.streamapi;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // 8 - Somar os dígitos de todos os números da lista
        int somaDigitos = numeros.stream()
                .map(n -> {
                    int soma = 0;
                    while (n > 0) {
                        soma += n % 10;
                        n /= 10;
                    }
                    return soma;
                })
                .reduce(0, Integer::sum);

        System.out.println("A soma dos dígitos de todos os números é: " + somaDigitos);

    }
}
