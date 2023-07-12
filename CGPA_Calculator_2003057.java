//package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CGPA_Calculator_2003057 extends JFrame implements ActionListener{
   // String a;
   float sum=0,crdt=0;
   int i=0,yy;
  private Container c;
  private JLabel label1= new JLabel("Subject:");
  private JLabel label2= new JLabel("GPA:");
  private JLabel label3= new JLabel("Credit:");
  private JLabel label4= new JLabel();
  private JLabel label5= new JLabel("");
  private JLabel label6= new JLabel();
  private JLabel[] label8= new JLabel[10];{
    for(int i=0;i<10;i++) label8[i]= new JLabel(); 
  }
  
  private JTextField txt1=  new JTextField(),txt2=new JTextField(),txt3= new JTextField();
  private JButton btn1= new JButton("Next");
  private JButton btn2= new JButton("Calculate");
    CGPA_Calculator_2003057(){
        c= this.getContentPane();
        c.setLayout(null);
        //this.label8[3];
        label1.setBounds(20,20,100,30);
        label2.setBounds(120,20,100,30);
        label3.setBounds(220,20,100,30);
        label4.setBounds(20,70,100,30);
        label5.setBounds(120,70,100,30);
        label6.setBounds(220,70,100,30);
        for(int i=0;i<10;i++) label8[i].setBounds(20,150+i*30,400,30);
        //txt1= new JTextField("text");
        txt1.setBounds(20,50,100,30);
        txt2.setBounds(120,50,100,30);
        txt3.setBounds(220,50,100,30);
        
        btn1.setBounds(220,100,100,30);
        btn2.setBounds(120,100,100,30);
        //
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(label5);
        c.add(label6);
        for(int i=0;i<10;i++) c.add(label8[i]);
        c.add(txt1);
        c.add(txt2);
        c.add(txt3);
        c.add(btn1);
        c.add(btn2);
       //
        txt1.addActionListener(this);
        txt2.addActionListener(this);
        txt3.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
  @Override
	public void actionPerformed(ActionEvent e){
         
        {
            if(e.getSource()==txt1){String a;
            a=txt1.getText();
            label4.setText(a);
            
            //++;
        }
        if(e.getSource()==txt2){
            String a;
            a=txt2.getText();
            label5.setText(a);
            //sum+=Float.parseFloat(a);
            //i++;
        }
        if(e.getSource()==txt3){
            String a;
            a=txt3.getText();
            label6.setText(a);
            //;
            //i++;
        }
        if(e.getSource()==btn1){
            String a1,b1,c;
            a1=txt2.getText();
            b1= txt3.getText();
            c= txt1.getText();
            sum+= Float.parseFloat(a1)*Float.parseFloat(b1);
            crdt+=Float.parseFloat(b1);
            txt1.setText(""); 
            txt2.setText("");
            txt3.setText("");
            label4.setText("");
            label5.setText("");
            label6.setText("");
            yy=i+1;
            for(;i<yy;i++){
                label8[i].setText(c+"   "+a1+"   "+ b1);
            }
            
            
        }
        if(e.getSource()==btn2){
            String a1="0",b1="0",c="";
            a1=txt2.getText();
            b1= txt3.getText();
            c= txt1.getText();
            if(txt1.getText().isEmpty()||txt2.getText().isEmpty()||txt3.getText().isEmpty()){
                float cgpa=sum/crdt;
                label8[i].setText("Inputs are not COMPLETE..!!!");
                label8[i+1].setText("showing result without the last input...");
                JOptionPane.showMessageDialog(null,"Your CGPA is "+cgpa, "CONGRATULATIONS!!", 1);
            }
            else{
                sum+= Float.parseFloat(a1)*Float.parseFloat(b1);
                crdt+=Float.parseFloat(b1);
                txt1.setText(""); 
                txt2.setText("");
                txt3.setText("");
                label4.setText("");
                label5.setText("");
                label6.setText("");
                yy=i+1;
                for(;i<yy;i++){
                    label8[i].setText(c+"   "+a1+"   "+b1);
                }
                float cgpa=sum/crdt;
                JOptionPane.showMessageDialog(null,"Your CGPA is "+cgpa, "CONGRATULATIONS!!", 1);
            }
            }
            }
            
        
        
    }
public static void main(String[] args) {
    CGPA_Calculator_2003057 frame= new CGPA_Calculator_2003057();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("frame");
    frame.setBounds(400, 400, 500, 500);
    //LabelClass
   // frame.getContentPane().setBackground(Color.BLACK);// frame background
   
    
}
}