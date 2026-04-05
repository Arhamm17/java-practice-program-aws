public class Hello {
    public static void main(String[] args) {
        MessageService service = new MessageService();
        String msg = "Hello Class Calling -> " + service.getMessage();
        
        // Simulate sending data to JS
        System.out.println(msg);
    }
}