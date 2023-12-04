package CR_Package;

import javax.swing.*;
import java.awt.*;

public class Season_course 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("LOVE ROAD");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    
    // 첫 화면
    private static void placeComponents(JPanel panel) 
    {
        JLabel title = new JLabel("LOVE ROAD");
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setBounds(220, 100, 150, 50);
        panel.add(title);

        JLabel message = new JLabel("어느 계절의 장소를 추천해드릴까요?");
        message.setFont(new Font("Serif", Font.PLAIN, 16));
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setBounds(50, 200, 500, 100);
        panel.add(message);

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

        springLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                createCourseSelectionFrame("봄");
            }
        });

        summerLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                createCourseSelectionFrame("여름");
            }
        });

        autumnLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                createCourseSelectionFrame("가을");
            }
        });

        winterLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
                createCourseSelectionFrame("겨울");
            }
        });
    }

    
    // 두 번째 화면
    private static void createCourseSelectionFrame(String season) 
    {
        JFrame frame = new JFrame(season + " 장소 추천");
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        JLabel title = new JLabel(season + "에 어울리는 장소를 목적에 맞게 추천 받아보세요.");
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

        mealButton.addActionListener(e -> showContent(season, "식사"));
        cafeButton.addActionListener(e -> showContent(season, "카페"));
        tourButton.addActionListener(e -> showContent(season, "관광"));

        frame.setVisible(true);
    }

    
    // 마지막 화면
    private static void showContent(String season, String content) 
    {
        JFrame content_frame = new JFrame(season + " " + content);
        content_frame.setSize(600, 600);

        JPanel content_panel = new JPanel();
        content_panel.setLayout(new BorderLayout());

        // 장소 이미지와 설명
        ImageIcon image = null;
        String text = "";

        // 모든 경우에 출력될 이미지와 설명
        
        // 봄
        if (season.equals("봄") && content.equals("식사")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_meal.png"));
            text = "봄의 식사";
        } 
        else if (season.equals("봄") && content.equals("카페")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_cafe.png"));
            text = "봄의 카페";
        }
        else if (season.equals("봄") && content.equals("관광")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_tout.png"));
            text = "봄의 관광";
        }
        
        
        // 여름
        else if (season.equals("여름") && content.equals("식사")) 
        {
            //image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_meal.png"));
        	text = "봄의 식사";
        } 
        else if (season.equals("여름") && content.equals("카페")) 
        {
            //image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_cafe.png"));
        	text = "봄의 카페";
        }
        else if (season.equals("여름") && content.equals("카페")) 
        {
            //image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_cafe.png"));
        	text = "봄의 관광";
        }
        
        
        // 가을
        else if (season.equals("가을") && content.equals("식사")) 
        {
            //image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_meal.png"));
        	text = "봄의 식사";
        } 
        else if (season.equals("가을") && content.equals("카페")) 
        {
            //image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_cafe.png"));
        	text = "봄의 카페";
        }
        else if (season.equals("가을") && content.equals("카페")) 
        {
            //image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_cafe.png"));
        	text = "봄의 관광";
        }
        
        
        // 겨울
        else if (season.equals("겨울") && content.equals("식사")) 
        {
            //image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_meal.png"));
        	text = "봄의 식사";
        } 
        else if (season.equals("겨울") && content.equals("카페")) 
        {
            //image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_cafe.png"));
        	text = "봄의 카페";
        }
        else if (season.equals("겨울") && content.equals("카페")) 
        {
            //image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_cafe.png"));
        	text = "봄의 관광";
        }
        
        
        JPanel image_text_panel = new JPanel(new BorderLayout());

        JLabel title_label = new JLabel(season + " " + content);
        title_label.setFont(new Font("Serif", Font.BOLD, 24));
        title_label.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel title_panel = new JPanel();
        title_panel.add(title_label);

        // 간격을 위해서 빈 레이블 생성
        JLabel empty_label = new JLabel(" ");
        JPanel empty_panel = new JPanel();
        empty_panel.add(empty_label);

        JLabel image_label = new JLabel(image);
        image_text_panel.add(image_label, BorderLayout.WEST);

        JLabel text_label = new JLabel(text);
        text_label.setFont(new Font("Serif", Font.PLAIN, 18));
        text_label.setHorizontalAlignment(SwingConstants.CENTER);
        image_text_panel.add(text_label, BorderLayout.CENTER);

        JPanel all_Panel = new JPanel(new GridLayout(3, 1));
        all_Panel.add(title_panel);
        all_Panel.add(empty_panel);
        all_Panel.add(image_text_panel);
        content_panel.add(all_Panel, BorderLayout.NORTH);

        content_frame.add(content_panel);
        content_frame.setVisible(true);
    }
}
