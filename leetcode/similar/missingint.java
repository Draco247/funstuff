// import java.util.Arrays;

// class Solution6 { 
//     public int solution(int[] A)
//     {
//         //need to find smallest int in array then +1 until i get a number that isn't in the array
//         int smallest = A[0];
//         for(int i = 0; i < A.length; i++)
//         {
//             if(A[i] < smallest)
//             {
//                 smallest = A[i];
//             }
//         }

//         boolean found = false;
//         int temp = smallest;
//         while (!found)
//         {
//             boolean res = Arrays.stream(A).anyMatch(i -> i == temp);
//             if(res == true)
//             {
//                 temp+=1;
//             }

//             else
//             {
//                 smallest = temp;
//                 break;
//             }
//         }
//         return smallest;
        
//     }
// }

// public class missingint {
//     public static void main(String[] args)
//     {
//         Solution6 solution = new Solution6();
//         int[] digits = {1,3,6,4,1,2};
//         System.out.println(solution.solution(digits));
//     }
    
// }
