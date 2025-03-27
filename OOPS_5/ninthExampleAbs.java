// Event Management Using OOPS

abstract class Event {
    abstract void organizeEvent();
}

class WeddingEvent extends Event {
    public void organizeEvent() {
        System.out.println("Organizing the Wedding Event !");
    }
}

class CorporateEvent extends Event {
    public void organizeEvent() {
        System.out.println("Organizing the Corporate Event !");
    }
}

class EventFactory {
    public static Event getEvent(String eventType) {
        switch (eventType) {
            case "Wedding":
                return new WeddingEvent();
            case "Corporate":
                return new CorporateEvent();
            default:
                throw new IllegalArgumentException("Unknown Event Type");
        }
    }
}

public class ninthExampleAbs {
    public static void main(String args[]) {
        Event wedding = EventFactory.getEvent("Wedding");
        wedding.organizeEvent();
        Event corporate = EventFactory.getEvent("Corporate");
        corporate.organizeEvent();
    }
}
