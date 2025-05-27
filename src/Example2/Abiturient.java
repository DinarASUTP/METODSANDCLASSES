package Example2;
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
    void print(){
        StringBuilder sb = new StringBuilder();
        double avr = Math.round(average()*10)/10.0;
        System.out.println(sb.append(surname).append(" ").append(name).append(" ").append("математика = ").append(math).append(" физика = ").append(physics).append(" язык = ").append(lang).append(" средний балл = ").append(avr));
    }
}
