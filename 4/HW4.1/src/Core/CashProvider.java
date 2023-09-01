package Core;

import Interfaces.ICarrierRepo;
import Interfaces.ICashRepo;
import Models.Carrier;
import Models.Ticket;
import Models.User;
import Services.CarrierRepository;
import Services.CashRepository;

public class CashProvider {
    private long cardNumber;
    private boolean isAuthorized;
    private CashRepository cashRepository;
    private CarrierRepository carrierRepository;

    public CashProvider() {

        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    public void authorization(User client) {
        //Здесь должна быть реализована сверка аккаунта приложения и банковского аккаунта.
        cardNumber = client.getCardNumber();
        isAuthorized = true;
    }

    public boolean buy(Ticket ticket) throws RuntimeException {
        if (isAuthorized) {
            Carrier carrier = carrierRepository.read(1);
            return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());}
        return false;}


}