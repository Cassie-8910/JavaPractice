package Practice5;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class AddNewStudent {
    private static JFrame frame;
    static  JDBCopt jdbcExp = null;

    public static void main(String[] args) {
//      JFrame 基础，使屏幕上的windows对象 能够最大化 最小化 关闭
        frame = new JFrame("添加学生记录");

//      创建面板， 相当于 <div>标签
        JPanel panel = new JPanel();
        placeComponents(panel);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); //设置界面可见

    }

    public static void placeComponents(JPanel panel) {
        // 自定义组件添加到panel面板中
        // 标签
        //学号
        JLabel stunoLabel = new JLabel("学号");
        stunoLabel.setBounds(75, 40, 80, 30);
        stunoLabel.setFont(new Font("微软雅黑", Font.BOLD, 16));
        panel.add(stunoLabel);

        // 学号输入框
        JTextField stunoText = new JTextField(20);
        stunoText.setBounds(145, 40, 170, 30);
        stunoText.setFont(new Font("微软雅黑", Font.BOLD, 16));
        panel.add(stunoText);

        //姓名
        JLabel nameLabel = new JLabel("姓名");
        nameLabel.setBounds(75, 100, 80, 30);
        nameLabel.setFont(new Font("微软雅黑", Font.BOLD, 16));
        panel.add(nameLabel);

        //姓名输入框
        JTextField nameText = new JTextField(25);
        nameText.setBounds(145, 100, 170, 30);
        nameText.setFont(new Font("微软雅黑", Font.BOLD, 16));
        panel.add(nameText);

        //性别
        JLabel sexLabel = new JLabel("性别");
        sexLabel.setBounds(75, 160, 80, 30);
        sexLabel.setFont(new Font("微软雅黑", Font.BOLD, 16));
        panel.add(sexLabel);

        //性别选择
        JComboBox<String> sexBox = new JComboBox();
        sexBox.addItem("请选择");
        sexBox.addItem("男");
        sexBox.addItem("女");
        sexBox.setBounds(145, 160, 80, 30);
        sexBox.setFont(new Font("微软雅黑", Font.BOLD, 16));
        panel.add(sexBox);

        JButton addButton = new JButton("添加");
        addButton.setBounds(100, 240, 80, 30);
        addButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
        addButton.addActionListener(e -> {
            try {
                if(jdbcExp == null)
                jdbcExp = new JDBCopt();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame.getContentPane(),
                        "请检查数据库连接", "系统提示", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String id = stunoText.getText();
            String name = nameText.getText();
            String gender = sexBox.getItemAt(sexBox.getSelectedIndex());
            if (id.isEmpty() || name.isEmpty() || gender.isEmpty()) {
                JOptionPane.showMessageDialog(frame.getContentPane(),
                        "请输入用户信息", "系统提示", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Student student = new Student(id, name, gender);
            try {
                jdbcExp.insert(student);
                JOptionPane.showMessageDialog(frame.getContentPane(),
                        "添加成功", "系统提示", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame.getContentPane(),
                        "添加失败，用户已存在", "系统提示", JOptionPane.ERROR_MESSAGE);
            }
        });
        panel.add(addButton);

        JButton clearButton = new JButton("清空");
        clearButton.setBounds(200, 240, 80, 30);
        clearButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
        clearButton.addActionListener(e -> {
            stunoText.setText("");
            nameText.setText("");
            sexBox.setSelectedIndex(0);
        });
        panel.add(clearButton);
        panel.setLayout(null);
    }
}

