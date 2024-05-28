/*Задание 1.1

Необходимо реализовать:
Интерфейс ActorBehavoir, который будет содержать описание возможных
действий актора в очереди/магазине
 */
package HW_2;

public interface ActorBehaviour {
    //set - методы
    void setMakeOrder(boolean makeOrder); //метод setMakeOrder меняет параметр makeOrder 
    void setTakeOrder(boolean takeOrder); //метод setTakeOrder меняет параметр takeUpOrder
    //"get"-методы
    boolean isMakeOrder();
    boolean isTakeOrder();
}
