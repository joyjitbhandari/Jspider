package Pass_By_reference;

public class TrainTickets {
    void ticket(){
        System.out.println("Tickets booked");
    }
}
class IRCTC {
    public static void main(String[] args){
        TrainTickets T = new TrainTickets();
        Customer4.needTicket(T);
    }
}
class Customer4 {
    static void needTicket(TrainTickets T1){
        T1.ticket();
    }
}
