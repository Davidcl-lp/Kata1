import java.time.LocalDate;
public class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birthday.getYear();
        return age;
    }

}
