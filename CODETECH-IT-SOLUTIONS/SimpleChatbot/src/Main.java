import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SimpleChatbot {

    private static final Map<String, String> RESPONSES = new HashMap<>();

    static {
        RESPONSES.put("hello", "Hello! How can I assist you today?");
        RESPONSES.put("hi", "Hello! How can I assist you today?");
        RESPONSES.put("how are you", "I'm just a bot, but thank you for asking!");
        RESPONSES.put("how are you doing", "I'm just a bot, but thank you for asking!");
        RESPONSES.put("what's your name", "I'm a simple chatbot. You can call me Chatbot.");
        RESPONSES.put("who are you", "I'm a simple chatbot. You can call me Chatbot.");
        RESPONSES.put("exit", "Goodbye! Have a great day!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! How can I assist you today?");
        String userInput;
        do {
            System.out.print("User: ");
            userInput = scanner.nextLine().toLowerCase();

            String response = RESPONSES.getOrDefault(userInput, "I'm sorry, I didn't understand that. Can you please rephrase?");
            System.out.println("Bot: " + response);
        } while (!userInput.equals("exit"));

        scanner.close();
    }
}
