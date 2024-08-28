class Harshad {
    public static boolean Hashsum(int N){
        int sum=0;
        int temp=N;
        while(N>0){
        int A=N%10;
        sum+=A;
        N/=10;
        }
        if(temp%sum==0){
            return true;
        }
        return false;
    }    
    public static void main(String[] args){
        int N=1729;
        boolean D=Hashsum(N);
        System.out.println(D);
    }
}
