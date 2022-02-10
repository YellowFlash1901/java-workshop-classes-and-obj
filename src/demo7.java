#constructor program


class Studentsz{
    int id;
    String name;
    Studentsz(){
        this.id = 12;
        this.name = "vardaan";
    }
}

public class demo7 {
    public static void main(String[] args) {
        Studentsz s1 = new Studentsz();
        System.out.println(s1.name);
    }
}
