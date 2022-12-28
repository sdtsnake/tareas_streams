package work.oscarramos.tarea.modificador;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class TareaModificadorStream {
    public static void main(String[] args) {
        AtomicInteger numeros = new AtomicInteger(0);
        Double resultado =   Stream.generate(numeros::incrementAndGet)
                .limit(100)
                .filter(n -> n % 10 !=0) //se filtra los divisibles por 10
                .mapToDouble(Integer::doubleValue) //se convierte el flujo a double
                .map(d-> d/2) // se divide por 2
                .reduce(0,(a,b)->a+b); // se sumarisa los resuldatos

        System.out.println(resultado);
    }
}
