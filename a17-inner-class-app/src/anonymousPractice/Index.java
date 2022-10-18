package anonymousPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Index {
    public static void main(String[] args) {
//        1、创建窗口
        JFrame win = new JFrame("登陆界面");

//        2、创建桌布 并添加到窗口
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登陆");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(win, "你点了一下啊，666");
            }
        });

        panel.add(btn);

        JButton btnr = new JButton("注册");
        btnr.addActionListener(e -> JOptionPane.showMessageDialog(win, "你点了一下啊，333"));
        panel.add(btnr);


        win.setSize(400, 300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
