import java.util.*;

public class Main {
    
    static int r;
    static boolean isBipartite(int G[][], int src){
        int colorArr[]=new int[r];
        for (int i = 0; i < r; i++) {
            colorArr[i]=-1;
        }
        colorArr[src]=1;
        LinkedList<Integer>q=new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {            
            int u = q.poll();
            if (G[u][u]==1) {
                return false;
            }
            for (int v = 0; v < r; v++) {
                if (G[u][v]==1 && colorArr[v]==-1) {
                    colorArr[v]=1-colorArr[u];
                    q.add(v);
                }else if(G[u][v]==1 && colorArr[v]==colorArr[u]){
                    return false;
                }
            }
        }
    return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            r = sc.nextInt();
            if (r==0) {
                break;
            }
            
            int c = sc.nextInt();
            int[][]vec=new int[r][r];
            for (int i = 0; i < c; i++) {
                int x=sc.nextInt();
                int y=sc.nextInt();
                vec[x][y]=1;
                vec[y][x]=1;
            }
            
            if (isBipartite(vec, 0)) {
                System.out.println("BICOLORABLE.");
            }else{
                System.out.println("NOT BICOLORABLE.");
            }
            
        }
    }
}                        