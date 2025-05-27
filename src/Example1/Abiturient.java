package Example1;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Abiturient person = new Abiturient();
        person.surname = scan.next();
        person.name = scan.next();
        person.math = scan.nextInt();
        person.physics = scan.nextInt();
        person.lang = scan.nextInt();
        System.out.printf("%.1f\n", person.average());
        person.print();
    }
}
public class Abiturient {
    String name;
    String surname;
    int math;
    int physics;
    int lang;
    double average(){
        double result = 0;
        result = (math+physics+lang)/3.0;
        return result;
    }
    String print(){

    }
}
