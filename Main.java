
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Андрей");
        Human human2 = new Human("Сергей");
        Human human3 = new Human("Илья");
        Market market = new Market();
        market.acceptToMarket(human1);
        market.update();
        System.out.println();
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}