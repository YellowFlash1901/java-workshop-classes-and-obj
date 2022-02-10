#create a class student and create an object to accesss the class
    

class Student{
    int id = 12;
    String name = "vardaan";
}

public class demo2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
