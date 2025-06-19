package Example5;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Commodity trata1 = new Commodity();
    }
}

public class Commodity {
    public String name;
    public int price;
    public void show(){
        System.out.printf("Наименование товара:%s",name);
        System.out.printf("Цена товара :%d",price);
    }
}

class Purchase{
    public String name;
    public int count;
    private int getCost(int price, int count)  {
        int result = 0;
        result = price * count;
        return result;
    }
    public void show(){
        System.out.printf("Количество: %d",name);
        System.out.printf("Стоимость покупки: %d", getCost);
    }
}
