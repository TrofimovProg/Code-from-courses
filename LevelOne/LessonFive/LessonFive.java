package Homework.LevelOne.LessonFive;

//        Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
//
//        Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//        В качестве параметра каждому методу передается величина, означающая или
//        длину препятствия (для бега и плавания), или высоту (для прыжков).
//
//        У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
// прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
// плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
//
//        При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
//
//        Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

import java.util.Random;

public class LessonFive {
    public static void main(String[] args) {
        Random random = new Random();
        Cat c = new Cat("Jack", "Black", 2018, 1000);
        Dog d = new Dog("John", "White", 2017, 1500);
        Bird b = new Bird("Michael", "Orange", 2016, 500);
        Horse h = new Horse("Mike", "Brown", 2014, 15000);

        Animal[] animals = {c,d,b,h};
        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(random.nextInt(500));
            animals[i].run(random.nextInt(500));
            animals[i].jump(random.nextInt(500));
        }
    }
}
