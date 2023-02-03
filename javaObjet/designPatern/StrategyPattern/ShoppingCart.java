import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    // Properties.

    private List<Item> items;

    // Constructor.

    public ShoppingCart(){
        items = new ArrayList<Item>();
    }

    // Getters.

    public List<Item> getItems() {
        return items;
    }

    // Methods.

    public void AddItem(Item _item){
        items.add(_item);
    }

    public void RemoveItem(Item _item){
        items.remove(_item);
    }

    public int CalculateTotal(){
        int sum = 0;
        for(Item _item : items){
            sum += _item.getPrice();
        }
        return sum;
    }

    public void Pay(PaymentStrategy _PaymentMethod){
        int _amount = CalculateTotal();
        _PaymentMethod.Pay(_amount);

        //System.out.println(_amount);
    }

}