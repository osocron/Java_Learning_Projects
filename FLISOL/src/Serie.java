import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Serie {

    public static void main(String[] args) {
        List<BigInteger> list = new ArrayList<>();
        BigInteger m = new BigInteger("1");
        BigInteger z = new BigInteger("1");
        int j = 2;
        int k = 0;
        for (int i = 0; i < 100; i++) {
            if (list.isEmpty()) {
                list.add(m);
            }
            else {
                if (list.size() < 3) {
                    list.add(new BigInteger(String.valueOf(j)));
                    j++;
                }
                else {
                    if (k != 0L) {
                        list.add(new BigInteger(String.valueOf(j)));
                        j++;
                        k--;
                    }
                    else {
                        m = m.multiply(z);
                        list.add(m);
                        z = z.add(new BigInteger("1"));
                        k = 3;
                    }
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        if (f < 100) {
            System.out.print(list.get(f));
        }
    }

}
