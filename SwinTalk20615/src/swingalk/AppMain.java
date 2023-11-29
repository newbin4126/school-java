package swingalk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppMain extends JFrame implements ActionListener {

    String userId;

    JButton btn_login;
    JTextField txt_login;

    JLabel profile;
    JLabel status;

    public static void main(String[] args) {
        new AppMain();
    }

    public AppMain() {
        setSize (320, 600);
        setTitle("RobotChat Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(254, 229, 0));



        txt_login = new JTextField("20600 홍길동");
        btn_login = new JButton("로그인");

        ImageIcon image = new ImageIcon("img/Gopher.png");
        profile = new JLabel(image);
        status = new JLabel("자바 왜씀 고언어가 있는데");
        status.setHorizontalAlignment(SwingConstants.CENTER);

        txt_login.setBounds(50, 400, 200, 30);
        btn_login.setBounds(50, 440, 200, 30);
        profile.setBounds(60, 100, 200, 220);
        status.setBounds(70, 340, 160, 20);

        panel.add(btn_login);
        panel.add(txt_login);
        panel.add(profile);
        panel.add(status);
        add(panel);
        setVisible(true);

        btn_login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_login){
            String userId = txt_login.getText().trim();
            if(userId.length() == 0) {
                JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
            } else {
                new Chat(userId);
                dispose();
            }
        }
    }
}
