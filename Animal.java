package OOP.OOP_HW.HW02;
import java.text.Format;
import java.util.Random;

/*
интерфейс "Животное" со следующими полями:
1.Рост животного
2.Вес животного
3.Цвет глаз животного
+
И методы:
1.Издать звук
2.Напечатать информацию о животном
 */

public class Animal {
    protected int height;
    protected int weight;
    protected String eyeСolor;
    protected static Random r;

    static {
        Animal.r = new Random();
    }

    public Animal(int height, int weight, String eyeСolor) {
        this.height = height;
        this.weight = weight;
        this.eyeСolor = eyeСolor;        
    }

    public Animal() {
        this(0,0,"");
    }

    public String getInfo() {
        return String.format("height - %d, weight - %d, eyeСolor - %s", 
            this.height, this.weight, this.eyeСolor);
    }

    /*
    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getEyeСolor() {
        return this.eyeСolor;
    }*/
}