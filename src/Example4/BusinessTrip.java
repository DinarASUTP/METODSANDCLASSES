package Example4;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BusinessTrip uralskaia = new BusinessTrip();
        uralskaia.FI = scan.nextLine();
        uralskaia.dayCount = scan.nextInt();
        uralskaia.transportPay = scan.nextInt();
        uralskaia.show();
    }
}
public class BusinessTrip {
    // метод расчёт общей величины расходов (=транспортные + кол-во дней * суточные)
    public final int dayPay = 25;
    public String FI;
    public int transportPay;
    public int dayCount;
    public  int getTotal(){
        int result = 0;
        result = transportPay + dayCount * dayPay;
        return result;
    }
    void show(){
        System.out.printf("Суточные = %D",dayPay);
        System.out.printf("Фамилия Имя = "+FI);
        System.out.printf("Транспортные расходы = %D",transportPay);
        System.out.printf("Количество дней = %D",3);
        System.out.printf("Итого расходы= %D",getTotal());
    }
}
