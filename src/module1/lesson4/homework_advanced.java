package module1.lesson4;
import java.util.Arrays;
public class homework_advanced {
    public static void main(String[] args) {
        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        if (increment > 0) {
            long i = 0;
            while (result < 1_000_000)
            {
                i++;
                result+=increment;

        }
            System.out.println(i);
        }
        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int dlinaMassiva = 50;
        int [] array = new int[dlinaMassiva];
        for (int i = 0; i < array.length; i++){
            array[i]=1;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                array[i]=0;
            }
        }
        System.out.println(Arrays.toString(array));

        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        double schet = 0;
        int kolvoProblem = 0;

        if (hasMotorProblem){
            schet += 10_000;
            kolvoProblem++;
        }
        if (hasElectricsProblem){
            schet += 5_000;
            kolvoProblem++;
        }
        if (hasTransmissionProblem){
            schet += 4_000;
            kolvoProblem++;
        }
        if (hasWheelsProblem){
            schet += 2_000;
            kolvoProblem++;
        }
        if (kolvoProblem > 0 ){

            if (hasTransmissionProblem && ( hasElectricsProblem || hasMotorProblem) ){
//              schet -= schet / 100 * 20
//              schet  = schet - schet / 100 * 20
                schet *= 0.8;
                System.out.println("Скидка 20%");
                // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.

            } else if (kolvoProblem > 1){
//              schet -= schet / 100 * 10
//              schet  = schet - schet / 100 * 10
                schet *= 0.9;
                System.out.println("Скидка 10%");
                // Если две детали сломаны, то на общий счет идет скидка 10%.
            }

        } else {
            if (!hasFuel) {
                schet = 1_000;
            } else {
                System.out.println("Ищите проблему; такого не может быть");
            }
        }
        System.out.println("Ваш счет: " + schet);

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
        Sklad sk1 = new Sklad(1000);
        System.out.println(sk1.getOstatki());
        sk1.zagruzil(100);
        System.out.println(sk1.getOstatki());
        sk1.razgruzil(100);
        System.out.println(sk1.getOstatki());
        Workers worker1 = new Workers("Oleg",30);
        Workers worker2 = new Workers("Ilya",45);
        Workers worker3 = new Workers("Dima",36);
        worker1.setCountBoj(10);
        worker2.setCountBoj(30);
        worker3.setCountBoj(10);
        System.out.println(sk1.getOstatki());
        System.out.println(worker1.getboj());
        System.out.println(worker2.getboj());
        System.out.println(worker3.getboj());
        worker1.setCountBoj(10);
        worker2.setCountBoj(30);
        worker3.setCountBoj(10);
        System.out.println(sk1.getOstatki());
        System.out.println(worker1.getboj());
        System.out.println(worker2.getboj());
        System.out.println(worker3.getboj());
    }
}
