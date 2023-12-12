package lesson8;

import java.util.function.IntSupplier;

public class Main {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello world1");
        r.run();

        run(() -> System.out.println("Hello world2"));

        Object x = (Runnable) (() -> System.out.println("Hello world3"));

        IntSupplier l1 = () -> 5;
        //IntSupplier l4=()-> System.out.println();
        // Runnable l2 = () -> 5;
        Runnable l3 = () -> System.out.println();
        //IntSupplier x2=()->{while (true){}};
        //System.out.println(x2.getAsInt());
        Main main=new Main();
        main.test();

    }


    public static void run(Runnable r) {
        r.run();
    }

    //Захват значения
    int field=10;
    static int sFrield=15;
     void test(){
         int var=5;
         Runnable r1=()-> System.out.println(var);
         Runnable r2=()-> System.out.println(field);
         Runnable r3=()-> System.out.println(sFrield);
         field=5;
         sFrield=5;
         r1.run();
         r2.run();
         r3.run();
     }

}
