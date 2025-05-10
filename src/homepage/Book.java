package homepage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.*;

public class Book {
      static String first;
      static String middle;
      static String last;
      static String phoneNo;
      static String packageTP;
      static String roomTP;
      static String utils = "";
      
      static int utilPrice;
 
      
      static JRadioButton opt1 = new JRadioButton("Electric Fan");
      static JRadioButton opt2 = new JRadioButton("Electric Kettle");
      static JRadioButton opt3 = new JRadioButton("Electric Griller");
      static JRadioButton opt4 = new JRadioButton("Electric Hotpot");
      static JRadioButton opt5 = new JRadioButton("Rice Cooker");
      static JRadioButton opt6 = new JRadioButton("Turbo Boiler");
      static JRadioButton opt7 = new JRadioButton("Sound Speaker");
      static JRadioButton opt8 = new JRadioButton("₱500 Use of Single burner small Fryingpan & Caserol");
      static JRadioButton opt9 = new JRadioButton("₱500 Use of Video (Strictly until 10pm only)");
      static JRadioButton opt10 = new JRadioButton("Bonfire (Free)");

      
      
       
       static JTextField fname = new JTextField();
       static JTextField mname = new JTextField();
       static JTextField lname = new JTextField();
       static JTextField contact = new JTextField();
      
       static int exist = 0;
       
        public Book(){
            Contact();
        }
        
      public static void Contact(){
          
        JFrame frame = new JFrame();
        frame.setSize(1200,800);
        frame.setTitle("Luz Ville Resort");
        
        JPanel design = new JPanel();
        JPanel bottom = new JPanel();
        JPanel right = new JPanel();
        JPanel left = new JPanel();
        JPanel center = new JPanel();
        center.setBorder(BorderFactory.createTitledBorder("Title"));


        
        
        design.setBackground(Color.black);
        bottom.setBackground(Color.white);
        right.setBackground(Color.white);
        left.setBackground(Color.white);
        center.setBackground(Color.white);
        
        design.setPreferredSize(new Dimension(200, 120));
        design.setLayout(new BorderLayout());
        design.setBorder(null);
        
        bottom.setPreferredSize(new Dimension(200, 70));
        right.setPreferredSize(new Dimension(50, 100));
        left.setPreferredSize(new Dimension(50, 100));
        
        JPanel top = new JPanel();
        top.setPreferredSize(new Dimension(200, 80));
        top.setBackground(Color.white);
        
        JPanel top1 = new JPanel();
        JPanel top2 = new JPanel();
        
        top.add(top1, BorderLayout.EAST);
        top.add(top2, BorderLayout.WEST);
        
        top1.setPreferredSize(new Dimension(600, 80));
        top2.setPreferredSize(new Dimension(500, 50));
        
        top1.setBackground(Color.white);
        top2.setBackground(Color.white);
        
        //=======================================================/
        JButton amenities = new JButton("AMENITIES");
        amenities.setBorder(null);
        amenities.setBackground(Color.white);
        amenities.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        amenities.setForeground(Color.black);
       
        amenities.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Amen();
            frame.dispose();
          
            
        }
        });
        
        JButton rates = new JButton("RATES");
        rates.setBorder(null);
        rates.setBackground(Color.white);
        rates.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        rates.setForeground(Color.black);
        rates.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Rates();
            frame.dispose();
          
            
        }
        });
        
 
        
        JButton home = new JButton("HOME");
        home.setBorder(null);
        home.setBackground(Color.white);
        home.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        home.setForeground(Color.black);
        
        home.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Home();
            frame.dispose();
          
            
        }
        });
        
        
        
        JButton about = new JButton("ABOUT");
        about.setBorder(null);
        about.setBackground(Color.white);
        about.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        about.setForeground(Color.black);
        
        about.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new About();
            frame.dispose();
          
            
        }
        });
        
        JButton book = new JButton("BOOK NOW");
        book.setBackground(new Color(0x556B2F));
        book.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        book.setForeground(Color.white);
        book.setFocusPainted(false);
        book.setBorderPainted(false);



        
        
        
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        
        buttonPanel.add(amenities);
        buttonPanel.add(rates);
        buttonPanel.add(home);
        buttonPanel.add(about);
        buttonPanel.add(book);
        
        buttonPanel.setBackground(Color.white);
        buttonPanel.setPreferredSize(new Dimension(500, 30));
            
        
        top2.add(buttonPanel, BorderLayout.WEST);
        center.setLayout(null);

         if(exist == 1){
         fname = new JTextField(first);
         mname = new JTextField(middle);
         lname = new JTextField(last);
         contact = new JTextField(phoneNo);
         
        }
         
        JLabel contactLabel = new JLabel("Contact Detail");
        contactLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        contactLabel.setForeground(Color.black);
        
        
        JLabel f = new JLabel("Full Name");
        f.setFont(new Font("Tahoma", Font.BOLD, 16));
        f.setForeground(Color.black);
        
       
        
        fname.setFont(new Font("Open Sans", Font.BOLD, 15));
        fname.setBackground(new Color(217, 217, 217));
        fname.setBorder(null);
        fname.setForeground(Color.black);
        
        
         
        mname.setFont(new Font("Open Sans", Font.BOLD, 15));
        mname.setBackground(new Color(217, 217, 217));
        mname.setBorder(null);
        mname.setForeground(Color.black);
        
        
        lname.setFont(new Font("Open Sans", Font.BOLD, 15));
        lname.setBackground(new Color(217, 217, 217));
        lname.setBorder(null);
        lname.setForeground(Color.black);
        
        contact.setFont(new Font("Open Sans", Font.BOLD, 15));
        contact.setBackground(new Color(217, 217, 217));
        contact.setBorder(null);
        contact.setForeground(Color.black);
        

        
        
        JLabel phone = new JLabel("Phone Number");
        
        phone.setFont(new Font("Tahoma", Font.BOLD, 16));
        phone.setForeground(Color.black);
        
        JLabel fn = new JLabel("First Name: ");
        JLabel mn = new JLabel("Middle Name: ");
        JLabel ln = new JLabel("Last Name: ");
        JLabel ex = new JLabel("ex. (1234-567-8901)");
        
        
        JPanel full = new  JPanel(null);
        full.setBounds(50,100,900,400);
        full.setBackground(Color.white);
        
        f.setBounds(0,-30,100,100);
        fname.setBounds(0,30,200,30);
        mname.setBounds(250,30,200,30);
        lname.setBounds(500,30,200,30);
        
        
        fn.setBounds(0,55,200,30);
        mn.setBounds(250,55,200,30);
        ln.setBounds(500,55,200,30);
        
        phone.setBounds(0,105,200,30);
        contact.setBounds(0,130,200,30);
        ex.setBounds(0,155,200,30);

        
        contactLabel.setBounds(50,-25,300,200);
        
        JButton next = new JButton("NEXT");
        next.setBackground(new Color(0x556B2F));
        next.setFont(new Font("Tohoma", Font.BOLD, 20));
        next.setForeground(Color.white);
        next.setFocusPainted(false);
        next.setBorderPainted(false);
        next.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            first = (String) fname.getText();
            middle = (String) mname.getText();
            last = (String) lname.getText();
            phoneNo = (String) contact.getText();
            
            Packages();
            frame.dispose();
          
            
        }
        });
        
        
        next.setBounds(850,500,180,50);
        
        
     



        
       

        full.add(f);
        full.add(fn);
        full.add(mn);
        full.add(ln);
        full.add(fname);
        full.add(mname);
        full.add(lname);
        full.add(phone);
        full.add(contact);
        full.add(ex);
        center.add(next);
        center.add(contactLabel);
        
        center.add(full);
            
        
        

                


        


        
        frame.add(design, BorderLayout.NORTH);  
        design.add(top, BorderLayout.SOUTH);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.add(right, BorderLayout.EAST);
        frame.add(left, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        

        
    }
        public static void Packages(){
        JFrame frame = new JFrame();
        frame.setSize(1200,800);
        frame.setTitle("Luz Ville Resort");
        
        JPanel design = new JPanel();
        JPanel bottom = new JPanel();
        JPanel right = new JPanel();
        JPanel left = new JPanel();
        JPanel center = new JPanel();
        center.setBorder(BorderFactory.createTitledBorder("Title"));


        
        
        design.setBackground(Color.black);
        bottom.setBackground(Color.white);
        right.setBackground(Color.white);
        left.setBackground(Color.white);
        center.setBackground(Color.white);
        
        design.setPreferredSize(new Dimension(200, 120));
        design.setLayout(new BorderLayout());
        design.setBorder(null);
        
        bottom.setPreferredSize(new Dimension(200, 70));
        right.setPreferredSize(new Dimension(50, 100));
        left.setPreferredSize(new Dimension(50, 100));
        
        JPanel top = new JPanel();
        top.setPreferredSize(new Dimension(200, 80));
        top.setBackground(Color.white);
        
        JPanel top1 = new JPanel();
        JPanel top2 = new JPanel();
        
        top.add(top1, BorderLayout.EAST);
        top.add(top2, BorderLayout.WEST);
        
        top1.setPreferredSize(new Dimension(600, 80));
        top2.setPreferredSize(new Dimension(500, 50));
        
        top1.setBackground(Color.white);
        top2.setBackground(Color.white);
        
        //=======================================================/
        JButton amenities = new JButton("AMENITIES");
        amenities.setBorder(null);
        amenities.setBackground(Color.white);
        amenities.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        amenities.setForeground(Color.black);
       
        amenities.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Amen();
            frame.dispose();
          
            
        }
        });
        
        JButton rates = new JButton("RATES");
        rates.setBorder(null);
        rates.setBackground(Color.white);
        rates.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        rates.setForeground(Color.black);
        rates.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Rates();
            frame.dispose();
          
            
        }
        });
        
        JButton home = new JButton("HOME");
        home.setBorder(null);
        home.setBackground(Color.white);
        home.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        home.setForeground(Color.black);
        
        home.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Home();
            frame.dispose();
          
            
        }
        });
        
        JButton about = new JButton("ABOUT");
        about.setBorder(null);
        about.setBackground(Color.white);
        about.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        about.setForeground(Color.black);
        
        about.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new About();
            frame.dispose();
          
            
        }
        });
        
        JButton book = new JButton("BOOK NOW");
        book.setBackground(new Color(0x556B2F));
        book.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        book.setForeground(Color.white);
        book.setFocusPainted(false);
        book.setBorderPainted(false);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        
        buttonPanel.add(amenities);
        buttonPanel.add(rates);
        buttonPanel.add(home);
        buttonPanel.add(about);
        buttonPanel.add(book);
        
        buttonPanel.setBackground(Color.white);
        buttonPanel.setPreferredSize(new Dimension(500, 30));
            
        
        top2.add(buttonPanel, BorderLayout.WEST);
        center.setLayout(null);
        
        //===========================================================================/
        JLabel packageLabel = new JLabel("Packages");
        packageLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        packageLabel.setForeground(Color.black);
        packageLabel.setBounds(50,-25,300,200);
        
        center.add(packageLabel);
        
        
        JPanel full = new  JPanel(null);
        full.setBounds(50,100,1000,400);
        full.setBackground(Color.white);
     
        JPanel package1 = new JPanel();
        package1.setBounds(0,30,275,360);
        
        JPanel package2 = new JPanel();        
        package2.setBounds(360,30,275,360);
        
        JPanel package3 = new JPanel();
        package3.setBounds(720,30,275,360);
        
        //====================================================/ PACKAGE
        JButton selectPackage1 = new JButton("Select");
        selectPackage1.setBackground(new Color(0x556B2F));
        selectPackage1.setFont(new Font("Tohoma", Font.BOLD, 20));
        selectPackage1.setForeground(Color.white);
        selectPackage1.setFocusPainted(false);
        selectPackage1.setBorderPainted(false);
        selectPackage1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            packageTP = "Day Tour";
            Room();
            frame.dispose(); 
        }
        });
        JButton selectPackage2 = new JButton("Select");
        selectPackage2.setBackground(new Color(0x556B2F));
        selectPackage2.setFont(new Font("Tohoma", Font.BOLD, 20));
        selectPackage2.setForeground(Color.white);
        selectPackage2.setFocusPainted(false);
        selectPackage2.setBorderPainted(false);
        selectPackage2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            packageTP = "Day Night";
            Room();
            frame.dispose(); 
        }
        });
        JButton selectPackage3 = new JButton("Select");
        selectPackage3.setBackground(new Color(0x556B2F));
        selectPackage3.setFont(new Font("Tohoma", Font.BOLD, 20));
        selectPackage3.setForeground(Color.white);
        selectPackage3.setFocusPainted(false);
        selectPackage3.setBorderPainted(false);
        selectPackage3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            packageTP = "Overnight";
            Room();
            frame.dispose(); 
        }
        });
        
        
        
        
        
        full.add(package1);
        full.add(package2);
        full.add(package3);
        
        JButton back = new JButton("BACK");
        back.setBackground(new Color(0x556B2F));
        back.setFont(new Font("Tohoma", Font.BOLD, 20));
        back.setForeground(Color.white);
        back.setFocusPainted(false);
        back.setBorderPainted(false);
        back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            exist = 1;
            Contact();
            frame.dispose();
          
            
        }
        });
        
        
        back.setBounds(50,500,180,50);
        
        package1.setLayout(null);
        package2.setLayout(null);
        package3.setLayout(null);
        
        selectPackage1.setBounds(40,310,200,30);
        selectPackage2.setBounds(40,310,200,30);
        selectPackage3.setBounds(40,310,200,30);
        
        package1.add(selectPackage1);
        package2.add(selectPackage2);
        package3.add(selectPackage3);
        
        
        center.add(back);
        center.add(full);
        frame.add(design, BorderLayout.NORTH);  
        design.add(top, BorderLayout.SOUTH);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.add(right, BorderLayout.EAST);
        frame.add(left, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
      }
        /*ROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
        OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM*/
        public static void Room(){
            
        JFrame frame = new JFrame();
        frame.setSize(1200,800);
        frame.setTitle("Luz Ville Resort");
        
        JPanel design = new JPanel();
        JPanel bottom = new JPanel();
        JPanel right = new JPanel();
        JPanel left = new JPanel();
        JPanel center = new JPanel();
        center.setBorder(BorderFactory.createTitledBorder("Title"));


        
        
        design.setBackground(Color.black);
        bottom.setBackground(Color.white);
        right.setBackground(Color.white);
        left.setBackground(Color.white);
        center.setBackground(Color.white);
        
        design.setPreferredSize(new Dimension(200, 120));
        design.setLayout(new BorderLayout());
        design.setBorder(null);
        
        bottom.setPreferredSize(new Dimension(200, 70));
        right.setPreferredSize(new Dimension(50, 100));
        left.setPreferredSize(new Dimension(50, 100));
        
        JPanel top = new JPanel();
        top.setPreferredSize(new Dimension(200, 80));
        top.setBackground(Color.white);
        
        JPanel top1 = new JPanel();
        JPanel top2 = new JPanel();
        
        top.add(top1, BorderLayout.EAST);
        top.add(top2, BorderLayout.WEST);
        
        top1.setPreferredSize(new Dimension(600, 80));
        top2.setPreferredSize(new Dimension(500, 50));
        
        top1.setBackground(Color.white);
        top2.setBackground(Color.white);
        
        //=======================================================/
        JButton amenities = new JButton("AMENITIES");
        amenities.setBorder(null);
        amenities.setBackground(Color.white);
        amenities.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        amenities.setForeground(Color.black);
       
        amenities.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Amen();
            frame.dispose();
          
            
        }
        });
        
        JButton rates = new JButton("RATES");
        rates.setBorder(null);
        rates.setBackground(Color.white);
        rates.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        rates.setForeground(Color.black);
        rates.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Rates();
            frame.dispose();
          
            
        }
        });
        
        JButton home = new JButton("HOME");
        home.setBorder(null);
        home.setBackground(Color.white);
        home.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        home.setForeground(Color.black);
        
        home.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Home();
            frame.dispose();
          
            
        }
        });
        
        JButton about = new JButton("ABOUT");
        about.setBorder(null);
        about.setBackground(Color.white);
        about.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        about.setForeground(Color.black);
        
        about.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new About();
            frame.dispose();
          
            
        }
        });
        
        JButton book = new JButton("BOOK NOW");
        book.setBackground(new Color(0x556B2F));
        book.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        book.setForeground(Color.white);
        book.setFocusPainted(false);
        book.setBorderPainted(false);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        
        buttonPanel.add(amenities);
        buttonPanel.add(rates);
        buttonPanel.add(home);
        buttonPanel.add(about);
        buttonPanel.add(book);
        
        buttonPanel.setBackground(Color.white);
        buttonPanel.setPreferredSize(new Dimension(500, 30));
            
        
        top2.add(buttonPanel, BorderLayout.WEST);
        center.setLayout(null);
        
        //===========================================================================/
        JLabel packageLabel = new JLabel("Select Room Type (optional)");
        packageLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        packageLabel.setForeground(Color.black);
        packageLabel.setBounds(50,-25,500,200);
        
        center.add(packageLabel);
        
        JButton back = new JButton("BACK");
        back.setBackground(new Color(0x556B2F));
        back.setFont(new Font("Tohoma", Font.BOLD, 20));
        back.setForeground(Color.white);
        back.setFocusPainted(false);
        back.setBorderPainted(false);
        back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            exist = 1;
            Packages();
            frame.dispose();
          
            
        }
        });
        
        JButton next = new JButton("NEXT");
        next.setBackground(new Color(0x556B2F));
        next.setFont(new Font("Tohoma", Font.BOLD, 20));
        next.setForeground(Color.white);
        next.setFocusPainted(false);
        next.setBorderPainted(false);
        next.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            Utilities();
            frame.dispose();
          
            
        }
        });
        
        
        next.setBounds(850,500,180,50);
        
        
        back.setBounds(50,500,180,50);
        JPanel full = new  JPanel(null);
        full.setBounds(50,100,1000,400);
        full.setBackground(Color.white);
        
        
        //=====================================================================/ ROOM
        JPanel room1 = new JPanel();
        room1.setBounds(0,30,240,360);
        
        JPanel room2 = new JPanel();        
        room2.setBounds(265,30,240,360);
        
        JPanel room3 = new JPanel();
        room3.setBounds(530,30,240,360);
        
        JPanel room4 = new JPanel();
        room4.setBounds(795,30,240,360);
        
        //====================================================/ ROOM
        JButton selectRoom1 = new JButton("Select");
        selectRoom1.setBackground(new Color(0x556B2F));
        selectRoom1.setFont(new Font("Tohoma", Font.BOLD, 20));
        selectRoom1.setForeground(Color.white);
        selectRoom1.setFocusPainted(false);
        selectRoom1.setBorderPainted(false);
        selectRoom1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            roomTP = "Room #1";
            Utilities();
        }
        });
        JButton selectRoom2 = new JButton("Select");
        selectRoom2.setBackground(new Color(0x556B2F));
        selectRoom2.setFont(new Font("Tohoma", Font.BOLD, 20));
        selectRoom2.setForeground(Color.white);
        selectRoom2.setFocusPainted(false);
        selectRoom2.setBorderPainted(false);
        selectRoom2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            roomTP = "Room #2";
                      Utilities();
        }
        });
        JButton selectRoom3 = new JButton("Select");
        selectRoom3.setBackground(new Color(0x556B2F));
        selectRoom3.setFont(new Font("Tohoma", Font.BOLD, 20));
        selectRoom3.setForeground(Color.white);
        selectRoom3.setFocusPainted(false);
        selectRoom3.setBorderPainted(false);
        selectRoom3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            roomTP = "Room #3";
                        Utilities();
        }
        });
        
        JButton selectRoom4 = new JButton("Select");
        selectRoom4.setBackground(new Color(0x556B2F));
        selectRoom4.setFont(new Font("Tohoma", Font.BOLD, 20));
        selectRoom4.setForeground(Color.white);
        selectRoom4.setFocusPainted(false);
        selectRoom4.setBorderPainted(false);
        selectRoom4.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            roomTP = "Room #4";
            Utilities();
        }
        });
        
        
        
        
        
        full.add(room1);
        full.add(room2);
        full.add(room3);
        full.add(room4);
        center.add(next);

        room1.setLayout(null);
        room2.setLayout(null);
        room3.setLayout(null);
        room4.setLayout(null);

        selectRoom1.setBounds(50,310,150,30);
        selectRoom2.setBounds(50,310,150,30);
        selectRoom3.setBounds(50,310,150,30);
        selectRoom4.setBounds(30,310,150,30);
        
        room1.add(selectRoom1);
        room2.add(selectRoom2);
        room3.add(selectRoom3);
        room4.add(selectRoom4);
        
        frame.add(design, BorderLayout.NORTH);  
        design.add(top, BorderLayout.SOUTH);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.add(right, BorderLayout.EAST);
        frame.add(left, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);
        
        
        center.add(back);
        center.add(full);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        
        }
       /*UTILITIESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
        UTILITIESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
        UTILITIESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS*/
        public static void Utilities(){
                  
        JFrame frame = new JFrame();
        frame.setSize(1200,800);
        frame.setTitle("Luz Ville Resort");
        
        JPanel design = new JPanel();
        JPanel bottom = new JPanel();
        JPanel right = new JPanel();
        JPanel left = new JPanel();
        JPanel center = new JPanel();
        center.setBorder(BorderFactory.createTitledBorder("Title"));


        
        
        design.setBackground(Color.black);
        bottom.setBackground(Color.white);
        right.setBackground(Color.white);
        left.setBackground(Color.white);
        center.setBackground(Color.white);
        
        design.setPreferredSize(new Dimension(200, 120));
        design.setLayout(new BorderLayout());
        design.setBorder(null);
        
        bottom.setPreferredSize(new Dimension(200, 70));
        right.setPreferredSize(new Dimension(50, 100));
        left.setPreferredSize(new Dimension(50, 100));
        
        JPanel top = new JPanel();
        top.setPreferredSize(new Dimension(200, 80));
        top.setBackground(Color.white);
        
        JPanel top1 = new JPanel();
        JPanel top2 = new JPanel();
        
        top.add(top1, BorderLayout.EAST);
        top.add(top2, BorderLayout.WEST);
        
        top1.setPreferredSize(new Dimension(600, 80));
        top2.setPreferredSize(new Dimension(500, 50));
        
        top1.setBackground(Color.white);
        top2.setBackground(Color.white);
        
        //=======================================================/
        JButton amenities = new JButton("AMENITIES");
        amenities.setBorder(null);
        amenities.setBackground(Color.white);
        amenities.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        amenities.setForeground(Color.black);
       
        amenities.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Amen();
            frame.dispose();
          
            
        }
        });
        
        JButton rates = new JButton("RATES");
        rates.setBorder(null);
        rates.setBackground(Color.white);
        rates.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        rates.setForeground(Color.black);
        rates.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Rates();
            frame.dispose();
          
            
        }
        });
        
        JButton home = new JButton("HOME");
        home.setBorder(null);
        home.setBackground(Color.white);
        home.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        home.setForeground(Color.black);
        
        home.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Home();
            frame.dispose();
          
            
        }
        });
        
        JButton about = new JButton("ABOUT");
        about.setBorder(null);
        about.setBackground(Color.white);
        about.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        about.setForeground(Color.black);
        
        about.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new About();
            frame.dispose();
          
            
        }
        });
        
        JButton book = new JButton("BOOK NOW");
        book.setBackground(new Color(0x556B2F));
        book.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        book.setForeground(Color.white);
        book.setFocusPainted(false);
        book.setBorderPainted(false);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        
        buttonPanel.add(amenities);
        buttonPanel.add(rates);
        buttonPanel.add(home);
        buttonPanel.add(about);
        buttonPanel.add(book);
        
        buttonPanel.setBackground(Color.white);
        buttonPanel.setPreferredSize(new Dimension(500, 30));
            
        
        top2.add(buttonPanel, BorderLayout.WEST);
        center.setLayout(null);
        
        //===========================================================================/
        JLabel packageLabel = new JLabel("Select Utilities (optional)");
        packageLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        packageLabel.setForeground(Color.black);
        packageLabel.setBounds(50,-25,500,200);
        
        center.add(packageLabel);
        
        JButton back = new JButton("BACK");
        back.setBackground(new Color(0x556B2F));
        back.setFont(new Font("Tohoma", Font.BOLD, 20));
        back.setForeground(Color.white);
        back.setFocusPainted(false);
        back.setBorderPainted(false);
        back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            exist = 1;
            Room();
            frame.dispose();
          
            
        }
        });
        
        
        
       
        
        
        back.setBounds(50,500,180,50);
        JPanel full = new  JPanel(null);
        full.setBounds(50,100,1000,400);
        full.setBackground(Color.white);
        
        JLabel desc = new JLabel ("Kindly check the things you want to rent: ");
        desc.setBounds(0, 20, 300, 20);
        desc.setFont(new Font("Open Sans", Font.BOLD, 15));
        desc.setForeground(Color.black);
        
        JLabel desc1 = new JLabel ("Electric Appliances");
        desc1.setBounds(0, 50, 300, 20);
        desc1.setFont(new Font("Open Sans", Font.PLAIN, 20));
        desc1.setForeground(Color.black);
        
        JLabel desc2 = new JLabel ("₱200 per appliances");
        desc2.setBounds(0, 70, 300, 30);
        desc2.setFont(new Font("Open Sans", Font.PLAIN, 20));
        desc2.setForeground(Color.black);
        
        JPanel app = new JPanel(new GridLayout(8,0,0,10));
        app.setBackground(Color.white);
        app.setBounds(20,110,200,275);
        
        opt1.setBackground(Color.white);
        opt1.setFont(new Font("Tohoma", Font.BOLD, 15));

        opt2.setBackground(Color.white);
        opt2.setFont(new Font("Tohoma", Font.BOLD, 15));

        opt3.setBackground(Color.white);
        opt3.setFont(new Font("Tohoma", Font.BOLD, 15));

        
       opt4.setBackground(Color.white);
       opt4.setFont(new Font("Tohoma", Font.BOLD, 15));
       opt5.setBackground(Color.white);
       opt5.setFont(new Font("Tohoma", Font.BOLD, 15));
       opt6.setBackground(Color.white);
       opt6.setFont(new Font("Tohoma", Font.BOLD, 15));
       opt7.setBackground(Color.white);
       opt7.setFont(new Font("Tohoma", Font.BOLD, 15));
       
        
        app.add(opt1);
        app.add(opt2);
        app.add(opt3);
        app.add(opt4);
        app.add(opt5);
        app.add(opt6);
        app.add(opt7);
        
        JPanel app1 = new JPanel(new GridLayout(8,0,0,10));
        app1.setBackground(Color.white);
        app1.setBounds(300,110,500,275);
        

        opt8.setBackground(Color.white);
        opt8.setFont(new Font("Tohoma", Font.BOLD, 15));
        

        opt9.setBackground(Color.white);
        opt9.setFont(new Font("Tohoma", Font.BOLD, 15));
        

        opt10.setBackground(Color.white);
        opt10.setFont(new Font("Tohoma", Font.BOLD, 15));
        
        

        JButton next = new JButton("NEXT");
        next.setBackground(new Color(0x556B2F));
        next.setFont(new Font("Tohoma", Font.BOLD, 20));
        next.setForeground(Color.white);
        next.setFocusPainted(false);
        next.setBorderPainted(false);
        next.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            frame.dispose();
        
            if (opt1.isSelected()) {
                utilPrice += 200;
                utils  += " Electric Fan,";
                 opt1.setSelected(true);
                 
            }
            if (opt2.isSelected()) {
                utilPrice += 200;
                utils  += " Electric Kettle,";
                 opt2.setSelected(true);
            }
            if (opt3.isSelected()) {
                utilPrice += 200;
                 utils  += " Electric Fan,";
                   opt3.setSelected(true);
            }
            if (opt4.isSelected()) {
                utilPrice += 200;
                utils  += " Electric Hotpot,";
                  opt4.setSelected(true);
            }
            if (opt5.isSelected()) {
                utilPrice += 200;
                utils  += " Rice Cooker,";
                  opt5.setSelected(true);
            }
            if (opt6.isSelected()) {
                utilPrice += 200;
                utils  += " Turbo Boiler,";
                  opt6.setSelected(true);
            }
            if (opt7.isSelected()) {
                utilPrice += 200;
               utils  += " Sound Speaker,";
                 opt7.setSelected(true);
            }
            if (opt8.isSelected()) {
                utilPrice += 500;
             utils  += " Single Burner,";
               opt8.setSelected(true);
            }
            if (opt9.isSelected()) {
                utilPrice += 500;
            utils  += " Burner,";
              opt9.setSelected(true);
            }
            if (opt10.isSelected()) {
             utils  += " Bonfire,";
               opt10.setSelected(true);
            }
             
            Reception();
            
        }
        });
     
        next.setBounds(850,500,180,50);
        
        
        app1.add(opt8);
        app1.add(opt9);
        app1.add(opt10);
        
        full.add(app);
        full.add(app1);
        full.add(desc);
        full.add(desc1);
        full.add(desc2);
        center.add(next);

      
        
        frame.add(design, BorderLayout.NORTH);  
        design.add(top, BorderLayout.SOUTH);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.add(right, BorderLayout.EAST);
        frame.add(left, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);
        
        
        center.add(back);
        center.add(full);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        }
        
        
        /*RECEPTIOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
        OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
        OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOON*/
        public static void Reception(){
        JFrame frame = new JFrame();
        frame.setSize(1200,800);
        frame.setTitle("Luz Ville Resort");
        
        JPanel design = new JPanel();
        JPanel bottom = new JPanel();
        JPanel right = new JPanel();
        JPanel left = new JPanel();
        JPanel center = new JPanel();
        center.setBorder(BorderFactory.createTitledBorder("Title"));
        
        design.setBackground(Color.black);
        bottom.setBackground(Color.white);
        right.setBackground(Color.white);
        left.setBackground(Color.white);
        center.setBackground(Color.white);
        
        design.setPreferredSize(new Dimension(200, 120));
        design.setLayout(new BorderLayout());
        design.setBorder(null);
        
        bottom.setPreferredSize(new Dimension(200, 70));
        right.setPreferredSize(new Dimension(50, 100));
        left.setPreferredSize(new Dimension(50, 100));
        
        JPanel top = new JPanel();
        top.setPreferredSize(new Dimension(200, 80));
        top.setBackground(Color.white);
        
        JPanel top1 = new JPanel();
        JPanel top2 = new JPanel();
        
        top.add(top1, BorderLayout.EAST);
        top.add(top2, BorderLayout.WEST);
        
        top1.setPreferredSize(new Dimension(600, 80));
        top2.setPreferredSize(new Dimension(500, 50));
        
        top1.setBackground(Color.white);
        top2.setBackground(Color.white);
        
        //=======================================================/
        JButton amenities = new JButton("AMENITIES");
        amenities.setBorder(null);
        amenities.setBackground(Color.white);
        amenities.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        amenities.setForeground(Color.black);
       
        amenities.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Amen();
            frame.dispose();
          
            
        }
        });
        
        JButton rates = new JButton("RATES");
        rates.setBorder(null);
        rates.setBackground(Color.white);
        rates.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        rates.setForeground(Color.black);
        rates.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Rates();
            frame.dispose();
          
            
        }
        });
        
        JButton home = new JButton("HOME");
        home.setBorder(null);
        home.setBackground(Color.white);
        home.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        home.setForeground(Color.black);
        
        home.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new Home();
            frame.dispose();
          
            
        }
        });
        
        JButton about = new JButton("ABOUT");
        about.setBorder(null);
        about.setBackground(Color.white);
        about.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        about.setForeground(Color.black);
        
        about.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            new About();
            frame.dispose();
          
            
        }
        });
        
        JButton book = new JButton("BOOK NOW");
        book.setBackground(new Color(0x556B2F));
        book.setFont(new Font("Mongolian Baiti", Font.ROMAN_BASELINE, 16));
        book.setForeground(Color.white);
        book.setFocusPainted(false);
        book.setBorderPainted(false);


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        
        buttonPanel.add(amenities);
        buttonPanel.add(rates);
        buttonPanel.add(home);
        buttonPanel.add(about);
        buttonPanel.add(book);
        
        buttonPanel.setBackground(Color.white);
        buttonPanel.setPreferredSize(new Dimension(500, 30));
            
        
        top2.add(buttonPanel, BorderLayout.WEST);
        center.setLayout(null);
        
        //===========================================================================/
        JLabel packageLabel = new JLabel("Receipt Date");
        packageLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        packageLabel.setForeground(Color.black);
        packageLabel.setBounds(50,-25,500,200);
        
                
        JLabel bookBy = new JLabel ("Book by: ");  
        bookBy.setFont(new Font("Tahoma", Font.BOLD, 15));
        bookBy.setForeground(Color.black);
        bookBy.setBounds(500,-70,500,200);
        JLabel name = new JLabel ("Name: ");
        name.setFont(new Font("Tahoma", Font.BOLD, 15));
        name.setForeground(Color.black);
        name.setBounds(500,-45,500,200);
        
        JLabel nameF = new JLabel (first + " " + middle + " " + last);
        nameF.setFont(new Font("Tahoma", Font.PLAIN, 15));
        nameF.setForeground(Color.black);
        nameF.setBounds(575,-45,500,200);
        
        
        JLabel contactN = new JLabel ("Contact: ");
        contactN.setFont(new Font("Tahoma", Font.BOLD, 15));
        contactN.setForeground(Color.black);
        contactN.setBounds(500,-20,500,200);
        
        JLabel contactR = new JLabel (phoneNo);
        contactR.setFont(new Font("Tahoma", Font.PLAIN, 15));
        contactR.setForeground(Color.black);
        contactR.setBounds(575,-20,500,200);
        
         
        JPanel full = new  JPanel(null);
        full.setBounds(50,100,1000,400);
        full.setBackground(Color.white);
        
        JPanel Line1 = new JPanel();
        JPanel Line2 = new JPanel();
        JPanel Line3 = new JPanel();
        JPanel Line4 = new JPanel();
        JPanel Line5 = new JPanel();
        JPanel Line6 = new JPanel();
        
        JLabel packageL = new JLabel ("Package: ");
        packageL.setBounds(50,0,100,100);
        Line1.setBounds(0,60,1000,2);
        
        JLabel packageT = new JLabel (packageTP);
        packageT.setBounds(55,30,100,100);
        
        JLabel amount = new JLabel ("Amount: ");
        amount.setBounds(850,0,100,100);
        
        JLabel roomT = new JLabel ("Room Type: ");
        roomT.setBounds(50,65,100,100);
        Line2.setBounds(0,100,1000,2);
        
        JLabel roomTPY = new JLabel (roomTP);
        roomTPY.setBounds(55,100,100,100);
        
        Line3.setBounds(0,130,1000,2);
        Line4.setBounds(0,170,1000,2);
        Line5.setBounds(0,200,1000,2);
        Line6.setBounds(0,240,1000,2);
       
        JLabel util = new JLabel ("Utilities: ");
        util.setBounds(50,135,100,100);
        
        JLabel utilL = new JLabel (utils);
        utilL.setBounds(55,170,500,100);
        
        full.add(utilL);
        full.add(packageL);
        full.add(roomTPY);
        full.add(packageT);
        full.add(amount);
        full.add(Line1);
        full.add(roomT);
        full.add(Line2);
        full.add(Line3);
        full.add(Line4);
        full.add(Line5);
        full.add(util);
        full.add(Line6);
        
      
        
        center.add(bookBy);
        center.add(name);
        center.add(nameF);
        center.add(contactN);
        center.add(contactR);
        center.add(packageLabel);
        
        JButton back = new JButton("BACK");
        back.setBackground(new Color(0x556B2F));
        back.setFont(new Font("Tohoma", Font.BOLD, 20));
        back.setForeground(Color.white);
        back.setFocusPainted(false);
        back.setBorderPainted(false);
        back.setBounds(50,500,180,50);

        back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            exist = 1;
            Utilities();
            frame.dispose();
            utils = "";
            utilPrice = 0;
          
            
        }
        });
        
        JButton next = new JButton("BOOK ANOTHER");
        next.setBackground(new Color(0x556B2F));
        next.setFont(new Font("Tohoma", Font.BOLD, 15));
        next.setForeground(Color.white);
        next.setFocusPainted(false);
        next.setBorderPainted(false);
        next.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            new Home();
            frame.dispose();
          
            
        }
        });
        
        
        next.setBounds(850,500,180,50);

       

            
            
            
        frame.add(design, BorderLayout.NORTH);  
        design.add(top, BorderLayout.SOUTH);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.add(right, BorderLayout.EAST);
        frame.add(left, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);
        
        center.add(next);
        center.add(back);
        center.add(full);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
            
        }
        
        
        
      
      
      
    public static void main(String[] args) {
         new Book();
    }  
    
}

    

