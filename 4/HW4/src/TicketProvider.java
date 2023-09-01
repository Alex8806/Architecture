interface TicketProvider {
    public class TicketProvider {
        private List<Ticket> availableTickets;

        public TicketProvider(List<Ticket> availableTickets) {
            this.availableTickets = availableTickets;
        }

        public List<Ticket> getTicket(long rootNumber) {
            List<Ticket> matchingTickets = new ArrayList<>();
            for (Ticket ticket : availableTickets) {
                if (ticket.getRootNumber() == rootNumber) {
                    matchingTickets.add(ticket);
                }
            }
            return matchingTickets;
        }

        public boolean updateTicketStatus(Ticket ticket) {
            for (Ticket availableTicket : availableTickets) {
                if (availableTicket.equals(ticket)) {
                    availableTicket.setValid(ticket.isValid());
                    return true;
                }
            }
            return false;
        }
    }

}