package lesson10;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(0x01);
        baos.write(0x02);
        baos.write(0x03);
        byte[] result = baos.toByteArray();
        System.out.println(Arrays.toString(result));
    }
}
