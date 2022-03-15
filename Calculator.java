/*Java Program to Demonstrate a Basic Calculator using Applet*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Calculator extends Applet implements ActionListener
{
    TextField input;
    //Function to add features to the frame
    public void init()
    {
	setBackground(Color.white);
	setLayout(null);
	int i;
	input = new TextField();
	input.setBounds(150,100,270,50);
	this.add(input);
	Button button[] = new Button[10];
	for(i=0;i<10;i++)
	{
	    button[i] = new Button(String.valueOf(9-i));
	    button[i].setBounds(150+((i%3)*50),150+((i/3)*50),50,50);
	    this.add(button[i]);
	    button[i].addActionListener(this);
	}
	Button dec=new Button(".");
	dec.setBounds(200,300,50,50);
	this.add(dec);
	dec.addActionListener(this);
 
	Button clr=new Button("C");
	clr.setBounds(250,300,50,50);
	this.add(clr);
	clr.addActionListener(this);
 
	Button operator_btn[] = new Button[5];
	operator_btn[0]=new Button("/");
	operator_btn[1]=new Button("*");
	operator_btn[2]=new Button("-");
	operator_btn[3]=new Button("+");
	operator_btn[4]=new Button("=");
	for(i=0;i<4;i++)
	{
	    operator_btn[i].setBounds(300,150+(i*50),50,50);
	    this.add(operator_btn[i]);
	    operator_btn[i].addActionListener(this);
	}
	operator_btn[4].setBounds(350,300,70,50);
	this.add(operator_btn[4]);
	operator_btn[4].addActionListener(this);
    }
    String number1="";
    String op="";
    String number2="";
    //Function to calculate the expression
    public void actionPerformed(ActionEvent e)
    {
	String button = e.getActionCommand();
        char ch = button.charAt(0);
	if(ch>='0' && ch<='9'|| ch=='.') 
	{ 
	    if (!op.equals("")) 
		number2 = number2 + button; 
	    else
		number1 = number1 + button;   
	    input.setText(number1+op+number2); 
	} 
	else if(ch=='C') 
	{ 
	    number1 = op = number2 = ""; 
	    input.setText(""); 
	}
	else if (ch =='=') 
	{ 
	    if(!number1.equals("") && !number2.equals(""))
	    {
		double temp;
		double n1=Double.parseDouble(number1);
		double n2=Double.parseDouble(number2);
		if(n2==0 && op.equals("/"))
		{
		    input.setText(number1+op+number2+" = Zero Division Error");
		    number1 = op = number2 = "";
		}
		else
		{
		    if (op.equals("+")) 
		        temp = n1 + n2; 
		    else if (op.equals("-")) 
		        temp = n1 - n2; 
		    else if (op.equals("/")) 
	  	        temp = n1/n2; 
		    else
		        temp = n1*n2; 
		    input.setText(number1+op+number2+" = "+temp); 
		    number1 = Double.toString(temp);
		    op = number2 = ""; 
	        }
            }
	    else
	    {
		number1 = op = number2 = ""; 
		input.setText("");
	    }
        } 
	else 
	{ 
	    if (op.equals("") || number2.equals("")) 
		op = button; 
	    else 
	    { 
		double temp;
		double n1=Double.parseDouble(number1);
		double n2=Double.parseDouble(number2);
		if(n2==0 && op.equals("/"))
		{
		    input.setText(number1+op+number2+" = Zero Division Error");
		    number1 = op = number2 = "";
		}
		else
		{
		    if (op.equals("+")) 
		        temp = n1 + n2; 
		    else if (op.equals("-")) 
		        temp = n1 - n2; 
		    else if (op.equals("/")) 
	  	        temp = n1/n2; 
		    else
		        temp = n1*n2; 
		    number1 = Double.toString(temp); 
		    op = button; 
		    number2 = ""; 
	        }
            }
	    input.setText(number1+op+number2);
        }
    }
}
/*
<applet code = Calculator.class width=600 height=600>
</applet>
*/