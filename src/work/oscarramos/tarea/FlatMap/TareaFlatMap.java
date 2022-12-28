package work.oscarramos.tarea.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TareaFlatMap {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};


        List<String> resultado = Arrays.stream(lenguajes)
                .flatMap(Stream::of)
                .distinct()
                .collect(Collectors.toList());

        resultado.forEach(System.out::println);
    }
}
