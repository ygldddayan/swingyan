import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class APP {
    JPanel myPanel=new JPanel();
    JLabel label_plane = new JLabel();
    JLabel label_background = new JLabel();

    int size = 64;
    //构造方法
    public APP() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() ==e.VK_UP){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()-size,size,size);
                }else if(e.getKeyCode() ==e.VK_DOWN){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()+size,size,size);
                }else if(e.getKeyCode() ==e.VK_LEFT){
                    label_plane.setBounds(label_plane.getX()-size,label_plane.getY(),size,size);
                }else if(e.getKeyCode() ==e.VK_RIGHT){
                    label_plane.setBounds(label_plane.getX()+size,label_plane.getY(),size,size);
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = APP.class.getResource("img/plane2.png");
        java.net.URL backgroundURL = APP.class.getResource("img/background.png");
        label_plane.setIcon(new ImageIcon(imgURL));
        label_plane.setBounds(100,100,size,size);
        myPanel.add(label_plane);

        label_background.setIcon(new ImageIcon(backgroundURL));
        label_background.setBounds(0,0,1000,950);
        myPanel.add(label_background);


        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,30,1000,950);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new APP().go();
    }
}
