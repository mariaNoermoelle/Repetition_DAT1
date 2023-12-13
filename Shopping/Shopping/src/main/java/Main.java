public class Main
{
    public static void main(String[] args)
    {
        Item apple = new Item("Apple", 5);
        Item milk = new Item("Milk", 12);
        Item flowers = new Item("Flowers", 39);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(apple);
        shoppingCart.addItem(milk);
        shoppingCart.addItem(flowers);

        System.out.println("Total: " + shoppingCart.getTotalPrice());

        shoppingCart.removeItem(apple);

        System.out.println("Without apple: " + shoppingCart.getTotalPrice());

        System.out.println(shoppingCart.getItems());

        shoppingCart.setDiscount(10);

        System.out.println("Total with discount: " + shoppingCart.getTotalPrice());
    }
}
