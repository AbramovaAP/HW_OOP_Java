public class Main {

    public static void main(String[] args) {

        //Инициализация горячих напитков (HotDrink)
        HotDrink tea = new HotDrinkWithTemperature("Tea", 250, 75);
        HotDrink coffee = new HotDrinkWithTemperature("Coffee", 100, 80);

        //Вывод информации по HotDrink, вывод оформляем используя метод toString(), который мы переопределили
        System.out.println();
        System.out.println(tea.toString());
        System.out.println(coffee.toString());
        System.out.println();

        //Инициализация горячих напитков торгового автомата (HotDrinksVendingMachine)
        HotDrinksVendingMachine HDvendingMachine = new HotDrinksVendingMachine();
        //Добавление напиков в автомат
        HDvendingMachine.addProduct(tea);
        HDvendingMachine.addProduct(coffee);
        
        HotDrink teaFromMachine = HDvendingMachine.getProduct(1, 250, 75);
        HotDrink coffeeFromMachine = HDvendingMachine.getProduct(2, 100, 80);
        HotDrink coffeeFromMachine1 = HDvendingMachine.getProduct(2, 350, 90);
     
        //Вывод информации по HotDrinksVendingMachine
        System.out.println(teaFromMachine.toString());
        System.out.println(coffeeFromMachine.toString());
        System.out.println(coffeeFromMachine1.toString());
        System.out.println();

    }

}