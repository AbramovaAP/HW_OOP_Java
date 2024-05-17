//2.1.  Создали класс HotDrinksVendingMachine, который является наследниклом интерфейса VendingMachine

import java.util.HashSet;
import java.util.Set;

public class HotDrinksVendingMachine implements VendingMachine {

    private Set<HotDrink> hotDrinks;

    public HotDrinksVendingMachine(Set<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    //Конструктор с пустым списком
    public HotDrinksVendingMachine() {
        this(new HashSet<>());
    }

    @Override

    //2.2 Перегружаем метод getProduct, на выходе будет напиток, 
    // который соответствует имени, объёму и температуре
    public HotDrink getProduct(int name, int volume, int temperature) {
        if (name == 1) {
            return new HotDrinkWithTemperature("Tea", volume, temperature);
        } else if (name == 2) {
            return new HotDrinkWithTemperature("Coffee", volume, temperature);
        } else {
            return null; // Вернет null, если пнапиток не найден
        }

    }

    @Override
    public void addProduct(HotDrink product) {
        hotDrinks.add(product);
    }

}
