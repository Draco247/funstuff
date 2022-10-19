import java.util.*;

class Solution33 {    
    public int[] solution(int[] A)
    {
        int[] nondivisors = new int[A.length];
        //first I use a hashmap to store the number of occurences of each number in the array
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++)
        {
            if(map.containsKey(A[i]))
            {
                map.put(A[i], map.get(A[i]) + 1);
            }

            else
            {
                map.put(A[i], 1);
            }
        }

        //next I make a hashmap to store the number of non divisors in the array for that number
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int n : map.keySet() ){            
            int numDivisors =0;
            // find divisors from 1 to sqrt(n)
            int sqrtN = (int)Math.sqrt(n);  
            for(int i=1; i<=sqrtN; i++ ){
                if( n % i == 0){ // means: i could be a divisor
                    int anotherDivisor = n/i; 
    
                    if(map.containsKey(i) == true ){
                        numDivisors = numDivisors + map.get(i);
                    }
                    if(anotherDivisor != i){ // avoid double count (be careful)
                        if(map.containsKey(anotherDivisor) == true){
                            numDivisors = numDivisors + map.get(anotherDivisor);
                        }
                    }
                }
            }
            
            int numNonDivisors = A.length - numDivisors;
            map2.put(n, numNonDivisors); 
        }

        System.out.println(map2);
        for(int i = 0; i < A.length; i++)
        {
            nondivisors[i] = map2.get(A[i]);
        }
        return nondivisors;
       
    }
}

public class countnondivisible {
    public static void main(String[] args)
    {
        Solution33 solution = new Solution33();
        int[] A = {3,1,2,3,6};
        System.out.println(Arrays.toString(solution.solution(A)));
    }
    
    
}
