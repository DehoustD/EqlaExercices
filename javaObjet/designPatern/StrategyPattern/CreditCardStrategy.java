public class CreditCardStrategy implements PaymentStrategy {

    // Properties.

    private String name, cardNumber, cvv, expirationDate;

    //#region Getters.

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
    //#endregion Getters.

    // Constructeur.

    public CreditCardStrategy(String _name, String _cardNumber, String _cvv, String _expirationDate) {
        name = _name;
        cardNumber = _cardNumber;
        cvv = _cvv;
        expirationDate = _expirationDate;
    }

    @Override
    public void Pay(int _amount) {

        System.out.println(_amount + "€ ont été payé avec une carte de crédit");

    }

}
