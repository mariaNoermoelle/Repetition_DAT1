import java.util.ArrayList;

public class ShoppingCart
{
    private int discount;
    public ShoppingCart()
    {
    }
    ArrayList<Item> itemList = new ArrayList<>();

    public void setDiscount(int discount1)
    {
        this.discount=discount1;
        if(discount1>0) {
        }
    }

    public void addItem(Item item)
    {
        itemList.add(item);
    }

    public void removeItem(Item item)
    {
        itemList.remove(item);
    }

    public int getTotalPrice()
    {
        int sum = 0;
        for(Item item : itemList)
        {
            sum = sum + item.getPrice() - discount;
        }
        return sum;
    }

    public ArrayList<Item> getItems()
    {
        for(Item item : itemList)
        {
            System.out.println(item);
        }
        return itemList;
    }

}
