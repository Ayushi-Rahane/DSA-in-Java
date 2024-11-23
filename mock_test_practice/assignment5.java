import java.util.*;
class job{
    int deadline, profit;
    char jobid;
    job(char jobid, int deadline, int profit){
    this.jobid = jobid;
    this.deadline=deadline;
    this.profit = profit;
    }
   
    }
    public class assignment5{
   
    public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size:");
    int size = sc.nextInt();
    sc.nextLine();
     job[] j1 = new job[size];
     char jobid;
     int dl, profit;
     for(int i=0;i<size;i++) {
    System.out.println("------ Enter Job no. "+(i+1)+" -------");
         System.out.println("Enter Job Id");
          jobid = (sc.nextLine()).charAt(0);
          System.out.println("Enter Deadline: ");
          dl = sc.nextInt();
          sc.nextLine();
          System.out.println("Enter profit: ");
          profit = sc.nextInt();
          sc.nextLine();
         
         
          j1[i] = new job(jobid, dl, profit);
       }
     
    job temp;
    int max_profit=0;
    for(int i=0;i<j1.length-1;i++) {
    for(int j=0;j<j1.length-i-1;j++) {
    if(j1[j].profit<j1[j+1].profit) {
       temp = j1[j];
       j1[j]=j1[j+1];
       j1[j+1]=temp;
    }
    }
    }
    System.out.println("JobID | Deadline | Profit");
    for(int i=0;i<j1.length;i++) {
    System.out.println(j1[i].jobid+"    |     "+j1[i].deadline+"    |     "+j1[i].profit);
    }
   
    int max_deadLine=0;
    for(int i=0;i<j1.length;i++) {
    if(j1[i].deadline>max_deadLine) {
    max_deadLine= j1[i].deadline;
    }
    }
    System.out.println(max_deadLine);
    char[] deadline = new char[max_deadLine];
    for(char i:deadline) {
    i='\0';
    }
   
    for(int i=0;i<j1.length;i++){
      for(int j=0;j<deadline.length;j++){
            if(j1[i].deadline==(j+1) && deadline[j]=='\0'){
                deadline[j]=j1[i].jobid;
                max_profit+=j1[i].profit;
                break;
            }    
            else if(j1[i].deadline==(j+1) && deadline[j]!='\0'){
                if(j!=0 && deadline[j-1]=='\0'){
                    deadline[j-1]=j1[i].jobid;
                    max_profit+=j1[i].profit;
                    break;
                }
            }    
           
      }
   
    }


    System.out.println("Following is maximum profit sequence of jobs:");
    for(char i: deadline) {
    if(i!='\0') {
    System.out.println(i);
    }
    }
    System.out.println("Maximum profit is: "+max_profit);
       
    }
 
    }