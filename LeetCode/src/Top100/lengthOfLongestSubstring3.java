package Top100;

import org.junit.Test;
import java.util.HashMap;

public class lengthOfLongestSubstring3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0;
        int ans=0;
        for(int end=0; end < s.length(); end ++){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end)),start);
            }
            map.put(s.charAt(end),end+1);
            ans = Math.max(end-start+1,ans);
        }
        return ans;
    }
    @Test
    public void test(){
        System.out.println("abcabcbb的最长子串长度为："+lengthOfLongestSubstring("abcabcbb"));
        System.out.println("pwwkew的最长子串长度为："+lengthOfLongestSubstring("pwwkew"));
    }
}
