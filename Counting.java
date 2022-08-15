import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
class Counting
{
     int A=0; int B=0;
     JTextArea a = new JTextArea(10,30);
     void Method()
    {
        JFrame f = new JFrame ("Counting Representative");
        JLabel words = new JLabel("Words: ");
        JLabel characters = new JLabel("Characters: "); 
        JButton b = new JButton("Word Count"); 
        words.setText("Words: "+A);
        characters.setText("Characters: "+B);
        characters.setPreferredSize(new Dimension(130,130));        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e )
            {
                String w_counter,c_counter;
                int wc=0;
                c_counter = a.getText();
                w_counter= a.getText();
                int ws= c_counter.replace(" ","").length();
               characters.setText("Characters: "+ws);                                    
               for(int i=0; i<w_counter.length(); i++)
               {
                    if(w_counter.charAt(i)==' ')
                    {
                       wc++;
                       
                    }
               } 
                words.setText("Words: "+(wc+1)); 
            }
        }); 
       f.add(words);
       f.add(characters);
        f.add(a);
       f.add(b); 
       f.setLayout(new FlowLayout(FlowLayout.CENTER,100,0)); 
       f.setSize(500,500);
       f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
       f.setVisible(true);
    }
    public static void main(String arg[])
    {
        Counting c = new Counting();
        c.Method();    
    }
}
