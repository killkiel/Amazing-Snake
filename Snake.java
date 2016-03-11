import java.awt.EventQueue;
import javax.swing.*;



//access of the program run here...
public class Snake extends JFrame {

    public Snake() {
        add(new GameF());
        
        setResizable(true);
        pack();
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame ex = new Snake();
                ex.setVisible(true);                
            }
        });
    }
}
