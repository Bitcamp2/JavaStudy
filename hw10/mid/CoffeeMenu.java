package hw10.mid;

public enum CoffeeMenu {

    AMERICANO(2000){
        public int totalPrice(int optionOrder, int normalOrder){
            return ((optionOrder * (getPrice() + 300) + (normalOrder * getPrice())));
        }
    },
    LATTE(3000){
        public int totalPrice(int optionOrder, int normalOrder){
            return (optionOrder * (getPrice() + 500)) + (normalOrder * getPrice());
        }
    },
    MOCHA(4000){
        public int totalPrice(int optionOrder, int normalOrder){
            return (optionOrder * (getPrice() + 1000)) + (normalOrder * getPrice());
        }
    },
    COLDBREW(4500){
        public int totalPrice(int optionOrder, int normalOrder){
            return (optionOrder * (getPrice() + 200)) + (normalOrder * getPrice());
        }
    };

    private int price;

    CoffeeMenu(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int totalPrice(int optionOrder, int normalOrder);
}
