/*Задание 1.3

Необходимо реализовать:
Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir
*/
package HW_2;

public class Human extends Actor {

    public Human(String name) {//конструктор Human, который вызывает конструктор класса Actor
        super(name);
    }
    // переменные которые находятся в родительском классе,
    // в дочерних классах обращение к ним происходит через "super."
    
    @Override
    public String getName() {

        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
}
