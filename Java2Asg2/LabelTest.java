import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
/**
 *
 * @author lawtonb
 */
public class LabelTest extends JFrame
{
     private JLabel label1, label2, label3;
     
     public static void main( String args[] ) 
     {      
          LabelTest application = new LabelTest();
          application.buildInterface();
          application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
     
     }
     
     public LabelTest()   
     {
         super( "Testing JLabel" );
         
     }
 
     public void buildInterface()
     {
         Container mycontainer = getContentPane();
         mycontainer.setLayout( new FlowLayout() );

         
         setSize( 325, 100 );      
       setVisible( true );  
         
         label1 = new JLabel( "Label with text" );
         label1.setToolTipText( "This is label-1" );
         mycontainer.add( label1 );
 
         Icon bug = new ImageIcon( "C:\\Users\\jwint\\OneDrive\\Documents\\Coding\\Java\\Java2Asg2\\bug1.gif" );
         label2 = new JLabel( "Label with text and icon", bug, SwingConstants.LEFT );
         label2.setToolTipText( "This is label-2" );
         mycontainer.add( label2 );
         
         label3 = new JLabel();
         label3.setText( "Label with icon and text at bottom" );
         label3.setIcon( bug ); 
         label3.setHorizontalTextPosition( SwingConstants.CENTER );
         label3.setVerticalTextPosition( SwingConstants.BOTTOM );
         label3.setToolTipText( "This is label-3" );
         mycontainer.add( label3 );
 
         setSize( 275, 170 );
         setVisible( true );
         
     }
    
}