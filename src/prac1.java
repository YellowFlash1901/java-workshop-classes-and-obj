#create a class of cars to insert and display record

import java.util.Scanner;

class cars{
    int price;
    int seats;
    String color;
    public void insert(int p,int s,String c){
        price = p;
        seats = s;
        color = c;
    }
    public void display(){
        System.out.println("car price = "+price+" "+"no of seats = "+seats+" "+"color of car =  "+color);
    }

}


public class prac1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noc = in.nextInt(); //no. of cars
        for(int i = 1 ; i<noc+1 ;i++){
            cars ci = new cars();
            System.out.println("Enter the price,number of seats and color of car of");
            int a,b;
            String c;
            a = in.nextInt();
            b = in.nextInt();
            c = in.next();
            ci.insert(a,b,c);
            ci.display();
        }

    }
}
