/*
 * 
 * Assignment no: 5
 * Submitted By:
 * NAME: Rahane Ayushi Madhukar
 * UCE: UCE2024014
 * DIV: B
 * Branch: B4
 * 
 * */

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


    System.out.println("Following is maximum profit sequence of jobs:"+Arrays.toString(deadline));
    System.out.println("Maximum profit is: "+max_profit);
       
    }
  
    }

    /*
     * Output:
 JobID | Deadline | Profit
a    |     2    |     100
c    |     2    |     27
d    |     1    |     25
b    |     1    |     19
e    |     3    |     15
Following is maximum profit sequence of jobs:[c, a, e]
Maximum profit is: 142
     */