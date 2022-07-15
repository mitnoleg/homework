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
//        String textVhod1 = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
//        String textVhod1 = "<client>(Какие то данные)<data></data></client>";
        String textVhod1 = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        int index1 = textVhod1.indexOf("<data>");
        int index2 = textVhod1.indexOf("</client>");
        System.out.println(textVhod1.substring(0,index1));
        System.out.println(textVhod1.substring(index1,index2));
        String dataStr = textVhod1.substring(index1,index2);
//        System.out.println(dataStr.substring(dataStr.indexOf(">")+1,dataStr.lastIndexOf("<")));
        if (dataStr.substring(dataStr.indexOf(">")+1,dataStr.lastIndexOf("<")).length() !=0) {
//            System.out.println(dataStr.substring(dataStr.indexOf(">") + 1, dataStr.indexOf(";")));

        }
        System.out.println(textVhod1.substring(index2, textVhod1.length()));
    }
}
