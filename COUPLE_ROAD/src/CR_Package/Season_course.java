package CR_Package;

import javax.swing.*;
import java.awt.*;

public class Season_course {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LOVE LOAD");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        JLabel title = new JLabel("LOVE ROAD");
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setBounds(220, 100, 150, 50);
        panel.add(title);

        JLabel message = new JLabel("어느 계절의 코스를 추천해드릴까요?");
        message.setFont(new Font("Serif", Font.PLAIN, 16));
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setBounds(50, 200, 500, 100);
        panel.add(message);

        JLabel icon_credit = new JLabel("Icons by Icon8");
        icon_credit.setForeground(Color.GRAY);
        icon_credit.setFont(new Font("Nanum Gothic", Font.PLAIN, 10));
        icon_credit.setHorizontalAlignment(JLabel.CENTER);
        icon_credit.setBounds(250, 540, 100, 20);
        panel.add(icon_credit);

        ImageIcon spring_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring.png"));
        ImageIcon summer_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/summer.png"));
        ImageIcon autumn_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/autumn.png"));
        ImageIcon winter_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/winter.png"));

        JLabel springLabel = new JLabel(spring_button);
        JLabel summerLabel = new JLabel(summer_button);
        JLabel autumnLabel = new JLabel(autumn_button);
        JLabel winterLabel = new JLabel(winter_button);

        springLabel.setBounds(45, 400, 96, 96); 
        summerLabel.setBounds(183, 400, 96, 96); 
        autumnLabel.setBounds(321, 400, 96, 96); 
        winterLabel.setBounds(459, 400, 96, 96); 

        panel.add(springLabel);
        panel.add(summerLabel);
        panel.add(autumnLabel);
        panel.add(winterLabel);

        springLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCourseSelectionFrame("봄");
            }
        });

        summerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCourseSelectionFrame("여름");
            }
        });

        autumnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCourseSelectionFrame("가을");
            }
        });

        winterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCourseSelectionFrame("겨울");
            }
        });
    }

    private static void createCourseSelectionFrame(String season) {
        JFrame frame = new JFrame(season + " 코스 추천");
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        JLabel title = new JLabel(season + "에 어울리는 코스를 추천합니다.");
        title.setFont(new Font("Serif", Font.BOLD, 32));
        topPanel.add(title);
        frame.add(topPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 10, 50));

        JButton mealButton = new JButton("식사");
        JButton cafeButton = new JButton("카페");
        JButton tourButton = new JButton("관광");
        
        Dimension preferredSize = new Dimension(600, 240); 
        mealButton.setPreferredSize(preferredSize);
        cafeButton.setPreferredSize(preferredSize);
        tourButton.setPreferredSize(preferredSize);

        buttonPanel.add(mealButton);
        buttonPanel.add(cafeButton);
        buttonPanel.add(tourButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }


}
