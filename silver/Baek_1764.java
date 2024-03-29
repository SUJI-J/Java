package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        Map<String, Integer> name = new HashMap<>();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            name.put(br.readLine(), 1);
        }

        for (int i = 0; i < M; i++) {
            String person = br.readLine();
            if (name.containsKey(person)) {
                cnt++;
                answer.add(person);
            }
        }

        Collections.sort(answer);

        for (String names : answer) {
            sb.append(names + " \n");
        }

        System.out.println(cnt);
        System.out.println(sb);
    }
}
