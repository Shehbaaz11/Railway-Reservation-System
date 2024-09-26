import java.util.Scanner;
 
 class online {
    String password;
    int trainnumber;
    void ch(){

       Scanner sc=new Scanner(System.in);

       System.out.println("*********REGISTER FORM*********");
       System.out.print("1.ENTER FIRST NAME: ");
        String nameF =sc.nextLine();
        System.out.print("2.ENTER LAST NAME: ");
        String nameL =sc.nextLine();
         System.out.print("3.DATE OF BIRTH: ");
         String dob=sc.nextLine();
         System.out.print("4.GENDER: ");
         String gender =sc.nextLine();
         System.out.print("5.COUNTRY: ");
         String country =sc.nextLine();
         System.out.print("6.CREATE PASSWORD: ");
         password=sc.nextLine();
      

      System.out.println("Register Done Successfully\n");
          loginform();
    }
   
    void loginform(){
   
      Scanner sc=new Scanner(System.in);
       System.out.println("----LOGIN----");
      System.out.print("ENTER USERNAME: ");
      String username=sc.nextLine();
      System.out.print("ENTER PASSWORD: ");
       String enterpin=sc.nextLine();
      if(enterpin.equals(password)){
         System.out.println();
         mainpage();
      }
      else{
        System.out.println("Password is Invalid Please try again");
        loginform();
     }
    }
     void mainpage(){
      Scanner sc=new Scanner(System.in);
      System.out.println("---*****WELCOME TO RESERVATION PAGE*****---");
      System.out.print("ENTER YOUR FULL NAME:");
      String username=sc.nextLine();
      System.out.print("ENTER YOUR AGE:");
      int age=sc.nextInt();
      System.out.print("ENTER TRAIN NUMBER:");
      trainnumber=sc.nextInt();
      System.out.println();
      trainno();
     }
    void trainno(){
     switch (trainnumber) {
      case 12106 : 
           {
            Scanner sc=new Scanner(System.in);
            System.out.println("TRAIN NAME : AHMEDABAD RAJDHANI EXPRESS");
            System.out.print("ENTER THE CLASS TYPE(e.g:Sleeper,AC): ");
            String classtype =sc.nextLine();
            System.out.print("ENTER DATE OF THE JOURNEY(YYYY-MM-DD): ");
            String date=sc.nextLine();
            System.out.println();
            System.out.println("TRAIN TIMMING IS 7:00PM");
            System.out.print("ENTER THE DEPARTURE PLACE: ");
            String dept =sc.nextLine();
            System.out.print("ENTER DESTINATION PLACE: ");
            String des =sc.nextLine();
            System.out.println();
            System.out.println("PRESS 'INSERT' TO CONFIRM THE RESERVATION:  ");
            String reserv =sc.nextLine();
            reserve();

           
           }
         break;
      case 10394 :{
         Scanner sc=new Scanner(System.in);
         System.out.println("TRAIN NAME : HOWRAH SUPERFAST EXPRESS");
         System.out.print("ENTER THE CLASS TYPE(e.g:Sleeper,AC): ");
            String classtype =sc.nextLine();
            System.out.print("ENTER DATE OF THE JOURNEY(YYYY-MM-DD): ");
            String date=sc.nextLine();
            System.out.println();
            System.out.println("TRAIN TIMMING IS 7:00PM");
            System.out.print("ENTER THE DEPARTURE PLACE: ");
            String dept =sc.nextLine();
            System.out.print("ENTER DESTINATION PLACE: ");
            String des =sc.nextLine();
            System.out.println();
            System.out.print("PRESS 'INSERT' TO CONFIRM THE RESERVATION:  ");
            String reserv =sc.nextLine();
            reserve();
      }
      break;
      case 12437 :{
         System.out.println("TRAIN NAME : NEW DELHI SHATABDI EXPRESS");
         Scanner sc=new Scanner(System.in);
         System.out.print("ENTER THE CLASS TYPE(e.g:Sleeper,AC): ");
         String classtype =sc.nextLine();
         System.out.print("ENTER DATE OF THE JOURNEY(YYYY-MM-DD): ");
         String date=sc.nextLine();
         System.out.println();
         System.out.println("TRAIN TIMMING IS 7:00PM");
         System.out.print("ENTER THE DEPARTURE PLACE: ");
         String dept =sc.nextLine();
         System.out.print("ENTER DESTINATION PLACE: ");
         String des =sc.nextLine();
         System.out.println();
         System.out.print("PRESS 'INSERT' TO CONFIRM THE RESERVATION:  ");
         String reserv =sc.nextLine();
         reserve();
      }
      break;
      case 12267 :{
         System.out.println("TRAIN NAME : PUNJAB MAIL SF EXPRESS");
         Scanner sc=new Scanner(System.in);
         System.out.print("ENTER THE CLASS TYPE(e.g:Sleeper,AC): ");
         String classtype =sc.nextLine();
         System.out.print("ENTER DATE OF THE JOURNEY(YYYY-MM-DD): ");
         String date=sc.nextLine();
         System.out.println();
         System.out.println("TRAIN TIMMING IS 7:00PM");
         System.out.print("ENTER THE DEPARTURE PLACE: ");
         String dept =sc.nextLine();
         System.out.print("ENTER DESTINATION PLACE: ");
         String des =sc.nextLine();
         System.out.println();
         System.out.print("PRESS 'INSERT' TO CONFIRM THE RESERVATION:  ");
         String reserv =sc.nextLine();
         reserve();
         
      }
      break;
      default: {
         System.out.println("UNKNOWN TRAIN NUMBER");
         Scanner sc=new Scanner(System.in);
         System.out.print("ENTER THE CLASS TYPE(e.g:Sleeper,AC): ");
         String classtype =sc.nextLine();
         System.out.print("ENTER DATE OF THE JOURNEY(YYYY-MM-DD): ");
         String date=sc.nextLine();
         System.out.println("TRAIN TIMMING IS 7:00PM\n");
         System.out.print("ENTER THE DEPARTURE PLACE: ");
         String dept =sc.nextLine();
         System.out.print("ENTER DESTINATION PLACE: ");
         String des =sc.nextLine();
         System.out.print("PRESS 'INSERT' TO CONFIRM THE RESERVATION:  ");
         String reserv =sc.nextLine();
         reserve();
      }
         break;
     }
    } 
   void reserve(){
      Scanner sc=new Scanner(System.in);
      System.out.println();
System.out.println("RESERVATION CONFIRMED! YOUR PNR IS: PNR22341\n");
System.out.println("--******MENU******--");
System.out.println("1.CONFIRM TICKET");
System.out.println("2.CANCEL TICKET");
System.out.println("Enter your choice");
int choice=sc.nextInt();
if (choice==1) {
   System.out.println("BOOKING CONFIRM!");
}
else {
   System.out.println("BOOKING CANCELLED!");
}
   }
    
 }
 public class onlineReservation{
public static void main(String[] args) {
   online obj1=new online();
   obj1.ch();
}
 }