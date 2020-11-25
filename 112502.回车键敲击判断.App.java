import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A = new JTextArea();
    JTextArea textArea_B = new JTextArea();
    //构造方法
    public App() {
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
             if(e.getKeyCode()==KeyEvent.VK_ENTER){
                 if((textArea_A.getText()).equals("白雪公子")){
                     textArea_B.setText("是滴，是滴\n");
                 }
                 else {
                     textArea_B.setText("你错了\n");
                 }
             }
            }
        });
    }
    //显示窗体方法
    void go(){
        textArea_A.setBounds(100,100,300,200);
        textArea_B.setBounds(100,400,300,200);
        textArea_A.setBackground(Color.orange);
        textArea_B.setBackground(Color.PINK);
        textArea_A.setText("魔镜，魔镜，谁是这个世界上最美丽的人？");
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
