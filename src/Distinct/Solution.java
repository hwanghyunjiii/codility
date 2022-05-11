package Distinct;

import java.util.HashSet;

/*
https://app.codility.com/demo/results/trainingW6Y833-N4Y/
 */
public class Solution {
    public int solution(int[] A){
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int num : A ){
            set.add(num);
        }

        answer = set.size();

        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{2,1,1,2,3,1}));
    }
}
