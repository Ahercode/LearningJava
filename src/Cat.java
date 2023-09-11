public class Cat {

    String name;
    int age;
    private static int catCount =0;
    public Cat(){
        catCount ++;
    }

    public static String getName(String n){
        return n;
    }
    public void meow(){
        System.out.println("Meow from cat!");
    }

    public static int getCount(){
        return catCount;
    }
}
