import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass("Lira", "Kanatova", 38, "Pasta");
        MyClass myClass = new MyClass(new String[]{"Technical Lesson,Practice Lesson"});

        System.out.println("I am"+" "+myClass1.getName()+" "+myClass1.getSurname()+","+" "+"I am "+ myClass1.getAge()+" years old"+","+" "+"my favorite food is"+" "+myClass1.getFavoriteFood());

        String[] courses={"Technical Lesson,Practice Lesson"};

           System.out.println("I am studying at Peaksoftschool these courses");
        System.out.println(Arrays.toString(myClass.getCourses()));

    }




}