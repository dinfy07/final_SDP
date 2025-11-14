package Payment;

public class PaymentAdapter implements KaspiAlaqan {
    PaymentCard paymentCard;

    public PaymentAdapter() {
        paymentCard = new PaymentCard();
    }

    public void pay () {
        paymentCard.payment();
    }
}
