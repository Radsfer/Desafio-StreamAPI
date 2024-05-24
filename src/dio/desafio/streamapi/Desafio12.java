package dio.desafio.streamapi;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // 12 - Encontre o produto de todos os número
        int produtoList = numeros.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("O produdo de todos os números é: " + produtoList);

    }
}
