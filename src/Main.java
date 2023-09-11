// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            String myname= "Aherode";
//
//            System.out.println(myname.toUpperCase());
//            System.out.println("i = " + i);
//
//        }
//        guessName( "Philip", 26);

        System.out.println(Cat.getCount());
        Cat newCat = new Cat();
        newCat.age = 13;
        newCat.name = "Phil";
        Cat newCat1 = new Cat();
        newCat1.age = 14;
        newCat1.name ="Test 2";

        Cat newCat2 = new Cat();
        newCat2.age=78;
        newCat2.name="Test 3";
        System.out.println(newCat.name);

        System.out.println("You have created: \n1. "+ newCat.name+" with age: " + newCat.age +
                "\n2. "+ newCat1.name+" with age: "+ newCat1.age +
                "\n3. " + newCat2.name+" with age: "+ newCat2.age);

    }

    private static void guessName(String name, int age){
        System.out.println("My name is "+ name + " and I am "+ age +" years old");
    }
}