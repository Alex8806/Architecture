import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class Customer {
    private int id;
    private List<Ticket> tickets = new ArrayList<>();
    private CashProvider cash;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public CashProvider getCash() {
        return cash;
    }

    public void setCash(CashProvider cash) {
        this.cash = cash;
    }

    public boolean buyTicket(Ticket ticket) {
        if (cash.buy(ticket.getPrice())) {
            tickets.add(ticket);
            return true;
        }
        return false;
    }

    public Ticket[] search(Date dateTime, long rootNumber) {
        List<Ticket> foundTickets = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.getDate().equals(dateTime) && ticket.getRootNumber() == rootNumber) {
                foundTickets.add(ticket);
            }
        }
        return foundTickets.toArray(new Ticket[0]);
    }
}