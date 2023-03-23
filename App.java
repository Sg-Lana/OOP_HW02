package OOP.OOP_HW.HW02;
import java.util.Scanner;
/*
 * меню для пользователя
 */
public class App {
    public static void main(String[] args) {
        Zoo ar = new Zoo();
        boolean stop = false;
        Menu(stop, ar);
    }
    public static void Menu(boolean stop, Zoo list){
        
        if (stop == false){
            Scanner i = new Scanner(System.in);
            System.out.println("1. Добавить животное в зоопарк\n"
            + "2. Убирать животное из зоопарка\n"
            + "3. Посмотреть информацию о животном\n"
            + "4. Заставить животное издать звук\n"
            + "5. Напечатать информацию о животных\n"
            + "6. Заставить всех животных издать звук\n" 
            + "7. Выйти из зоопарка\n");
            int num = i.nextInt();
            if (num == 1) {
                System.out.println("1. Кошку\n2. Собаку\n3. Волка\n4. Птицу\n");
                int animal = i.nextInt();
                System.out.println(animal);
                if (animal == 1) list.AddAnimal(new Cat());
                if (animal == 2) list.AddAnimal(new Dog());
                if (animal == 3) list.AddAnimal(new Wolf());
                                  
                  
            }
            if (num == 2) list.DelAnimal();
            if (num == 3) list.getInfo();
            if (num == 4) list.getNois();
            if (num == 5) list.getInfo();
            if (num == 6) list.getNoisZoo();
            if (num == 7) stop = true;
            
            Menu(stop, list);
            i.close();
        }
    }
}
