package lesson2;
import java.util.Arrays;
import java.util.Locale;

public class homework_advanced {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String chislo = "234";
        String text = "some_text";
        System.out.println( (Integer.parseInt(chislo) + text.length()) );
//      System.out.println( (Integer.valueOf(chislo) + text.length()) );
        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a  = 3;
        int b=5;
//        System.out.println((a+b)*(a+b));
        System.out.println(Math.pow((a+b),2));
        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] numbers = new int[]{1,2,5,7,10};
        int[] numbers2 = new int[]{2,3,2,17,15};
        int[] allNumbers = new int[numbers.length + numbers2.length];
        System.arraycopy(numbers, 0, allNumbers, 0, numbers.length);
        System.arraycopy(numbers2, 0, allNumbers, numbers.length, numbers2.length);
        System.out.print(Arrays.toString(allNumbers).substring(1, Arrays.toString(allNumbers).length()-1)+", ");
        for (int i = 0; i < numbers.length; i++) {
//            System.out.print( "(" + numbers[i] + "*" + numbers2[i] + ")" + "=" + numbers[i] * numbers2[i]  );
            System.out.print(  numbers[i] * numbers2[i]  );
            if (i < numbers.length - 1) {
                System.out.print( ", "  );
            }
            else {
                System.out.print("\n");
            }
        }
        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        String hw = "Hello world!";
//        System.out.println(hw.replace('l','r'));
//        System.out.println(hw.replace('l','r').toUpperCase());
        System.out.println(hw.replace('l','r').toUpperCase().substring(0,8));
    }
}
