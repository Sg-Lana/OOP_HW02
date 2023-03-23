package OOP.OOP_HW.HW02;

/*
интерфейс, реализующий интерфейс Животное:
Домашнее животное со следующими свойствами:
1.1 Кличка
1.2 Порода
1.3 Наличие прививок
1.4 Цвет шерсти
1.5 Дата рождения
 */
public class Pet extends Animal{
    protected String name;
    protected String breed;
    protected boolean vaccinations;
    protected String coatColor;
    protected String birthdate;

    public Pet() {
        this.name = "";
        this.breed = "";
        this.vaccinations = false;
        this.coatColor = "";
        this.birthdate = "";
    }

    public Pet(String name, String breed, boolean vaccinations, String coatColor, String birthdate) {

        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.coatColor = coatColor;
        this.birthdate = birthdate;

    }

    public String getInfo() {
        return String.format(
            "height - %d, weight - %d, eyeСolor - %s", 
            this.height, this.weight, this.eyeСolor);
    }

    public String getName() {
        return String.format("name - %s", this.name);
    }

    public String getBreed() {
        return String.format("breed - %s", this.breed);
    } 

    public boolean getVac() {
        return this.vaccinations;
    }

    public String getCoatColor() {
        return String.format("coatColor - %s", this.coatColor);
    }

    public String getbirthdate() {
        return String.format("birthdate - %s", this.birthdate);
    }
}
