public class Solution extends Relation {
    public int findCelebrity(int n) {
        if(n<2) return -1;
        int candidate = 0;
        for(int i =1; i<n; i++){
            if(knows(candidate,i)){
                candidate = i;
            }
        }
        for(int i = 0; i < n; i++){
            if(i == candidate){
                continue;
            }
            if(!knows(i,candidate) || knows(candidate,i)) return -1;
        }
        
        return candidate;
        
    }
}