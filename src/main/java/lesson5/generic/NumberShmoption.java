package lesson5.generic;

public class NumberShmoption <N extends Number> extends  Shmoption<N>{
    public NumberShmoption(N value) {
        super(value);
    }
}
