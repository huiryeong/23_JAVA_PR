package CR_Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Season_course {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("LOVE LOAD");	
        frame.setSize(600, 600);				// 스크린 사이즈
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) 
    {
        JLabel title = new JLabel("LOVE ROAD");		// 메인 타이틀
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setBounds(220, 100, 150, 50);
        panel.add(title);
        
        JLabel message = new JLabel("어느 계절의 코스를 추천해드릴까요?");	// 타이틀 화면 문구
        message.setFont(new Font("Serif", Font.PLAIN, 16));
        message.setHorizontalAlignment(JLabel.CENTER);	// 가운데 정렬
        message.setBounds(50, 200, 500, 100); 
        panel.add(message);
        
        JLabel icon_credit = new JLabel("Icons by Icon8");	// 아이콘 출처
        icon_credit.setForeground(Color.GRAY); 
        icon_credit.setFont(new Font("Nanum Gothic", Font.PLAIN, 10)); 
        icon_credit.setBounds(250, 540, 100, 20); 
        panel.add(icon_credit);

        // 계절 아이콘
        ImageIcon spring_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring.png"));
        ImageIcon summer_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/summer.png"));
        ImageIcon autumn_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/autumn.png"));
        ImageIcon winter_button = new ImageIcon(Season_course.class.getResource("/CR_Package/img/winter.png"));

        // 계절 레이블
        JLabel springLabel = new JLabel(spring_button);
        JLabel summerLabel = new JLabel(summer_button);
        JLabel autumnLabel = new JLabel(autumn_button);
        JLabel winterLabel = new JLabel(winter_button);
    
        // 계절 레이블 위치, 크기
        springLabel.setBounds(10, 400, 96, 96); 
        summerLabel.setBounds(160, 400, 96, 96); 
        autumnLabel.setBounds(310, 400, 96, 96); 
        winterLabel.setBounds(460, 400, 96, 96); 
        
        panel.add(springLabel);
        panel.add(summerLabel);
        panel.add(autumnLabel);
        panel.add(winterLabel);
        
        springLabel.addMouseListener(new java.awt.event.MouseAdapter()	
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                JFrame springFrame = new JFrame("봄 장소 추천");
                springFrame.setSize(600, 600);
                
                JPanel springPanel = new JPanel();
                springFrame.add(springPanel);
                
                JLabel springRecommendation = new JLabel("봄에 어울리는 코스를 추천합니다.");
                springPanel.add(springRecommendation);
                
                springFrame.setVisible(true);
            }
        });

        
        summerLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                JFrame summerFrame = new JFrame("여름 장소 추천");
                summerFrame.setSize(600, 600);
                
                JPanel summerPanel = new JPanel();
                summerFrame.add(summerPanel);
                
                JLabel summerRecommendation = new JLabel("여름에 어울리는 코스를 추천합니다.");
                summerPanel.add(summerRecommendation);
                
                summerFrame.setVisible(true);
            }
        });

        
        autumnLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                JFrame autumnFrame = new JFrame("가을 코스 추천");
                autumnFrame.setSize(600, 600);
                
                JPanel autumnPanel = new JPanel();
                autumnFrame.add(autumnPanel);
                
                JLabel autumnRecommendation = new JLabel("가을에 어울리는 코스를 추천합니다.");
                autumnPanel.add(autumnRecommendation);
                
                autumnFrame.setVisible(true);
            }
        });

        
        winterLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                JFrame winterFrame = new JFrame("겨울 코스 추천");
                winterFrame.setSize(600, 600);
                
                JPanel winterPanel = new JPanel();
                winterFrame.add(winterPanel);
                
                JLabel winterRecommendation = new JLabel("겨울에 어울리는 코스를 추천합니다.");
                winterPanel.add(winterRecommendation);
                
                winterFrame.setVisible(true);
            }
        }); 
    }
}
