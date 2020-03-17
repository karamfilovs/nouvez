package enums;

public class CheckoutQuantity {


    1("1"),
    2("2"),
    3("3"),
    4("4"),
    5("5"),
    6("6"),
    7("7"),
    8("8"),
    9("9"),
    10("10");

    private String checkoutQuantity;

    private CheckoutQuantity(String checkoutQuantity) {
        this.checkoutQuantity = checkoutQuantity;
    }

    public String getCheckoutQuantity() {
        return checkoutQuantity;
    }
}
}

