import java.util.Date;

public class Ticket {
    private long rootNumber;
    private double price;
    private int place;
    private Date date;
    private boolean isValid;


    public Ticket(long rootNumber, double price, int place, Date date, boolean isValid) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
        this.date = date;
        this.isValid = isValid;
    }


    public long getRootNumber() {
        return rootNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getPlace() {
        return place;
    }

    public Date getDate() {
        return date;
    }

    public boolean isValid() {
        return isValid;
    }


    public void setRootNumber(long rootNumber) {
        this.rootNumber = rootNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber=" + rootNumber +
                ", price=" + price +
                ", place=" + place +
                ", date=" + date +
                ", isValid=" + isValid +
                '}';
    }}
