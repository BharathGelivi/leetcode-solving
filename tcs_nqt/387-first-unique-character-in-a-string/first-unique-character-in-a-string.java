class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] s1=s.toCharArray();
        for(int i=0;i<s1.length;i++){
            map.put(s1[i],map.getOrDefault(s1[i],0)+1);
        }
        for(int i=0;i<s1.length;i++){
            if(map.get(s1[i])==1){
                return i;
            }
        }
        return -1;
    }
}