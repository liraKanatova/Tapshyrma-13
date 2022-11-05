public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String favoriteFood;
    private String [] courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public MyClass(String [] courses) {
        this.courses = courses;
    }
    public MyClass(String name, String surname, int age, String favoriteFood) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }


}


