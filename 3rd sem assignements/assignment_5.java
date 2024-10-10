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
    public class assignment_5{
    
    public static void main(String[] args){
    job[] j1 = {new job('a',2,100), new job('b',1,19), new job('c',2,27), new job('d',1,25), new job('e',3,15)};
    job temp;
    int max_profit;
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
    char[] deadline = new char[max_deadLine];
    for(char i:deadline) {
    i='\0';
    }
    
    for(int i=0;i<deadline.length;i++){
        if(j1[i].deadline <= deadline.length){
            if(j1[i].deadline==i && deadline[i]=='\0'){
                 deadline[i]=j1[i].jobid;
            }
            else if(j1[i].deadline<=(i-1) && deadline[i-1]=='\0'){
                   deadline[i-1]=j1[i].jobid;
            }
            else if(j1[i].deadline>=(i+1) && deadline[i+1]=='\0'){
                   deadline[i+1]=j1[i].jobid;
            }
        }
    }

    System.out.println(Arrays.toString(deadline));
       
    }
  
    }