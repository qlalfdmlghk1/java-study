package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(); // 생성자를 호출하는 코드
        Item item1 = new Item("마늘", 2000, 2);  // 생성자를 호출하는 코드
        Item item2 = new Item("상추", 3000, 4);  // 생성자를 호출하는 코드
        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayItems();
    }
}
