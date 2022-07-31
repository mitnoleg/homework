package lesson6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class homework_expert {
    public static void main(String[] args) throws IOException {

//        String path1 = "D:\\java\\homework\\resource";
        String path1 = "resource";
        double allPyterochka = 0.0;
        double allPerekrestok = 0.0;
        double allYdoma = 0.0;
        double allOkey = 0.0;
//        double [] mountPyterochka =
//        Files.walk(Path.of(path1)).forEach(e -> System.out.println(e.toString()));
        Path path = Paths.get(path1);
        List<Path> paths = listFiles(path);
//        paths.forEach(x -> System.out.println(x));
        for (Path pathOne : paths) {
//            System.out.println(pathOne);
            String filePath = String.valueOf(pathOne);
            double dohodPyterochka = 0.0;

            try (BufferedReader file = new BufferedReader(new FileReader(filePath))) {
                while (file.ready()) {
                    String line = file.readLine();
//                    System.out.println(line);
                    String[] array = line.split(";");
//                    System.out.println(Arrays.toString(array));
                    if (line.startsWith("pyterochka")){
                        allPyterochka += Double.parseDouble(array[2]);
                        dohodPyterochka += (Double.parseDouble(array[1]) - Double.parseDouble(array[2]));

                    }
                    if (line.startsWith("perekrestok")){
                        allPerekrestok += Double.parseDouble(array[2]);
                    }
                    if (line.startsWith("ydoma")){
                        allYdoma += Double.parseDouble(array[2]);
                    }
                    if (line.startsWith("okey")){
                        allOkey += Double.parseDouble(array[2]);
                    }

                }
            }
            System.out.println(filePath.substring(filePath.indexOf("_"),filePath.lastIndexOf(".")).substring(1).replace("_",".") + ": " + dohodPyterochka);
//
        }
        System.out.println("Расходы pyterochka за весь период: " + allPyterochka);
        System.out.println("Расходы perekrestok за весь период: " + allPerekrestok);
        System.out.println("Расходы ydoma за весь период: " + allYdoma);
        System.out.println("Расходы okey за весь период: " + allOkey);

        //Экспертный уровень
        // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц, 2012 - год
        // Внутри файла следующий формат:
        // pyterochka;122300.20;100312.10;20/01/2012
        // pyterochka;299922.00;323333.02;21/01/2012
        // perekrestok;9920.20;28200.01;21/01/2012
        // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

        //Читать файлы нужно через
        //Прочитать все файлы из папки
//        String path1 = "путь до файла";
//        Files.walk(Path.of(path1)).forEach(e -> System.out.println(e.toString()));


        // Задача №1
        // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00
        // и тд


        // Задача №2
        // Необходим составить отчет о расходах за весь период по магазинам (т.е. прочитать все файлы внутри папки)
        // Формат ожидаемого результата:
        // Расходы pyterochka за весь период: 20032220.00
        // Расходы perekrestok за весь период: 1734220.00
        // .. и тд

    }

    public static List<Path> listFiles(Path path) throws IOException {

        List<Path> result;
        try (Stream<Path> walk = Files.walk(path)) {
            result = walk.filter(Files::isRegularFile)
                    .collect(Collectors.toList());
        }
        return result;

    }
}
