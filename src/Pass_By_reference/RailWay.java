package Pass_By_reference;

public class RailWay {
    void Ticket(){
        System.out.println("Booking");
    }
}
class IRCTC1 {
    public static void main(String[] args){
        TrainTickets T = new TrainTickets();
        Passengers.needTicket(T);
    }
}
class Passengers {
    static void needTicket(TrainTickets T1){
        T1.ticket();
    }
}
