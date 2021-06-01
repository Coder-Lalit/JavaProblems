package Questions;

public class stockQuestion {
    public static void main(String[] args) {
        System.out.println(findMinDays(3,11));
        System.out.println(findMinDays(3,10));
        System.out.println(findMinDays(3,4));
        System.out.println(findMinDays(5,4));
        System.out.println(findMinDays2(5,4));
    }

    static int findMinDays(int n, int m) {
        System.out.println("Share Price :"+n);
        System.out.println("Looking for Share Price :"+m);
        int  days = 0;
        if(n>m) {
            days = n - m;
        }
        else {
            while(n!=m){
                if(n*2==m){
                    n=n*2;
                    System.out.println("share price increased "+n);
                }
                else if(n*2>m){
                    if((n*2)-1!=m){
                        n=n-1;
                        System.out.println("share price decreased "+n);
                    }
                    else {
                        n=n*2;
                        System.out.println("share price increased "+n);
                    }

                }else{
                    n=n*2;
                    System.out.println("share price increased "+n);
                }
                days++;
                System.out.println("Days "+days);
            }

        }
        return days;
    }

    public static int findMinDays2(int X, int Y) {
        int ans = 0;
        while (Y > X) {
            ans++;
            if (Y % 2 == 1)
                Y++;
            else
                Y /= 2;
            System.out.println("X =" + X + " Y = " + Y);
        }

        return ans + X - Y;
    }

}
