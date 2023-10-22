package org.example.calc;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calclulator.sum(1,0.2));
        System.out.println(Calclulator.multiply(1,0.2));
        System.out.println(Calclulator.divide(1,0));
        System.out.println(Calclulator.sub(1,0.2));

        String[] ar1 = {"2","2"};
        String[] ar2 = {"2","2"};

        Integer[] ar3 = {2,2};
        Integer[] ar4 = {1,2,3};

        System.out.println(compareArrays(ar1,ar2));
        System.out.println(compareArrays(ar3,ar4));
        System.out.println(compareArrays(ar1,ar3));

        Pair pair = new Pair(1,"str");
        System.out.println(pair.toString());
    }

    public static  <T> boolean compareArrays(T[] myArray1, T[]myArray2){
        if (myArray1.length == myArray2.length){
            for (int i = 0; i < myArray1.length; i++) {
                if (!myArray1[i].equals(myArray2[i]))
                    return false;
            }
            return true;
        }
        return false;
    }

    public static class Pair<T,K>{
        private final T param;
        private final K param2;

        public Pair(T param, K param2) {
            this.param = param;
            this.param2 = param2;
        }

        public T getFirst(){
            return param;
        }
        public K getSecond(){
            return param2;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "param=" + param +
                    ", param2=" + param2 +
                    '}';
        }
    }
}
