//1.2 Класс HotDrinkWithTemperature является наследником класса HotDrink
public class HotDrinkWithTemperature extends HotDrink {

    private int temperature;

    //Конструктор горячий напиток + температура
    public HotDrinkWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature(int temperature) { //Метод, возвращающий температуру
        return temperature; 
    }

    public void setTemperature(int temperature){ //Метод, изменяющий температуру
        this.temperature = temperature;
    }

    @Override

    public String toString() { //Переопределили метод toString(), для наследного класса
        return "HotDrinkWithTemperature {" +
                "name: '" + getName() + '\'' +
                ", volume: " + getVolume() +
                ", temperature: " + temperature +
                '}';
    }

}
