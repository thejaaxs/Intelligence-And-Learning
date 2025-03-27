// AI ChatBot System Using OOPS 

interface Chatbot {
    void respondToMessage(String message);

    void learnNewPhrase(String phrase);
}

class AICompanionBot implements Chatbot {
    @Override
    public void respondToMessage(String message) {
        System.out.println("Customer Support : " + message);
    }

    @Override
    public void learnNewPhrase(String phrase) {
        System.out.println("Learning new support phrase : " + phrase);
    }
}

public class tenthExampleAbs {
    public static void main(String[] args) {
        Chatbot chat1 = new AICompanionBot();
        chat1.respondToMessage("Hello Folks !");
        chat1.learnNewPhrase("Its the end of the Code !");
    }
}
