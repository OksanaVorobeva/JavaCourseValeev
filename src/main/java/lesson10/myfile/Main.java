package lesson10.myfile;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        readFile();
        System.out.println("GC");
        System.gc();
        System.out.println("Sleep");
        Thread.sleep(1000);
        System.out.println("Done");
    }

    private static void readFile() {
        MyFile myFile = new MyFile(1);
        myFile.read();
    }
}
