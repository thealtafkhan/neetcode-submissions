class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for(String words : strs){
            result.append(words.length());
            result.append('#');
            result.append(words);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        ArrayList <String> result = new ArrayList<>();

        int i=0;

        while(i<str.length()){

        int j=i;

        while(str.charAt(j)!='#'){
            j++;
        }
        
        int length= Integer.parseInt(str.substring(i, j));

        j++;

        String words =str.substring(j, j+length);

        result.add(words);

        i=j+length;

        }

        return result;
    }
}
