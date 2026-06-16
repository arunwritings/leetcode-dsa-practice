package datastructures.strings;

public class RepeatedStringMatch_686 {

    public int repeatedStringMatch(String a, String b) {
        boolean[] visited=new boolean[26];
        for(char c:a.toCharArray()){
            visited[c-'a']=true;
        }
        for(char c:b.toCharArray()){
            if(!visited[c-'a']){
                return -1;
            }
        }
        int aLen=a.length();
        int bLen=b.length();
        if(bLen==0) return -1;
        StringBuilder sb=new StringBuilder();
        int times=(bLen+aLen-1)/aLen;
        sb.append(a.repeat(times));
        if(sb.indexOf(b)!=-1){
            return times;
        }
        sb.append(a);
        if(sb.indexOf(b)!=-1){
            return times+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        RepeatedStringMatch_686 r = new RepeatedStringMatch_686();
        System.out.println(r.repeatedStringMatch("abcd", "cdabcdab"));
    }
}
