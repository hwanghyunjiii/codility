package BinaryGap;

/*
https://app.codility.com/demo/results/trainingP3VMXU-NEN/
 */
public class Solution {
    public int solution(int N){
        //1. Integer 클래스 사용
        //String binaryString = Integer.toBinaryString(N);
        
        //2. 함수 직접 구현
        String binaryString = getBinaryString(N);

        int result = 0, count =0;

        for(char c : binaryString.toCharArray()){
            if(c == '0')
                count++;
            else{
                result = Math.max(count, result);
                count = 0;
            }
        }

        return result;
    }

    public static String getBinaryString(int N){
        String binaryString = "";
        int n = N;

        while (n > 0 ){
            binaryString = n % 2 + binaryString;
            n = n / 2;
        }

        return binaryString;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.print(s.solution(9));
        //System.out.print(getBinaryString(529));
    }
}
