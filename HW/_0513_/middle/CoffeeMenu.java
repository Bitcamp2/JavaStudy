package _0513_.middle;

public enum CoffeeMenu {
    AMERICANO(2000) {
        @Override
        public int calculatePrice(int optionOrder, int normalOrder) {
            return ((getBasePrice() + 300) * optionOrder) + getBasePrice()*normalOrder;
        }
    },
    LATTE(3000) {
        @Override
        public int calculatePrice(int optionOrder, int normalOrder) {
            return ((getBasePrice() + 500) * optionOrder) + getBasePrice()*normalOrder;
        }
    },
    MOCHA(4000) {
        @Override
        public int calculatePrice(int optionOrder, int normalOrder) {
            return ((getBasePrice() + 1000) * optionOrder) + getBasePrice()*normalOrder;
        }
    },
    COLDBREW(4500) {
        @Override
        public int calculatePrice(int optionOrder, int normalOrder) {
            return ((getBasePrice() + 200) * optionOrder) + getBasePrice()*normalOrder;
        }
    };

    private final int basePrice;

    CoffeeMenu(int basePrice) {
        this.basePrice = basePrice;
    }
    public int getBasePrice() {
        return basePrice;
    }

    public abstract int calculatePrice(int optionOrder, int normalOrder);

}
