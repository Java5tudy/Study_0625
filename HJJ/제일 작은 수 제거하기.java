class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1){
            return new int[]{-1}; //배열 요소가 하나이면 제거하면 빈 배열 되므로 -1반환
        }
        int min = 0;
        for(int i = 0;i < arr.length;i++){ //제일 작은수의 index를 찾는다
            if(arr[i]<arr[min])
            min=i;
      }
        //작은수 제거를 어케할지 모르겠다
        return answer;
  }
}