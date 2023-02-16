import java.time.LocalDate;

public abstract class Educationcenter {
    private String name;
    private String lacoldateCountry;
    private LocalDate Foundation;

    public Educationcenter(String name, String lacoldateCountry, LocalDate foundation) {
        this.name = name;
        this.lacoldateCountry = lacoldateCountry;
        Foundation = foundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLacoldateCountry() {
        return lacoldateCountry;
    }

    public void setLacoldateCountry(String lacoldateCountry) {
        this.lacoldateCountry = lacoldateCountry;
    }

    public LocalDate getFoundation() {
        return Foundation;
    }

    public void setFoundation(LocalDate foundation) {
        Foundation = foundation;
    }

    @Override
    public String toString() {
        return "Educationcenter{" +
                "name='" + name + '\'' +
                ", lacoldateCountry='" + lacoldateCountry + '\'' +
                ", Foundation=" + Foundation +
                '}';
    }
}
