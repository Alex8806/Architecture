interface CashProvider {
    long getCard();

    void setCard(long card);

    long getHashCard();

    void setHashCard(long hashCard);

    boolean isAuthorization();

    void setAuthorization(boolean authorization);

    boolean buy(double price);

    void authorization(Customer customer);
}