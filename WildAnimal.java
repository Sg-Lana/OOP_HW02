package OOP.OOP_HW.HW02;

/*
интерфейс, реализующий интерфейс Животное
2.Дикое животное со следующими свойствами:
2.1 Место обитания
2.2 Дата нахождения
 */
public class WildAnimal extends Animal{
    protected String location;
    protected String dateLocation;

    public WildAnimal() {
        this.location = "";
        this.dateLocation = "";
    }

    public WildAnimal(String location, String dateLocation) {

        this.location = location;
        this.dateLocation = dateLocation;
    }

    public String getInfo() {
        return String.format(
            "height - %d, weight - %d, eyeСolor - %s", 
            this.height, this.weight, this.eyeСolor);
    }

    public String getLocation() {
        return String.format("location - %s", this.location);
    }

    public String getDateLocation() {
        return String.format("dateLocation - %s", this.dateLocation);
    } 
}