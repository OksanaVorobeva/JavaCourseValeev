package lesson10;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[100];
        readFully(System.in, b);
        System.out.println(Arrays.toString(b));
    }
 //вычитать все в массиве заданного размера
    static void readFully(InputStream is, byte[] b) throws IOException {
        int offset = 0;
        while (offset < b.length) {
            int count = is.read(b, offset, b.length - offset);
            if (count == -1) {
                throw new IOException("Stream has less than " + b.length + " bytes");
            }
            offset += count;
        }
    }
}
