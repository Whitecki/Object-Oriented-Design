package pl.edu.agh.to.lab4.types;

public class CracovCitizen extends Suspect {
    private final int age;

    public CracovCitizen(String firstname, String lastname, int age) {
        super(firstname, lastname);
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean canBeAccused() {
        return age >= 18;
    }
}
