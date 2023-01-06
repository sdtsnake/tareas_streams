package work.oscarramos.tarea.modificador;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

//Escriba un programa que imprima los números del 1 al 100 y para múltiplos de '3' imprima "Fizz" en lugar del número y para los múltiplos de '5' imprima "Buzz".


public class TareaFizzBuzz {
    public static void main(String[] args) {
        AtomicInteger numeros = new AtomicInteger(0);
        Stream<String> resultado =   Stream.generate(numeros::incrementAndGet)
                .limit(100)
                .flatMap(d-> {
                    String cadena = " ";
                    if(d % 3 == 0){
                        cadena="Fizz";
                    }
                    if(d % 5 ==0){
                        if(!cadena.isBlank()){
                            cadena= cadena + "Buzz";
                        }else{
                            cadena= "Buzz";
                        }
                    }
                    if(cadena.isBlank()){
                        cadena = d.toString();
                    }
                     return Stream.of(cadena);
                });


        resultado.forEach(System.out::println);
    }
}
