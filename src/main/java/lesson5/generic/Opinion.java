package lesson5.generic;

import java.util.NoSuchElementException;

public class Opinion<T> {
    //a box which is either empty or contains a non-null value

    T value;

    //passing null means absent value
    public Opinion(T value) {
        this.value = value;
    }

    //never returns null
    public T get() {
        if (value==null) throw  new NoSuchElementException();
        return value;
    }

    public  T orElse(T other){
        return  value==null?other:value;
    }

    public boolean isPresenter(){
        return  value !=null;
    }
}
