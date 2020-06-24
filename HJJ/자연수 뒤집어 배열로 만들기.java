class Solution {
  public int[] solution(long n) {
      String str = "" + n; //Integer.toString(n)과 동일한 역할 즉, String + int -> String으로 인식
        int[] answer = new int[str.length()];
        int i=0;
 
        while(n>0) {
            answer[i] = (int)(n%10);
            n /= 10;
            i++;
        }
      return answer;
  }
}