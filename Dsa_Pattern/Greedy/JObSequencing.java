package Dsa_Pattern.Greedy;

import java.util.Arrays;

class Job{
    char id;
    int deadline;
    int profit;
    Job(char id,int deadline,int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class JObSequencing {
    public static void main(String[] args) {
        char[] jobId = {'A','B','C'};
        int[] deadline = {2,1,2};
        int[] profit = {100,50,200};
        Job[] job = new Job[jobId.length];
        for (int i = 0; i < jobId.length; i++) {
            job[i] = new Job(jobId[i],deadline[i],profit[i]);
        }
        System.out.println(jobSequences(job));
    }
    public static int jobSequences(Job[] jobs){
        Arrays.sort(jobs,(a,b)->Integer.compare(b.profit,a.profit));
        int maxDeadline = 0;
       for (Job job : jobs){
           maxDeadline = Math.max(maxDeadline,job.deadline);
       }
       char[] slots = new char[maxDeadline + 1];
       boolean[] occupied = new boolean[maxDeadline + 1];

       int totalproft  = 0;
       int jobdone = 0;
       for (Job job : jobs){
           for (int i = job.deadline; i >= 1 ; i--) {
               if(!occupied[i]){
                   occupied[i] = true;
                   slots[i] = job.id;
                   totalproft += job.profit;
                   jobdone++;
                   break;
               }
           }
       }
       return totalproft;
    }

}
