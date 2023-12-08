package lesson5.generic;

import java.util.NoSuchElementException;

//A mutable box which is either empty or contains a non-null value
public class Shmoption <T>{
    T value;

    //Passing null means absent value

    public Shmoption(T value) {
        this.value = value;
    }

    //never returns null


    public T get() {
        if (value==null) throw  new NoSuchElementException();
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public  T orElse(T other){
        return  value==null?other:value;
    }

    public boolean isPresenter(){
        return  value !=null;
    }

    static <T> void setNotNull(Shmoption<? super T> shmoption,T value){
        if(value==null) throw  new IllegalArgumentException();
        shmoption.set(value);
    }
}
