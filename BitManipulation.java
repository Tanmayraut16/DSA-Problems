public class BitManipulation {
    public static void oddoreven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

   public static int clearRangeofBits(int n, int i, int j){
    int a = (~0)<<(j+1);
    int b = (1<<i)-1;
    int bitMask = a | b;
    return n & bitMask;
   }

   public static boolean ISPowerornot(int n){
    return (n&(n-1)) == 0;
   }

   public static int CountSetBit(int n){
    int count =0;
    while(n>0){
        if((n&1) != 0){
            count ++;
        }
        n = n>>1;
    }
    return count;
   }

    public static void main(String[] args) {
        System.out.println(CountSetBit(10));
    }
    
}
