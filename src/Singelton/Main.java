package Singelton;

public class Main {

    public static void main(String[] args) {

        MySingelton myObject1 = MySingelton.getInstance("Detta är den enda text som gäller");
        MySingelton myObject2 = MySingelton.getInstance("Detta är en annan text");

        System.out.println(myObject1.myString);
        System.out.println(myObject2.myString);

    }
}
