package Example3;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee person = new Employee();
        person.surname = scan.next();
        person.sex = scan.next();
        person.age = scan.nextInt();
        person.salary = scan.nextInt();
        if (person.isPensioner()){
            person.changeSalary(0.9);
        }
        person.show();
    }
}
public class Employee {
    String surname;
    String sex;
    int age;
    int salary;
    // метод класса, определяющий пенсионер человек или нет
    // возвращает true, если сотрудник пенсионного возраста
    // (женщина возраст >= 58 или мужчина возраст >= 63)
    boolean isPensioner(){
        boolean result = false;
        if (sex.equals("male") & (age >= 63)) {
            result = true;
        }
        if (sex.equals("female") & (age >= 58)) {
            result = true;
        }
        return result;
    }
    // метод изменяет зарплату работника, умножая ее на некоторый коэффициент
    void changeSalary(double koef){
        double salaryCount = 0.0;
        salaryCount= (double)salary * koef;
        salary = (int)salaryCount;
    }
    // метод выводит данные о работнике в csv - формате (поля, отделенные точкой с запятой)
    void show(){
        StringBuilder sb = new StringBuilder();
        sb.append(surname).append(";").append(sex).append(";").append(age).append(";").append(salary);
        System.out.println(sb);
    }
}
