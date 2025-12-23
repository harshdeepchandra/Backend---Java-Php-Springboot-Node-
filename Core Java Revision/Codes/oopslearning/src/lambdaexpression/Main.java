package lambdaexpression;

public class Main {
    public static void main(String[] args) {
        A aObj = new A() {
            @Override
            public Integer sum() {
                return 0;
            }
        };

        //We can do the same with Lambda Expression

        A aObj2 = () -> {
            return 0;
        };

        A aObj3 = () -> 0;

        B bObj = new B() {
            @Override
            public Integer sum(Integer a, Integer b) {
                Integer c = a + b;
                return c;
            }
        };

        B bObj2 = (x, y) -> {Integer z = x + y; return z;};

        B bObj3 = (x, y) ->  x + y;
    }
}
