public class Anagram {
    public static String exchange(String A, char C1, char C2 ){
        String out=" ";
        for(int i=0;i<=A.length()-1;i++){
            if(A.charAt(i)==C1)
                out+=C2;
            else if(A.charAt(i)==C2)
                out+=C1;
            else
                out+=A.charAt(i);
    }
    return out;
}
    public static void main(String[] args){
        String A="office";
        char C1='f';
        char C2='o';
        String D=exchange(A,C1,C2);
        System.out.println(D);
    }
}

