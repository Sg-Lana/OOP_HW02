package OOP.OOP_HW.HW02;

/*
реализовать абстрактный класс "Птица", реализующий интерфейс животное, 
у которого будет защищённое поле:
1.Высота полёта
и метод:
2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
и защищённый конструктор:
3.Конструктор принемающий высоту полёта
 */
public abstract class Bird {
    protected int flyingHeight;

    public Bird(){
        this.flyingHeight = 0;
    }
    public Bird(int flyingHeight){
        this.flyingHeight = flyingHeight;
    }

    public void Fly(){
        System.out.println("я лечу на " + flyingHeight + "метрах");
    }
}
