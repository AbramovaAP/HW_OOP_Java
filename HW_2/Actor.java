/**Задание 1.2

Необходимо реализовать:
Абстрактный класс Actor, который хранит в себе параметры актора, включая
состояние готовности сделать заказ и факт получения заказа.

Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
“персональных данных” abstract
 */
package HW_2;

public abstract class Actor implements ActorBehaviour {
    // protected final String name;
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {//конструктор имени
        this.name = name;
    }

    public abstract String getName(); //абстрактный метод, который вернет имя
}
