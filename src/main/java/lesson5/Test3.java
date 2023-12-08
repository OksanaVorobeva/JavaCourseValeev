package lesson5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Test3 {
    //Перебрасывание исключений

     static class MyException extends Exception{
         public  MyException(String message,Throwable cause)
         {
             super(message,cause);
         }
     }
     void  readFile() throws MyException{
         try {
             byte[] betes= Files.readAllBytes(Paths.get("/etc/passwd"));
             System.out.println(Arrays.toString(betes));
         }catch (IOException e){
             throw  new MyException("Unable to read file",e);
         }
     }
}
