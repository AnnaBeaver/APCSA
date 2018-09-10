
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

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
    public int getMedian()
    {
      Arrays.sort(nums);
      return nums;
    }
    }
    //public int[] getMode(){}


