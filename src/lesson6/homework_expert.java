package lesson6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
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
        Path path = Paths.get(path1);
        List<Path> paths = listFiles(path);
        for (Path pathOne : paths) {
            String filePath = String.valueOf(pathOne);
            double dohodPyterochka = 0.0;

            try (BufferedReader file = new BufferedReader(new FileReader(filePath))) {
                while (file.ready()) {
                    String line = file.readLine();
                    String[] array = line.split(";");
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
        System.out.println();
        System.out.println("Расходы pyterochka за весь период: " + allPyterochka);
        System.out.println("Расходы perekrestok за весь период: " + allPerekrestok);
        System.out.println("Расходы ydoma за весь период: " + allYdoma);
        System.out.println("Расходы okey за весь период: " + allOkey);
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
