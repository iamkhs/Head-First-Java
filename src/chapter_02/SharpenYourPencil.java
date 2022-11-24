package chapter_02;

public class SharpenYourPencil {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.model = "Sony Bravia";
        tv.price = 1000;

        tv.powerOn();
        tv.getDetails();
    }
}
class Television{
    String model;
    int price;
    void powerOn(){
        System.out.println("Television is on.....");
    }
    void getDetails(){
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
}