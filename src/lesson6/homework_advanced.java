package lesson6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;

public class homework_advanced {
    public static void main(String[] args)throws IOException, URISyntaxException {
        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 (1 и 2 пункты) из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.

//        Random random = new Random(1);
//        random.nextInt(10000);
        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
        int kolvoVaz = 20;
        int kolvoToyota = 20;
        Car [] array = new Car[kolvoVaz+kolvoToyota];
        for (int i = 0; i < array.length; i++){
            if ( i < kolvoVaz){
                array[i] = CarFactory.novyeZhiguli();
            } else
            {
                array[i] = CarFactory.novyeToyota();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Vaz) {
                System.out.println(i + " машина Ваз");
            }
            if (array[i] instanceof Toyota) {
                System.out.println(i + " машина Toyota");
            }
        }
        System.out.println();
        Random random = new Random(1);
        String path3 = "src/lesson6/report_adv.txt";
        Financial_record [] dohod = new Financial_record[10];
        for (int i = 0; i < 10 ; i++)        {
            dohod[i] = new Financial_record(random.nextInt(10000), random.nextInt(10000));
        }
        try (FileWriter fileWriter1 = new FileWriter(path3)) {
            for (Financial_record line : dohod){
                double incomes = line.getIncomes();
                double outcomes = line.getOutcomes();
                fileWriter1.write("доходы = " + incomes + ", ");
                fileWriter1.write("расходы = " + outcomes + "\n");
            }
        }
        double allIncomes = 0;
        double allOutcomes = 0;
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(path3))) {
            while(bufferedReader1.ready()) {
                String fileLine = bufferedReader1.readLine();
                allIncomes +=  Double.parseDouble(fileLine.substring(fileLine.indexOf("=") + 2, fileLine.indexOf(",")));
                allOutcomes +=  Double.parseDouble(fileLine.substring(fileLine.lastIndexOf("=") + 2));
            }
        }
        System.out.println("общие доходы - " + allIncomes + "," + " общие расходы - " + allOutcomes);
        }
    }
