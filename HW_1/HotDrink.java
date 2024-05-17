public class HotDrink { //1. Создали класс ГорячийНапиток

    private String name;
    private int volume;

    public HotDrink(String name, int volume) { //1.1 Создали конструктор самого напитка, т.е. метод, который будет вызываться при создании очередного напитка
        this.name = name;
        this.volume = volume;
    }

    public String getName() {//Метод, возвращающий название
        return name;
    }
    
    public void setName(String name){ //Метод, изменяющий название
        this.name = name;
    }

    public int getVolume() { //Метод, возвращающий объем
        return volume;
    }

    public void setVolume(int volume){ //Метод, изменяющий объем
        this.volume = volume;
    }

    @Override

    public String toString() { //Переопределили метод toString(), для красивого вывода
        return "HotDrink {" +
                "name: '" + name + '\'' +
                ", volume: " + volume +
                '}';
    }
}