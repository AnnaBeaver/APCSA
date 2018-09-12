

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    int nums[];  //declaration

    // Constructor
    public StatTester(){
    }
    //  Methods
    public void loadArray(){
        nums = new int[100]; //initialization
        for(int i = 0; i < nums.length; i++){ //length 10
            nums[i] = (int)(Math.random()*10 + 1);
        }
    }

    public void printArray(){
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 10 == 0){
                System.out.println(nums);
            }
            else{System.out.print(nums);
            }
        }//10 numbers per line
    }

    public int getSum(){
        int sum = 0;
        for (int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    public double getMean(){
        //double mean = 0;
        int sum = 0;
        for (int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        double mean = sum / 100.0;
        return mean;
    }
    //public int getMedian()
    //{
    //Arrays.sort(nums);
    // return nums;
    //}

    public int[] getMode(){
        int[] occurences = new int[10];
        int[] met=new int[10];
        int numbersMet = 0;
        int maxOccurences = 0;
        int[] dump = new int [1];

        for(int i = 1; i <=10; i++){
            occurences [i-1]+=1;
        }

        for (int i = 1; i<=10; i++){
            if(occurences [i-1] > maxOccurences){
                maxOccurences = occurences[i-1];
                met=new int[1];
                met[0]=i;
                numbersMet ++;
                
            }
            else if(occurences [i-1] == maxOccurences){
                dump = new int [met.length + 1];
                dump = met;
                dump[maxOccurences-1] = i;
                met = new int[dump.length];
                met = dump;
                maxOccurences ++;
                
            } 
        }
        return met;
    }
}

