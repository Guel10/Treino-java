package Semana1.Wrappers;

public class Conversao_intValue {
    public static void main(String[] args) {
        Integer num = Integer.valueOf(100);
        int numPrimitivo1 = num.intValue();

        System.out.println((numPrimitivo1));

        Double numdouble = Double.valueOf(3.14);
        double numPrimitivo2 = numdouble.doubleValue();

        System.out.println(numPrimitivo2);
    }
}

