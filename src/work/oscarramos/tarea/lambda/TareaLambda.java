package work.oscarramos.tarea.lambda;

import java.util.Arrays;
import java.util.function.Function;

public class TareaLambda {
    public static void main(String[] args) {
        Integer[] numero = {1,2,9,4,5,168,3,50,60,70};

        Function<Integer[],Integer> f1 = num -> Arrays.stream(num).reduce(Integer.MIN_VALUE,(a,b) ->{
            if(a>b){
                return a;
            }else{
                return b;
            }
        });

        System.out.println("El numero mayor es : " + f1.apply(numero));
    }
}


