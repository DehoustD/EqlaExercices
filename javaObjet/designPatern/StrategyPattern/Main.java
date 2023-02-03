public class Main {

    public static void main(String[] args) {

        uInput userInput = new uInput();

        // CreditCardStrategy userCreditCard = new CreditCardStrategy(null, null, null, null);
        // PaypalStrategy userPaypal = new PaypalStrategy(null, null);

        PaymentStrategy userPaymentStrategy;

        boolean usingCreditCard = userInput.AskYesOrNo("utilisez-vous une carte de crédit ?");

        if (usingCreditCard) {

            userPaymentStrategy = new CreditCardStrategy(null, null, null, null);
            
        } else {

            userPaymentStrategy = new PaypalStrategy(null, null);
            
        }

        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("item1", 10);
        Item item2 = new Item("item2", 3);
        Item item3 = new Item("item3", 12);
        Item item4 = new Item("item4", 22);
        Item item5 = new Item("item5", 7);
        Item item6 = new Item("item6", 16);
        
        shoppingCart.AddItem(item1);
        shoppingCart.AddItem(item1);
        shoppingCart.AddItem(item3);
        shoppingCart.AddItem(item6);

        shoppingCart.Pay(userPaymentStrategy);
    
    }

}
