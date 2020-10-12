import java.util.*;
import java.io.*;

public class Main4 {
	static List<Integer> vec[];
	static int nodoExtremo = -1;
	static int disMax = 0;
	static boolean visited[];
	static int dis[];

	static void DFS(int x, int disA) {
		int v;
		visited[x] = true;
		dis[x] = disA + 1;
		for (int i = 0; i < vec[x].size(); i++) {
			v = vec[x].get(i);
			if (!visited[v])
				DFS(v, dis[x]);

		}
		if (dis[x] > disMax) {
			disMax = dis[x];
			nodoExtremo = x;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine());
		vec = new List[n];
		dis = new int[n];
		visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			vec[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
			String informacion[] = br.readLine().split(" ");
			int u = Integer.parseInt(informacion[0]) - 1;
			int v = Integer.parseInt(informacion[1]) - 1;
			vec[u].add(v);
			vec[v].add(u);

		}
		DFS(0, -1);
		visited = new boolean[n];
		dis = new int[n];
		disMax = 0;
		DFS(nodoExtremo, -1);
		pw.println(disMax);
		pw.close();

	}
}
