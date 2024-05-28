/*Задание 2.3
Необходимо реализовать строение классов, без конкретной реализации!

Необходимо реализовать:
Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке
список людей в очереди в различных статусах
 */

package HW_2.HW_2_2;

import java.util.ArrayList;
import java.util.List;


public class Market implements QueueBehaviour, MarketBehaviour {
    
    private List<Person> queue; // Очередь людей
    private List<Order> orders; // Очередь заказов
    

    public Market() {
        queue = new ArrayList<>();
        orders = new ArrayList<>();
    }

    // Реализация методов интерфейса QueueBehaviour
    
    @Override
    public void enqueue(Person person) {
        queue.add(person);
    }

    @Override
    public Person dequeue() {
        if (!queue.isEmpty()) {
            return queue.remove(0);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    // Реализация методов интерфейса MarketBehaviour

    @Override
    public void placeOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Order takeOrder() {
        if (!orders.isEmpty()) {
            return orders.remove(0);
        }
        return null;
    }

    @Override
    public boolean hasOrder() {
        return !orders.isEmpty();
    }

    // Реализация метода update

    public void update() {
        if (hasOrder()) {
            Order order = takeOrder();
    // обработка заказа
            System.out.println("Заказ обработан: " + order.toString());
        } else {
            System.out.println("Очередь заказов пуста.");
        }
    }
}