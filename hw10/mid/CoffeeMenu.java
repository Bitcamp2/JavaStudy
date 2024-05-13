package hw10.mid;

public enum CoffeeMenu {

    AMERICANO(2000){
        public int totalPrice(int optionOrder, int normalOrder){
            return ((optionOrder * 2300) + (normalOrder * 2000));
        }
    },
    LATTEM(3000){
        public int totalPrice(int optionOrder, int normalOrder){
            return (optionOrder * 3500) + (normalOrder * 3000);
        }
    },
    MOCHA(4000){
        public int totalPrice(int optionOrder, int normalOrder){
            return (optionOrder * 5000) + (normalOrder * 4000);
        }
    },
    COLDBREW(4500){
        public int totalPrice(int optionOrder, int normalOrder){
            return (optionOrder * 4700) + (normalOrder * 4500);
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
