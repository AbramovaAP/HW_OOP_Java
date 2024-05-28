/*
Объединяем в себе 2 задачи, для запуска приложения
 */
package HW_2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Vladimir");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
/** Вывод:
Ivan пришел в магазин
Ivan встал в очередь
Vladimir пришел в магазин
Vladimir встал в очередь
Ivan сделал свой заказ
Vladimir сделал свой заказ
Ivan получил свой заказ
Vladimir получил свой заказ
Ivan вышел из очереди и готов уходить
Vladimir вышел из очереди и готов уходить
Ivan вышел из магазина
Vladimir вышел из магазина
 */
