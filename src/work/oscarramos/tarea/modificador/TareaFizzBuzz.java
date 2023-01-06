package work.oscarramos.tarea.modificador;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Escriba un programa que imprima los números del 1 al 100 y para múltiplos de '3' imprima "Fizz" en lugar del número y para los múltiplos de '5' imprima "Buzz".


public class TareaFizzBuzz {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
