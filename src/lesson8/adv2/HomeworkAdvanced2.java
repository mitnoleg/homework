package lesson8.adv2;

public class HomeworkAdvanced2 {
    public static void main(String[] args) {
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
//        Watch watchNoBroken = new Watch(false);
//        Watch watchBroken = new Watch(true);
//        Worker workerWatchNoBroken = new Worker(watchNoBroken);
//        Worker workerWatchBroken = new Worker(watchBroken);
//        Worker[] workers1 = {workerWatchNoBroken};
//        Worker[] workers2 = {workerWatchBroken};
        Worker[] workers1 = {new Worker(new Watch(false))};
        Worker[] workers2 = {new Worker(new Watch(true))};
        Shop shop1 = new Shop(workers1);
        Shop shop2 = new Shop(workers2);
        Shop[] shops = {shop1, shop2};
        Brend brend = new Brend(shops);

        for (Shop shop : brend.getShops()) {
            for (Worker shopWorker : shop.getWorkers()) {
                Watch workerWatch = shopWorker.getWatch();
                try {
                    workerWatch.tick();
                } catch (WatchBrokenError e) {
                    System.out.println("Ошибка: часы сломались");
                }
            }
        }
    }

    }

