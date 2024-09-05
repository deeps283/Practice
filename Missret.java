class Missret{
    public static void main(String[] args){
    int arr[]={1,3,3,4,5,6};
    for (int i = 0; i < arr.length-1; i++) { 
        int corr=arr[i]-1;
        if (arr[corr] !=arr[i]) {
          int temp=arr[i];
          arr[i]=arr[corr];
          arr[corr]=temp;
        }
      }
      boolean []vis=new boolean[arr.length];
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
      }
      System.out.println();
      int dupilcate=-1;
      for (int j= 0; j < arr.length-1; j++) {
          int  num=j+1;
        if (arr[j] != num) {
          System.out.println("missing number"+" "+num);
        }
        if(vis[arr[j]])
        {
          dupilcate=(arr[j]);
        }
        else{
          vis[arr[j]] =true;
        }
      }
      System.out.println("repeated number"+dupilcate);
    }
}
