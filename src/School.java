import java.time.LocalDate;

public class School extends  Educationcenter{

    public School(String name, String lacoldateCountry, LocalDate foundation) {
        super(name, lacoldateCountry, foundation);
    }

    @Override
    public String toString() {
        return "School{}";
    }
}
