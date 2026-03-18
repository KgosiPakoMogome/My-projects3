import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);

        System.out.println("Are you a student or lecturer? (s/l)");
        String role = pk.nextLine();

        if (role.equalsIgnoreCase("S")) {
            Student S = new Student("Alice", "12345", 34.5);
            System.out.println(S.getInfo());
        }
        else if(role.equalsIgnoreCase("L")){
            Lecturer l = new Lecturer("Pako", "37766", "Comp");
            System.out.println(l.getInfo());
        }
    }
}