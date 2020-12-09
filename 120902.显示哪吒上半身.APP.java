import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class APP {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> label_list=new ArrayList<>();//list集合
    //定义二维数组
    int array2d[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
//            {10,11,0}
    };
    int cnt=0;//定义初始值为0
    int cell=128;//定义图片的宽度高度
    //构造方法
    public APP() {
        //循环9个元素和图片,0-9
        for (int i = 0; i <=9; i++) {
            //添加元素
            label_list.add(new JLabel());
            //图片引用地址，String.valueOf(i)把值转换为String类型
            java.net.URL imgURL = APP.class.getResource("img/nezha_"+String.valueOf(i)+".png");
            label_list.get(i).setIcon(new ImageIcon(imgURL));
        }
//          双重for循环，可以设置x，y坐标，还可以添加mypanel元素。
        for (int row = 0; row < array2d.length; row++) {//行
            for (int column = 0; column < array2d[0].length; column++) {//列
                //列为x*128坐标，行为y*128坐标,cell的值是128
                label_list.get(cnt).setBounds(column*cell,row*cell,cell,cell);
                //在面板上循环添加多个元素
                myPanel.add(label_list.get(cnt));
                cnt++;//cnt=cnt+1
            }
        }
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
        frame.setBounds(100,100,384,512);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new APP().go();
    }
}
