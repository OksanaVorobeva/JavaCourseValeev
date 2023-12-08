package lesson5.generic;

public class Main {
    public static void main(String[] args) {
        Shmoption<String>present=new Shmoption<>("yes");
        Shmoption<String> absent =new Shmoption<>(null);
        System.out.println(present.isPresenter());
        System.out.println(present.get());
        System.out.println(absent.isPresenter());
        System.out.println(absent.orElse("no"));

        Shmoption<Object> present1 =new Shmoption<>("yes");
        System.out.println(present1.isPresenter());
        Object value = present1.get();
        System.out.println(value);
        present1.set(null);

        Shmoption<Object> present2 =new Shmoption<>("yes");
        System.out.println(present2.isPresenter());
        Object value2 = present1.get();
        System.out.println(value);
        present1.set(123);

        Shmoption<? extends Number> number=new Shmoption<>(123);
        Number n =number.get();

        NumberShmoption<?> numberShmoption = new NumberShmoption<>(123);
        Number n2 = number.get();

        IntegerShmoption integerShmoption = new IntegerShmoption(123);
        Integer i= integerShmoption.get();
        integerShmoption.set(124);



    }


}
