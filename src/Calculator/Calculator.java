package Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
    JPanel panel1;//面板1，上面放20个按钮（5行4列）
    JButton[] buttons1;//面板1上的按钮数组

    JPanel panel2;//面板2，上面放4个按钮（4行1列）
    JButton[] buttons2;//面板2上的按钮数组

    JPanel panel3;//面板3，上面放2个按钮（1行2列）
    JButton[] buttons3;//面板3上的按钮数组

    JPanel panel4;//面板4，上面放1个按钮（1行1列）
    JButton button4;

    JPanel panel5;//面板5，上面放1个按钮（1行1列）
    JButton button5;

    JPanel radioBtnPanel; //单选框

    JPanel optionPanel; //左侧复杂操作面板
    JButton[] optButtons;

    private void initMenu() {
        JLabel findLabel = new JLabel("查看(V)");
        findLabel.setBounds(20, 5, 80, 30);
        findLabel.setFont(new Font("微软雅黑", Font.BOLD, 16));
        this.add(findLabel);

        JLabel editLabel = new JLabel("编辑(E)");
        editLabel.setBounds(85, 5, 80, 30);
        editLabel.setFont(new Font("微软雅黑", Font.BOLD, 16));
        this.add(editLabel);

        JLabel helpLabel = new JLabel("帮助(H)");
        helpLabel.setBounds(165, 5, 80, 30);
        helpLabel.setFont(new Font("微软雅黑", Font.BOLD, 16));
        this.add(helpLabel);
    }

    private void initDisplay() {
        JTextField calText = new JTextField(20);
        calText.setBounds(20, 45, 650, 80);
        calText.setFont(new Font("微软雅黑", Font.BOLD, 16));
        this.add(calText);
    }

    private void initDegreeOption() {
        radioBtnPanel = new JPanel();
        radioBtnPanel.setSize(300, 30);
        radioBtnPanel.setLocation(20, 130);
        radioBtnPanel.setLayout(new GridLayout(1,3,2,2));
        ButtonGroup bg = new ButtonGroup();
        JRadioButton degreeBtn = new JRadioButton("度");
        JRadioButton radianBtn = new JRadioButton("弧度");
        JRadioButton gradientBtn = new JRadioButton("梯度");

        degreeBtn.setFont(new Font("微软雅黑", Font.BOLD, 16));
        radianBtn.setFont(new Font("微软雅黑", Font.BOLD, 16));
        gradientBtn.setFont(new Font("微软雅黑", Font.BOLD, 16));

        bg.add(degreeBtn);
        bg.add(radianBtn);
        bg.add(gradientBtn);
        radioBtnPanel.add(degreeBtn);
        radioBtnPanel.add(radianBtn);
        radioBtnPanel.add(gradientBtn);
        this.add(radioBtnPanel);
    }

    private void initOptionPanel() {
        optionPanel = new JPanel();
        optionPanel.setSize(320, 280);
        optionPanel.setLocation(20, 180);
        optionPanel.setLayout(new GridLayout(5,5,2,2));
        String[] titles={" ","Inv","In","(",")","Int","sih","sin","x2","n!","dms","cosh","cos","xy","y√x","π","tanh","tan","x3","3x","F-E","Exp","Mod","log","10x"};
        optButtons=new JButton[25];
        for(int i=0;i<titles.length;i++)
        {
            optButtons[i]=new JButton(titles[i]);
//            optButtons[i].setFont(new Font("微软雅黑", Font.BOLD, 15));
            optionPanel.add(optButtons[i]);
        }
        this.add(optionPanel);
    }

    private void initPanel1()//初始化面板1以及上面的控件
    {
        panel1=new JPanel();
        panel1.setSize(255, 280);
        panel1.setLocation(350, 125);
        panel1.setLayout(new GridLayout(5,4,2,2));
        String[] titles={"MC","MR","MS","M+","<-","CE","C","+-","7","8","9","/","4","5","6","*","1","2","3","-"};
        buttons1=new JButton[20];
        for(int i=0;i<titles.length;i++)
        {
            buttons1[i]=new JButton(titles[i]);
//            buttons1[i].setFont(new Font("微软雅黑", Font.BOLD, 15));
            panel1.add(buttons1[i]);
        }
        this.add(panel1);
    }

    private void initPanel2()//初始化面板2以及上面的控件
    {
        panel2=new JPanel();
        panel2.setSize(65, 225);
        panel2.setLocation(606, 125);
        panel2.setLayout(new GridLayout(4,1,2,2));
        String[] titles={"M-","√","%","1/x"};
        buttons2=new JButton[4];
        for(int i=0;i<titles.length;i++)
        {
            buttons2[i]=new JButton(titles[i]);
            panel2.add(buttons2[i]);
        }
        this.add(panel2);
    }

    private void initPanel3()//初始化面板3以及上面的控件
    {
        panel3=new JPanel();
        panel3.setSize(126, 53);
        panel3.setLocation(478, 406);
        panel3.setLayout(new GridLayout(1,2,2,2));
        String[] titles={".","+"};
        buttons3=new JButton[2];
        for(int i=0;i<titles.length;i++)
        {
            buttons3[i]=new JButton(titles[i]);
            panel3.add(buttons3[i]);
        }
        this.add(panel3);
    }

    private void initPanel4()//初始化面板4以及上面的控件
    {
        panel4=new JPanel();
        panel4.setSize(65, 109);
        panel4.setLocation(606, 350);
        panel4.setLayout(new GridLayout(1,1,2,2));
        button4=new JButton("=");
        panel4.add(button4);
        this.add(panel4);
    }

    private void initPanel5()//初始化面板5以及上面的控件
    {
        panel5=new JPanel();
        panel5.setSize(125, 52);
        panel5.setLocation(350, 407);
        panel5.setLayout(new GridLayout(1,1,2,2));
        button5=new JButton("0");
        panel5.add(button5);
        this.add(panel5);
    }
    public Calculator() {
        setSize(750,550);
        setTitle("计算器");
        setLayout(null);
        initMenu();
        initDisplay();
        initDegreeOption();
        initOptionPanel();
        initPanel1();
        initPanel2();
        initPanel3();
        initPanel4();
        initPanel5();
        setVisible(true);
    }
}
