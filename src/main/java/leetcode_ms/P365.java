package leetcode_ms;

/**
 * Created by zjw on 2018/08/06 21:10
 * Description:
 */
public class P365 {

    public boolean canMeasureWater(int x, int y, int z) {
        if(x + y < z) {
            return false;
        }
        if(x == z || y == z || x + y == z) {
            return true;
        }
        return z % gcd(x, y) == 0;
    }

    private int gcd(int a, int b) {
        while(b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}
