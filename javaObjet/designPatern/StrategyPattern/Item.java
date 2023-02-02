public class Item {

    // Properties.
    
    private String upcCode;
    private int price;

    //#region Getters.

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

    //#endregion Getters.

    // Constructor.

    public Item(String _upcCode, int _price) {
        upcCode = _upcCode;
        price = _price;
    }
}
