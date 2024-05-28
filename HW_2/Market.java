/*Задание 2.3
Необходимо реализовать строение классов, без конкретной реализации!

Необходимо реализовать:
Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке
список людей в очереди в различных статусах
 */

package HW_2;

import java.util.ArrayList;
import java.util.List;

/** Реализуем логику:
1. Клиент пришел в магазин
2. Клиент встал в очередь
3. Клиент сделал свой заказ
4. Клиент получил свой заказ
5. Клиент вышел из очереди и готов уходить
6. Клиент вышел из магазина
*/

public class Market implements MarketBehaviour, QueueBehaviour {//реализует в себе два интерфейса
    // private final List<Actor> queue;

    // public Market(){
    //     this.queue = new ArrayList<>();
    // }
    //Либо другая запись:
    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {//метод для инициализации клиента в магазине
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor); // и вызов метода, по помещению клиента в очередь
    }

    @Override
    public void takeInQueue(Actor actor) {//метод для помещения клиента в очередь
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {// метод по принятию заказа от покупателя
        for(Actor actor: queue){ //проходимся по всему списке клиентов из очереди
            if(!actor.isMakeOrder()){//если мы еще НЕ принимали заказ у клиента
                actor.setMakeOrder(true);//тогда мы принимаем у клиента заказ
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }

    @Override
    public void giveOrders() {// метод по передаче заказа покупателю, т.е. клиент получил заказ
        for(Actor actor: queue){ //проходимся по всему списке клиентов из очереди
            if(actor.isMakeOrder()){ //если мы приняли заказ у клиента из очереди
                actor.setTakeOrder(true); // тогда мы отдаем клиенту его заказ
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    /**должны собрать клиентов, которые получили свой заказ в отдельный список,
     * для подготовки на выход из магазина:
     */
    public void releaseFromQueue() { // метод для ПОДГОТОВКИ клиента на выход из магазина
        List<Actor> releasedActors = new ArrayList<>();
        for(Actor actor: queue){
            if(actor.isTakeOrder()){
                releasedActors.add(actor);//добавляем в спиков на удаление из очереди
                System.out.println(actor.getName() + " вышел из очереди и готов уходить");
            }
        }
        releaseFromMarket(releasedActors);//вызываем метод releaseFromMarket, чтобы выпустить клиентов из магазина
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) { // метод для удаления клиента из главного списка очереди
        for(Actor actor: actors){
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor); //удаляем каждого нашего клиента из главного списка очереди queue
        }
    }

    @Override
    public void update() {// метод по обработке клиента в очереди и выпуска его из очереди
        takeOrders(); // запускаем метод по принятию заказа от покупателя
        giveOrders(); // запускаем метод по передаче заказа покупателю
        releaseFromQueue(); // запускаем метод для ПОДГОТОВКИ клиента на выход из магазина
    }
}

