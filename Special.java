class Special {
    public static int SpecialValue(int N,int K){
        String S="xb";
        int S1=0;
        int S2=0;
        int special=0;
        int special1=0;
        for(int i=0;i<S.length()-1;i++){
            S1=S.charAt(i)-'a';
            S2=S.charAt(i+1)-'a';
            special=(S1+S2)%K;
        } 
        if(S1>S2){
            S1='a'-'a';
        }
        else{
            S2='a'-'a';
        }
        special1=(S1+S2)%K;
        return special1;
    }    
    public static void main(String[] args){
        int D=SpecialValue(1,50);
        System.out.print(D);
    }
}
