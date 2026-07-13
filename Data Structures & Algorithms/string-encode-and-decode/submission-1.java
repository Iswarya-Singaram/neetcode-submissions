class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String x : strs){
            sb.append(x.length());
            sb.append("#");
            sb.append(x);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> word = new ArrayList<>();
        int i=0;
        while(i<str.length()){
        int j=i;
        while(str.charAt(j) != '#')
        j++;
        int length = Integer.parseInt(str.substring(i,j));
        j++;
        word.add(str.substring(j,j+length));
        i=j+length;
        }
            return word;
    }

}
