class Solution {
    //by using HashMap and int[26] array
    public List<List<String>> groupAnagrams(String[] strs) {
        
    HashMap <String, List<String>> map= new HashMap<>();

        for(String words : strs){

        int[] count= new int[26];

        for(char c : words.toCharArray()) {
            count[c-'a']++;
        }

    StringBuilder newString = new StringBuilder();

        for(int i=0; i<26; i++){
            newString.append('#');
            newString.append(count[i]);
        }

    String keyString = newString.toString();
    
    if(!map.containsKey(keyString)){
      map.put(keyString, new ArrayList<>());
    }
    
    map.get(keyString).add(words);

    }
    return new ArrayList<>(map.values());
    }
}
