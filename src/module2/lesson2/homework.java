package module2.lesson2;

import module2.lesson2.task1.*;

public class homework {
    public static void main(String[] args) {
        //Задача №1
        //*Создать интерфейсы flyable (метод void fly()), swimable (метод void swim), bitable (метод void bite)
        //*Создать класс Zoo, который может содержать в себе 3-х вида животных
        //*1. Животное плавающее
        //*2. Животное летающее
        //*3. Животное кусающее
        //В классе Zoo будут методы получения и замены этих животных. Получить мы должны конкретные классы,
        //а не интерфейсы.
        //Зоопарк имеет методы - void feedFlyable(),void feedSwimable(),void feedBitable(). Логика внутри метода:
        //Печать на экран "летающее животное ест", вызов у животного метода fly() и тд.
        //*Создать 6 классов животных - 2 класса плавающих, 2 класса летающих, 2 класса кусающих.
        //*Создать по одному экземпляру на каждый класс.
        //Создать 2 экземпляра зоопарка и распределить животных по зоопаркам.
        //Никаких проверок if instanceof быть не должно, и внутри Zoo будут лежать Generics, а не интерфейсы.
        Falcon falcon = new Falcon();
        Penguin penguin = new Penguin();
        Fish fish = new Fish();
        Shark shark = new Shark();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Zoo<AnimalSwimable, AnimalFlyable, AnimalBitable> zoo1 = new Zoo<>(fish,penguin,lion);
        Zoo<AnimalSwimable, AnimalFlyable, AnimalBitable> zoo2 = new Zoo<>(shark,falcon,tiger);
        zoo1.feedBitable();
        zoo2.feedBitable();
        zoo1.setAnimalBitable(tiger);
        zoo2.setAnimalBitable(lion);
        zoo1.feedBitable();
        zoo2.feedBitable();
        zoo1.getAnimalSwimable().swim();
        zoo2.getAnimalSwimable().swim();




        //Задача №2
        //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
        //Массив T[] будет создаваться при создании экземпляра класса MyList с размерностью 3.
        //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
        //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
        //2.Скопировать со старого массива все значения в новый
        //3.Присвоить экземпляру MyList новый массив.

    }
}
