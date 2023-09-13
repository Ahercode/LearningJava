import GradeCalculator.GPA_Calculator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {

//        System.out.printf("Hello and welcome!\n");

        System.out.println(Cat.getCount());
        Cat newCat = new Cat();
        newCat.age = 13;
        newCat.name = "Philip";
        Cat newCat1 = new Cat();
        newCat1.age = 14;
        newCat1.name ="Kekeli";

        Cat newCat2 = new Cat();
        newCat2.age=78;
        newCat2.name="Aherto";
        System.out.println(newCat.name);

        GPA_Calculator.getGPA();

    }

    private static void guessName(String name, int age){

        System.out.println("My name is "+ name + " and I am "+ age +" years old");
    }
}