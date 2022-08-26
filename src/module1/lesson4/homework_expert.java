package module1.lesson4;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework_expert {
    public static void main(String[] args) {
        // Экспертный уровень:
        // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
        // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
        // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
        // К474СЕ178 - где 178 регион

        // Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
        // Не повторяющиеся

        //Входящие данные
        // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
        // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
        // { 1 : {
        //      "out" : ["К474СЕ178"],
        //      "input": ["А222РТ178"]
        //    },
        //   2 : {
        //        "out" : ["К722АВ12", "А222РТ178"],
        //        "input" : ["М001АВ01", "А023РВ73"],
        //   }
        // ..
        //  }

        //Список технологий:
        // Set (HashSet) - узнать что это, set.contains(), set.put()
        // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
        // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
        // Регулярные выражения - вытащить регион авто
        Map<Integer, Map<String, String[]>> data = GeneratorExpertHomework.getData();
//        System.out.println("Всего регионов: " + data.size());
//        Set<Integer> regions = data.keySet();
//        System.out.println("Регионы: " + regions);
//        List sortedKeys = new ArrayList(data.keySet());
//        Collections.sort(sortedKeys);
//        System.out.println("Регионы: " + sortedKeys);
        String nomerResult = "Спецномера: ";
        String regionResult = "Регионы спецномеров: ";
        for (Map.Entry<Integer, Map<String, String[]>> regMap1 : data.entrySet()) {
            Map<String, String[]> regMap1Value = regMap1.getValue();
//            System.out.println(regMap1Value);
            for (Map.Entry<String, String[]> regNomerMap : regMap1Value.entrySet()) {
                String[] nomers = regNomerMap.getValue();
//                System.out.println(Arrays.toString(nomers));
                for (String nomer : nomers ) {
//                    Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
                    Pattern p = Pattern.compile("М\\d{3}АВ\\d{2,3}");
                    Matcher m = p.matcher(nomer);
                    if (m.find()) {
                        nomerResult += m.group();
                        nomerResult += " ";
//                        regionResult += m.group().substring(6,m.group().length());
//                        regionResult += " ";
                        Pattern p1 = Pattern.compile("\\d{2,3}$");
                        Matcher m1 = p1.matcher(m.group());
                        if (m1.find()) {
                            regionResult += m1.group();
                            regionResult += " ";
//                            System.out.println(m1.group());
                        }
//                        }
                    }
                }
            }
        }
        System.out.println(nomerResult);
        System.out.println(regionResult);
        }
    }