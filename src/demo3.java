
class Students{
    int id;
    String name;
    public void insertR(int r,String n){
        id = r;
        name = n;
    }
    public void display(){
        System.out.println("id of student is = "+id+" "+"name of student = "+name);
    }
}

public class demo3 {
    public static void main(String[] args) {
       Students s1 = new Students();
       s1.insertR(12,"vardaan");
       s1.display();
    }
}
