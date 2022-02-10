#create a class company 
    

class Company{
    String name;

    public Company(){
        name = "Google";
    }
}

public class demo4 {
    public static void main(String[] args) {
        Company obj = new Company();
        System.out.println(obj.name);
    }
}
