import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if (abs1 == abs2) {
                return o1 > o2 ? 1 : -1;
            }
            return abs1 - abs2;
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int order = Integer.parseInt(br.readLine());
            if (order == 0) {
                if (q.isEmpty()) sb.append("0\n");
                else sb.append(q.poll()).append("\n");
            } else {
                q.add(order);
            }
        }

        System.out.println(sb);
    }
}
