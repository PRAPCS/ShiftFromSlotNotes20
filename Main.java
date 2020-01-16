class Main {
  public static void main(String[] args) {
       int [] abc = new int[10];

       for(int i=0; i<abc.length-1; i++)
       {
         abc[i]=i+1;
        
       }
       for(int x: abc)
       System.out.print(x+" ");

       System.out.println("\n=============");

       //Shift over all slots from slot 3
       for(int y =abc.length-2; y>=3; y--)
       {
         abc[y+1] = abc[y];//Shift - This is the only line you need to use in the for loop.  The rest were just used to show how the shift is actually working.
         for(int x: abc) 
            System.out.print(x+ " ");
        System.out.println();
       }
       abc[3]=10;//Place new Value in correct slot
       for(int x: abc)
            System.out.print(x+ " ");
  }
}