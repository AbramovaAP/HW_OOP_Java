/*Задание 2.2
Необходимо реализовать строение классов, без конкретной реализации!

Необходимо реализовать:
Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей,
обновление состояния магазина
 */

package HW_2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor); //метод для инициализации клиента в магазине (Клиент зашел в магазин)
    void releaseFromMarket(List<Actor> actors); // метод для удаления клиента из главного списка очереди
    void update();
}
