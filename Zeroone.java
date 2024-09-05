import java.util.*;
class Zeroone {
    public static String Findiiplusone(String S){
    StringBuilder D=new StringBuilder(S);
    boolean removed;
    do{
        removed=false;
        for(int i=0;i<D.length()-1;i++){
            if(D.charAt(i)==i&&D.charAt(i)==0){
                D.deleteCharAt(i);
            removed=true;
            }
        }
    }
    while(removed);

    return D.toString();

    }
public static void main(String[] args){
    String D=Findiiplusone("110");
    System.out.print(D);
    }
}
