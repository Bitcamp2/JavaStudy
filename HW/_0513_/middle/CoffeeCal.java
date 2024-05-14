package _0513_.middle;

public class CoffeeCal {
    public static void main(String[] args) {
        int americano = 1;
        int Latte = 0;
        int Mocha = 0;
        int coldBrew = 2;

        int all = CoffeeMenu.AMERICANO.calculatePrice(2, americano)
                + CoffeeMenu.LATTE.calculatePrice(1,Latte)
                + CoffeeMenu.MOCHA.calculatePrice(2,Mocha)
                + CoffeeMenu.COLDBREW.calculatePrice(0,coldBrew);

        System.out.println(all);

    }
}
