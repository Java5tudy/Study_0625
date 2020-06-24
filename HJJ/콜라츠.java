class Solution {
    public int solution(int num) {
        int answer = 0;
	      
	      for(int i = 1; i < 500; i++) {
		      if(num == 1) { // 1일 경우
		    	  break;
		      }	    	  
	    	  
		      if(num % 2 == 0) { // 짝수
		    	  num = num / 2;
		    	  answer++;
		      } else { // 홀수
		    	  num = (num * 3) + 1;
		    	  answer++;
		      }
		      
		      if(i == 500) { // 500번 반복해도 1이 아닐 경우
		    	  answer = -1;
		      }
	      }
    
	      return answer;
    }
}