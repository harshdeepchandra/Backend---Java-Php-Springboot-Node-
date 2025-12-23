package typesofinterfaces.functionalinterface;

public class Main {
    public static void main(String[] args) {
//        A aObj = new B();
//
//        System.out.println(aObj.random());

//        A aObj = new A() {
//            @Override
//            public String random() {
//                return "Something random from A implementation";
//            }
//        };
//
//        System.out.println(aObj.random());

        //Lambda Expression
        A aObj = () -> {return "random";};

        System.out.println(aObj.random());
    }
}
