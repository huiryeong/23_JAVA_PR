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
        First_frame(panel);

        frame.setVisible(true);
    }

    
    // 첫 화면
    private static void First_frame(JPanel panel) 
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

        springLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Second_frame("봄");
            }
        });

        summerLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Second_frame("여름");
            }
        });

        autumnLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Second_frame("가을");
            }
        });

        winterLabel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent evt) 
            {
            	Second_frame("겨울");
            }
        });
    }

    
    // 두 번째 화면
    // 레이아웃 제거 후 직접 지정으로 변경
    private static void Second_frame(String season) {
        JFrame frame = new JFrame(season + " 장소 추천");
        frame.setSize(600, 600);
        frame.setLayout(null); 

        JLabel message = new JLabel(season + "에 어울리는 장소를 목적에 맞게 추천 받아보세요.");
        message.setFont(new Font("Serif", Font.BOLD, 20));
        Dimension size = message.getPreferredSize();
        int x = (600 - size.width) / 2; 
        message.setBounds(x, 100, size.width, size.height); 
        frame.add(message);

        Dimension buttonSize = new Dimension(130, 200); 
        
        JButton mealButton = new JButton("식사");
        JButton cafeButton = new JButton("카페");
        JButton tourButton = new JButton("관광");
        

        mealButton.setBounds(80, 250, buttonSize.width, buttonSize.height); 
        cafeButton.setBounds(230, 250, buttonSize.width, buttonSize.height); 
        tourButton.setBounds(380, 250, buttonSize.width, buttonSize.height); 

        frame.add(mealButton);
        frame.add(cafeButton);
        frame.add(tourButton);

        mealButton.addActionListener(e -> Third_frame(season, "식사"));
        cafeButton.addActionListener(e -> Third_frame(season, "카페"));
        tourButton.addActionListener(e -> Third_frame(season, "관광"));

        frame.setVisible(true);
    }


    
    // 마지막 화면
    private static void Third_frame(String season, String content) 
    {
        JFrame content_frame = new JFrame(season + " " + content);
        content_frame.setSize(600, 600);

        JPanel content_panel = new JPanel(null);

        // 장소 이미지와 설명
        ImageIcon image = null;
        String name = "";
        String text = "";

        // 모든 경우에 출력될 이미지와 설명
        
        // 봄
        if (season.equals("봄") && content.equals("식사")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_meal.jfif"));
            name = "단양 보리곳간";
            text = "직접 재배하는 산나물과 지역 농민들이 재배하는 \n 제철 재료로 만든 요리를 판매하는 식당";
            //https://map.naver.com/p/search/%EB%B3%B4%EB%A6%AC%EA%B3%B3%EA%B0%84/place/1561549247?placePath=?entry=pll&from=nx&fromNxList=true&c=15.00,0,0,0,dh
        } 
        else if (season.equals("봄") && content.equals("카페")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_cafe.jpg"));
            name = "보령 청보리 창고";
            text = "- 푸른 청보리 밭을 보며 봄의 청량함을 느낄 수 있다. \n - 드라마 '그해 우리는' 촬영지";
            //https://m.blog.naver.com/goeun061133/223177333187?isInf=true
        }
        else if (season.equals("봄") && content.equals("관광")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/spring_tour.jpg"));
            name = "순천 선암사";
            text = "- 벚나무가 많고, 겹벚꽃을 볼 수 있다. \n - 산으로 둘러싸여 있어 자연을 즐기기 적합하다.";
            //http://travel.chosun.com/site/data/html_dir/2015/03/06/2015030602608.html
        }
        
        
        // 여름
        else if (season.equals("여름") && content.equals("식사")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/summer_meal.jfif"));
            name = "송도 통큰조개";
            text = "바다를 보며 조개 요리를 먹을 수 있는 식당";
            //https://blog.naver.com/sacato/223079668473
        } 
        else if (season.equals("여름") && content.equals("카페")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/summer_cafe.jpg"));
            name = "강릉 보사노바";
            text = "- 오션 뷰, 파도 소리와 커피를 즐길 수 있다.";
            //https://kr.trip.com/moments/detail/gangwon-do-1185-12725580/
        }
        else if (season.equals("여름") && content.equals("관광")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/summer_tour.png"));
            name = "춘천 해피초원목장";
            text = "- 여름의 초록빛 자연과 춘천호의 조화 \n - 다양한 동물 먹이주기 체험 가능";
            //https://www.ecolivestock.org/magazine_theium/?q=YToxOntzOjEyOiJrZXl3b3JkX3R5cGUiO3M6MzoiYWxsIjt9&bmode=view&idx=8659330&t=board
        }      
         
        
        // 가을
        else if (season.equals("가을") && content.equals("식사")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/autumn_meal.jp"));
            name = "약수터산장";
            text = "시원하게 뚫려있는 창으로 가을 마운틴 뷰를 보며 식사할 수 있는 오리고깃집 ";
        } 
        else if (season.equals("가을") && content.equals("카페")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/autumn_cafe.jpg"));
            name = "피드";
            text = "가을 계곡을 즐길 수 있는 애견동반 까페";
        }
        else if (season.equals("가을") && content.equals("관광")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/autumn_tour.jpg"));
            name = "사굼부리";
            text = "제주도의 관광명소 중 억새로 뒤덮혀 있어 가을의 정취를 느낄 수 있는 장소.";
        }
        
        
      // 겨울
        else if (season.equals("겨울") && content.equals("식사")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/winter_meal.jfif"));
            name = "우리회 포차";
            text = "겨울 대방어를 즐길 수 있는 접근성 좋은 서울에 위치한 식당";
        } 
        else if (season.equals("겨울") && content.equals("카페")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/winter_cafe.jpg"));
            name = "회화나무";
            text = "사계절 창덕궁 뷰를 보며 따뜨한 음료를 즐길 수 있는 까페";
        }
        else if (season.equals("겨울") && content.equals("관광")) 
        {
            image = new ImageIcon(Season_course.class.getResource("/CR_Package/img/winter_tour.jpg"));
            name = "무주 덕유산리조트";
            text = "리조트를 타고 올라가 설천봉까지 오를 수 있으며 멋진 설경을 볼 수 있는 등산로";
        }
        
        
        JLabel title_label = new JLabel(season + " " + content);
        title_label.setFont(new Font("Serif", Font.BOLD, 24));
        title_label.setHorizontalAlignment(SwingConstants.CENTER);
        title_label.setBounds(0, 20, 600, 30); 
        content_panel.add(title_label);
        
        Image og = image.getImage();
        Image standard_size_image = og.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        image = new ImageIcon(standard_size_image);

        JLabel image_label = new JLabel(image);
        image_label.setBounds(150, 70, 300, 300); 
        content_panel.add(image_label);

        JLabel name_label = new JLabel(name);
        name_label.setFont(new Font("Serif", Font.PLAIN, 18));
        name_label.setHorizontalAlignment(SwingConstants.CENTER);
        name_label.setBounds(0, 400, 600, 30); 
        content_panel.add(name_label);
        
        JLabel text_label = new JLabel("<html>" + text.replace("\n", "<br>") + "</html>");
        text_label.setFont(new Font("Serif", Font.PLAIN, 18));
        text_label.setHorizontalAlignment(SwingConstants.LEFT); 
        text_label.setBounds(110, 430, 500, 100); 
        content_panel.add(text_label);

        content_frame.add(content_panel);
        content_frame.setVisible(true);
    }
}
