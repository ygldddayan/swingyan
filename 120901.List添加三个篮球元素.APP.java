import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class APP {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> label_goodPlane = new ArrayList<>();//集合
    //构造方法
    public APP() {
        //添加元素
        label_goodPlane.add(new JLabel());
        label_goodPlane.add(new JLabel());
        label_goodPlane.add(new JLabel());

        java.net.URL imgURL = APP.class.getResource("img/pic.jpg");
        label_goodPlane.get(0).setIcon(new ImageIcon(imgURL));
        label_goodPlane.get(0).setBounds(0,100,528,428);
        myPanel.add(label_goodPlane.get(0));

        label_goodPlane.get(1).setIcon(new ImageIcon(imgURL));
        label_goodPlane.get(1).setBounds(400,100,528,428);
        myPanel.add(label_goodPlane.get(1));

        label_goodPlane.get(2).setIcon(new ImageIcon(imgURL));
        label_goodPlane.get(2).setBounds(800,100,528,428);
        myPanel.add(label_goodPlane.get(2));
        //删除
//       myPanel.remove(label_goodPlane.get(0));
       //刷新
//       myPanel.repaint();
    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1300,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new APP().go();
    }
}
