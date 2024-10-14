import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> players = new HashMap<>();
        
        for(String p : participant) 
            players.put(p, players.getOrDefault(p, 0) + 1);
        
        for(String c : completion) {
            int n = players.get(c) - 1;
            // 참가자가 완주 했으면 players에서 지움
            if(n==0) players.remove(c);
            else players.put(c, n);
        }
          
        // return players.keySet().iterator().next();
        String[] arr = players.keySet().toArray(new String[0]);
        return arr[0];
    }
}