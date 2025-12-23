package singleton;

public class Main {
    public static void main(String[] args) {
        SingletonDP sdp1 = SingletonDP.getInstance();

        SingletonDP sdp2 = SingletonDP.getInstance();

        System.out.println("Both are same: " + (sdp1 == sdp2));
        System.out.println(sdp1);
        System.out.println(sdp2);
    }
}
