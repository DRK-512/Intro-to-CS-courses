//Darek Konopka; CS-101; In Class activity 4/20
//Here we are play with the SimpleDate.java and we create objects using that source code
 
public class JavaCalender{
  public static void main( String [] args ) {
  
  //1. Call myDay and today from simple date
  SimpleDate myDay; 
  SimpleDate today;
  SimpleDate tomorrow;
  
  //2. Define today and my birthday
  today = new SimpleDate(4, 20, 2020);
   
  myDay = new SimpleDate(5, 11, 2000);
  System.out.println("Today is " + today + "\nAnd my birthday is " + myDay); 
  
  //3. Find out how old I am
  int year1 = today.getYear();
  int year2 = myDay.getYear();
  System.out.println("I am " +(year1-year2) + " years old"); 
  
  //4. Find the date for tomorrow 
  today.nextDay(); 
  System.out.println("Tomorrow is " + today.toString());    
   
  }
}