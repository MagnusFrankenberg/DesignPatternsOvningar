package Singelton;

public class MySingelton {

    private static MySingelton instance;
    String myString;

    private MySingelton(String myString){
        this.myString = myString;
    }

    public static MySingelton getInstance(String string) {
        if (instance == null) {
            instance = new MySingelton(string);
        }
        return instance;
    }
}
