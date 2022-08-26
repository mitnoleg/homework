package module1.lesson8.adv1;

public class HomeworkAdvanced {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        // растение -> роза (умеет цвести, умеет пахнуть)
        // растение -> папоротник (умеет цвести)
        // Создать у каждого класса по объекту, распределить по массивам интерфейсов
        // И у каждого массива вызвать характерный метод
        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести
//        Tree spruce = new Tree("сосна",TreeClass.coniferous,true,true);
//        Tree pine = new Tree("ель",TreeClass.coniferous,true,true);
//        Plant rose = new Plant("роза",PlantDepartment.Marchantiophyta,true,true);
//        Plant fern  = new Plant("папоротник",PlantDepartment.Polypodiophyta,true);
//        Tree [] trees = {spruce,pine};
//        Plant [] plants = {rose,fern};
//        for (Tree tree :  trees) {
//            tree.smell();
//        }
//        for (Plant plant : plants){
//            plant.bloom();
//            plant.smell();
//        }
        Spruce spruce = new Spruce("сосна", TreeClass.coniferous, true, true);
        Pine pine = new Pine("ель", TreeClass.coniferous, true, true);
        Rose rose = new Rose("роза", PlantDepartment.Marchantiophyta, true);
        Fern fern = new Fern("папоротник", PlantDepartment.Polypodiophyta, true);
        Smelling [] smellings = {spruce,pine,rose};
        Flowering [] flowerings = {rose,fern};
        for (Smelling smelling : smellings) {
            smelling.smell();
        }
        for (Flowering flowering : flowerings) {
            flowering.bloom();
        }


        //Задача №2
        //2. Создать следующую структуру из классов и интерфейсов
        // магазин (обладает работниками)
        // работник (обладает часами - (часы одни))
        // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        // Бренд (обладает массивом магазинов)
        // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
        // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
        // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
        // обработать ошибку сломанных часов.
        // Ожидание вывода на экран:
        // Часы тикают
        // Ошибка: Часы сломались.

    }
}
