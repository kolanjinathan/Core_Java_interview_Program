import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 * counting pair using java
 */
public class CountingPair {
	public static int getPairsCount(int[] nums, int k) 
    { 
   HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    HashSet<String> set = new HashSet<String>();
    for(int i =0;i < nums.length;i++){
        map.put(nums[i],true);
    }
    for (int i = 0 ; i < nums.length; i++){
        if(map.containsKey(nums[i]+k)){
            String a = "";
            if(nums[i]<nums[i]+k){
                a = "("+nums[i]+","+(nums[i]+k)+")";
            }
            else{
                a = "("+(nums[i] + k)+","+nums[i]+")";
            }
            set.add(a);
        }
    }
    System.out.println(set);
    return set.size();
 }
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	   // scanner=new Scanner(System.in);
	     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	    int[] firstLine=null;
		try {
			firstLine = Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
	   // int count = firstLine[0];
	    int diff = firstLine[1];           
	    Set<Integer> numbers=null;
		try {
			numbers = new HashSet<>(Stream.of(in.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
		} catch (IOException e) {
			e.printStackTrace();
		}

	    int pairCount = 0;
	    for (Integer number : numbers) {
	        pairCount += (numbers.contains(number+diff) ? 1:0); 
	    }
	    System.out.println(pairCount);   
	    } // main
	}

