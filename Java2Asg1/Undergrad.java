/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author lawtonb
 */
public class Undergrad extends Student
{
     public Undergrad()
     {
        int hours;
        int rate;
        public HourlyEmp(int arghours, int argrate)
        {
            super("007");
            hours = arghours;
            rate = argrate;
        }
         super("1001", 75, 75);
     }
    @Override
     protected char calcLetterGrade(double input)
        {
            
            //int  sumA, sumB, sumC, sumD, sumF;
            //sumA=sumB=sumC=sumD=sumF=0;
            char letterGrade;
            //while(input != -99){

            if(input>=90){
                //sumA++;
                //System.out.println(input + "      A");
                letterGrade = 'A';
	    }
            else if(input >= 80){
                //sumB++;
                //System.out.println(input + "      B");
                letterGrade = 'B';
            }
            else if(input >= 70){
                //sumC++;
                //System.out.println(input + "      C");
                letterGrade = 'C';
            }
            else if(input >= 60){
                //sumD++;
                //System.out.println(input + "      D");
                letterGrade = 'D';
            }
            else{
                //sumF++;
                //System.out.println(input + "      F");
                letterGrade = 'F';
            }

            //input = kbd.readInt();
        //}
        

            return letterGrade;
        } 


}
