public class PaypalStrategy implements PaymentStrategy{

    // Properties.

    private String emailID, password;

    //#region Getters.

    public String getEmailID() {
        return emailID;
    }

    public String getPassword() {
        return password;
    }

    //#endregion Getters.

    // Constructor.

    public PaypalStrategy(String _emailID, String _password) {
        emailID = _emailID;
        password = _password;
    }

    @Override
    public void Pay(int _amount) {
        
        
    }
    
}
