import java.util.Arrays;

public final class Example {

    public static void main(String[] args) {
        var sum = 1+1; //int sum
        
        var bool = true;

        var list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            for (var item : list) {
                var m = item + 2;
                System.out.println(m);
        }

        var nulo = null;

        var semInicializar;

        var runnable = getRunnable();


    }


    static void sum(var a, var b){
        return 1;
    }

    static Runnable getRunnable() {
        return () -> {};
    }




}