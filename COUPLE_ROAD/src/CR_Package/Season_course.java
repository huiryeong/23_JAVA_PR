package CR_Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Season_course {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LOVELOAD");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel title = new JLabel("러브로드");
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setBounds(250, 50, 100, 50);
        panel.add(title);

        JButton springButton = new JButton("봄");
        springButton.setBounds(1, 500, 140, 60); // 크기 조정
        springButton.setBackground(new Color(255, 204, 0));
        springButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"봄에 맞는 코스를 추천합니다.");
            }
        });
        panel.add(springButton);

        JButton summerButton = new JButton("여름");
        summerButton.setBounds(150, 500, 140, 60); // 크기 조정
        summerButton.setBackground(new Color(255, 0, 0));
        summerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"여름에 맞는 코스를 추천합니다.");
            }
        });
        panel.add(summerButton);

        JButton autumnButton = new JButton("가을");
        autumnButton.setBounds(300, 500, 140, 60); // 크기 조정
        autumnButton.setBackground(new Color(0, 153, 204));
        autumnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"가을에 맞는 코스를 추천합니다.");
            }
        });
        panel.add(autumnButton);

        JButton winterButton = new JButton("겨울");
        winterButton.setBounds(450, 500, 140, 60); // 크기 조정
        winterButton.setBackground(new Color(0, 102, 204));
        winterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"겨울에 맞는 코스를 추천합니다.");
            }
        });
        panel.add(winterButton);
    }
}
