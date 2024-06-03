public class ClimbingStairs {
    public static int countWays(int n){
        if(n ==0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        return countWays(n-1) + countWays(n-2);
    }

    //Using Memoisation
    public static int countWaysMem(int n, int ways[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = countWaysMem(n-1, ways) + countWaysMem(n-2, ways);

        return ways[n];
    }
    public static void main(String[] args) {
        int n = 10;
        int ways[] = new int [n+1];
        Arrays.fill(ways, -1);
        System.out.println(countWaysMem(n, ways));
    }
}
