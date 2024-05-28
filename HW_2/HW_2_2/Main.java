/*
Объединяем в себе 2 задачи, для запуска приложения
 */
package HW_2.HW_2_2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Person person1 = new Person("Ivan");
        Person person2 = new Person("Vasiliy");
        Person person3 = new Person("Anna");

        market.enqueue(person1);
        market.enqueue(person2);
        market.enqueue(person3);

        System.out.println("Размер очереди: " + market.size());
        System.out.println("Первый человек в очереди: " + market.dequeue());
        System.out.println("Размер очереди после удаления: " + market.size());

        Order order1 = new Order("Заказ 1");
        Order order2 = new Order("Заказ 2");

        market.placeOrder(order1);
        market.placeOrder(order2);

        market.update();
        market.update();
        market.update();
        market.update();
    }
}
/**
 * Вывод:
 * 
 */
