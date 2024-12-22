
/*
 * Imprime los números del 1 al 100.
 * Para los múltiplos de 3, imprime "Fizz".
 * Para los múltiplos de 5, imprime "Buzz".
 * Para los múltiplos de ambos, imprime "FizzBuzz".
 */


public class FizzBuzz {
    public void ejecutarFizzBuzz() {
    for (int i = 1; i <= 100; i++){
        if (i % 3 == 0 && i % 5 == 0){
            System.out.println(i+ "=" + "FizzBuzz");
        }
       if (i%3==0 ){
           System.out.println(i+ "=" + "fIZZ");
       }
       else if (i%5==0 ){
           System.out.println(i+ "=" + "BUZZ");
       }

       else {
           System.out.println(i+ "=" + "ninguno");
        }
       }
    }
}
