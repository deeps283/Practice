class Gcd {
    public static int small(int a,int b){
        if(a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else if(a==b){
            return a;
        }
        else if(a>b){
          return small(a-b,b);  
        }
        else{
            return small(a,b-a);
        }
        
    }
    public static void main (String[] args){
        int D=small(50,25);
        System.out.println(D);
    }
}
