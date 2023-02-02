import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    // Properties.

    private List<Item> items;

    // Constructor.

    public ShoppingCart(){
        items = new ArrayList<Item>();
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

}