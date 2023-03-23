package OOP.OOP_HW.HW02;

/*
класс "Зоопарк", в котором храниться любая структура данных животных(массив, стек, очередь), 
в котором организовать приватный массив объектов-животных со следующими методами:
1.Добавить животное в зоопарк
2.Убирает животное с номером i из зоопарка
3.Посмотреть информацию о животном с номером i
4.Заставить животное с номером i издать звук
5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук
Предоставить пользователю консольный интерфейс(консольное меню), 
который позволяет пользователю добавлять новых животных в зоопарк, убирать животных из зоопарка, 
печатать информацию о конкретном животном(вводя его номер), 
печатать информацию о всех животных в зоопарке на данный момент, 
заставлять животное издавать звук(введя номер животное), 
заставлять издавать звук всех животных, которые на данный момент есть в зоопарке)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    ArrayList<Animal> ZooList;
    public Zoo(){
        ZooList = new ArrayList<Animal>();
    }
    public void AddAnimal(Animal NEW){
        ZooList.add(NEW);
    }
    public void DelAnimal(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер животного");
        int index = in.nextInt();
        in.close();
        ZooList.remove(index);
        
        
    }
    public void getInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер животного");
        int index = in.nextInt();
        in.close();
        System.out.println(ZooList.get(index));
        //System.out.println(ZooList.get(index).Info()); 
        
        
    }
    public void getNois(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер животного");
        int index = in.nextInt();
        in.close();
        System.out.println(ZooList.get(index));
        //System.out.println(ZooList.get(index).Nois()); 
        
        
    }
    public void getInfoZoo(){
        for(Animal i : ZooList){
            System.out.println(i);
            //System.out.println(i.Info());
        }
    }
    public void getNoisZoo(){
        for(Animal i : ZooList){
            System.out.println(i);
            //System.out.println(i.Nois());
        }
    }      
}
