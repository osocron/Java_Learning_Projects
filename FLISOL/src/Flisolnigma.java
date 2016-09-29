import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flisolnigma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();

        List<Integer> mensaje = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i < k) {
                mensaje.add(i, scan.nextInt());
            } else {
                scan.nextInt();
            }
        }

        int m = scan.nextInt();
        for (int j = 0; j < m; j++) {
            int action = scan.nextInt();
            if (action == 0) {
                int p = scan.nextInt();
                for (int t = 0; t < p; t++) {
                    if (!mensaje.isEmpty()) {
                        mensaje.remove(0);
                    }
                }
            }
            else if (action == 1) {
                int q = scan.nextInt();
                for (int l = 0; l < q; l++) {
                    if (mensaje.size() <= k) {
                        mensaje.add(scan.nextInt());
                    }
                }
            }
        }

        String res = "";
        if (!mensaje.isEmpty()) {
            for (int c = 0; c < mensaje.size(); c++) {
                res = res + mensaje.get(c) + " ";
            }
        }
        if (res.length() >= 1) {
            res = res.substring(0, res.length() - 1);
        }
        System.out.print(res);

    }

}
