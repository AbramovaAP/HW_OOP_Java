//2 Преобразовали класс VendingMachine в interface
public interface VendingMachine {

    // метод getProduct() хранит в себе информацию о входном напитке
    HotDrink getProduct(int name, int volume, int temperature);

    //Метод для добавления напитка
    void addProduct(HotDrink product);
}