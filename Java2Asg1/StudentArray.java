/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
/**
 *
 * @author lawtonb
 */
public class StudentArray
{
	Student[] sarray = new Student[3];
    
        public static void main(String[] args)
        {
               StudentArray sa = new StudentArray();
               sa.topMenu();
               //sa.writeStudentData();
   
	}
        
        public void topMenu()
        {
             Scanner sc = new Scanner(System.in);
               
               int input;
               do{
               System.out.println("0) load student data from file");
               System.out.println("1) populate students");
               System.out.println("2) lookup student by id");
               System.out.println("3) exit");
               input = sc.nextInt();
               if(input == 0)
               {
                   loadStudentData();
               }
               else if(input == 1)
               {    
                populateStudents();
               }
               else if(input == 2)
               {
                   lookupStudents();
               }
       
               }while(input != 3);
        }
        
        public void populateStudents()
        {
                String id_holdinput;
		
                Scanner sc = new Scanner(System.in);

		for(int i=0; i<sarray.length; i++)
                {
      
                        System.out.println("Please enter if you are a Grad or UnderGrad [G or UG]");
                        
                        String input = sc.next();
                    
			if(input.equalsIgnoreCase("G"))
                        {
                            sarray[i] = new GradStudent();
                            System.out.println("Please enter your id number[first name and last initial]: ");
                            String local_id = sc.next();
                            sarray[i].setID(local_id);
                        }
                        else if(input.equalsIgnoreCase("UG"))
                        {
                            sarray[i] = new Undergrad();  
                            System.out.println("Please enter your id number[first name and last initial]: ");
                            String local_id = sc.next();
                            sarray[i].setID(local_id);
                        } 
                        else
                        {
                            sarray[i] = new Student();
                            System.out.println("Please enter your id number[first name and last initial]: ");
                            String local_id = sc.next();
                            sarray[i].setID(local_id);
                        }
		}
                
        }
         public void lookupStudents()
         {
             float ex1_holdinput, ex2_holdinput;
             Scanner sc = new Scanner(System.in);
             
                      System.out.println("Please enter your ID so we can look you up:");
                      String secondinput = sc.next();
                      int index = -1;
                      for(int i = 0; i < sarray.length; i++)
                      {
                          
                          if(sarray[i].getID().equalsIgnoreCase(secondinput))
                          {
                              index = i;
                          }
                      }

                      //int x = sc.nextInt();
                      System.out.print("Enter Exam 1: ");
		      ex1_holdinput = sc.nextFloat();
		      System.out.print("Enter Exam 2: ");
	              ex2_holdinput = sc.nextFloat();
                      
                      //String xx = Integer.toString(x);
                        
                      //sarray[index].setID(local_id);
                      if(index == -1)
                      {
                          System.out.println("We didn't find your record, please contact system administrator");
                      }
                      else
                      {
                          sarray[index].setExam1(ex1_holdinput);
                          sarray[index].setExam2(ex2_holdinput);
                          sarray[index].calcLetterGrade(index);
                          sarray[index].showAll();
                      } 
                        
                        //sarray[x].
                        //sarray[x].average(); 
                
        }
	
         public void writeStudentData()
         {
             try
		{
        		FileOutputStream fos = new FileOutputStream("StudentData.txt");
        		ObjectOutputStream oos = new ObjectOutputStream(fos);
        		
			oos.writeObject(sarray);
        		oos.flush();
        		fos.close();
        	}
        	catch (IOException e)
		{
        		System.err.println(e);
        	}
             
         }
         
         public void loadStudentData()
         {
             try
		{
			FileInputStream fis = new FileInputStream("StudentData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			sarray = (Student[])ois.readObject();
			fis.close();
                        for(int i = 0; i < sarray.length; i++)
                        {
                            sarray[i].showAll();
                        }
		}
		catch (IOException e)
		{
                    System.err.println("An error was encounter please try again.");
                    topMenu();
		}
                catch( ClassNotFoundException cnfe)
                {
                    System.err.println("File to load accounts was not found.");
                    topMenu();
                }
         }
                 
         
}// end class StudentArray	
