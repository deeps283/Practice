class Lcm {
    public static int large(int a,int b){
        int out=(a>b)?a:b;
        while(true){
            if(out%a==0 && out%b==0){
                break;
            }
            out++;
        }
        return out;
    }
    public static void main(String[] args){
        int D=large(60,15);
        System.out.println(D);
    }
}
