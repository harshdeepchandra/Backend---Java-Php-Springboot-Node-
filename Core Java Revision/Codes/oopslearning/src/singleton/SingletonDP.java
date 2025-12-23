package singleton;

public class SingletonDP {
    private static SingletonDP instance = null;

    private SingletonDP() {

    }

    public static SingletonDP getInstance() {
        if(instance == null) {
            instance = new SingletonDP();
        }
        return instance;
    }
}
