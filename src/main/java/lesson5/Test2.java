package lesson5;

public class Test2 {
    static class MyException extends Exception{

    }
    static void test() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args)  {
        try {
            test();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
