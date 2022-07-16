package lesson2;

public class homework_expert {
    public static void main(String[] args) {
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //Входящий стринг <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
        //Вернет - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //Входящий - <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>
        //Вернет - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
//       String textVhod1 = "<client>(Какие то данные)<data>79991113344;test33333@yandex.ru;Иванов Иван Иванович</data></client>";
//        String textVhod1 = "<client>(Какие то данные)<data></data></client>";
//        String textVhod1 = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        String textVhod1 = "<client>(Какие то данные)<data>Иванов Иван Иванович</data></client>";
        int index1 = textVhod1.indexOf("<data>");
        int index2 = textVhod1.indexOf("</client>");
//        System.out.print(textVhod1.substring(0,index1) + "<data>");
        String full = textVhod1.substring(0,index1) + "<data>";

//        System.out.println(textVhod1.substring(index1,index2));
        String dataStr = textVhod1.substring(index1,index2);
        dataStr = dataStr.substring(dataStr.indexOf(">")+1,dataStr.lastIndexOf("<"));
//        System.out.println(dataStr.length());
        if (dataStr.length() > 0) {
            String[] podStr = dataStr.split(";");
            for (String str : podStr) {
//            System.out.println(str);
                if (str.contains("@") && str.contains(".")) {
                    StringBuilder sb = new StringBuilder(str);
                    full = full + sb.replace(3, str.indexOf('@'), "*".repeat((str.indexOf('@') - 3))).replace(str.indexOf('@') + 1, str.lastIndexOf('.'), "*".repeat(str.lastIndexOf('.') - (str.indexOf('@') + 1))) + ";";
//                System.out.println(sb.replace(str.indexOf('@')+1, str.lastIndexOf('.'), "*".repeat(str.lastIndexOf('.')-(str.indexOf('@')+1))));
                } else if (str.contains(" ")) {
                    StringBuilder sb = new StringBuilder(str);
//                System.out.println(str);
                    full = full + sb.replace(1, str.indexOf(' ') - 1, "*".repeat(str.indexOf(' ') - 2)).replace(str.lastIndexOf(' ') + 2, str.length(), ".")+ ";";
                } else {
                    StringBuilder sb = new StringBuilder(str);
//                System.out.println(str);
                    full = full + sb.replace(4, str.length() - 4, "*".repeat(str.length() - 4 - 4))+ ";";
                }
            }
            full = full.substring(0,full.length()-1);
        }
        full = full + "</data>" + textVhod1.substring(index2,textVhod1.length());
        System.out.print(full);
    }
}
