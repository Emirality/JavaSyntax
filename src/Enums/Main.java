package Enums;

public class Main {
    public static void main(String[] args) {
        for (Cars car : Cars.values()){
            System.out.println(car+" "+car.getPrice());
        }
    }
}

enum Cars{
    GOLF(1), AUDI(2), BMW(3), FORD(4);

    private int price;

    Cars(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}