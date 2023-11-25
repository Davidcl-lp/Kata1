import java.time.LocalDate;
public class Main {
    public static void main(String[] args){
        Person person = new Person("Example", LocalDate.of(1996, 5, 1));
        System.out.println(person.toString());
    }
}
