import javax.swing.*;

public class SwingChatApp {

    private static ChatWindow mainChatWindow;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainChatWindow = new ChatWindow();
            }
        });
    }
}
