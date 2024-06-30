package cp;

import java.util.*;

public class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static char[] direction = {'L', 'R', 'U', 'D'};
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] vis;

    public static void main(String[] args) {
        message_route(new Scanner(System.in));
    }

    //    https://cses.fi/problemset/task/1667
    public static void message_route(Scanner in) {
        in = new Scanner(System.in);
        int computers = in.nextInt(); // number of computers (nodes)
        int connections = in.nextInt(); // number of connections (edges)

        adj = new ArrayList<>();
        for (int i = 0; i <= computers; ++i) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < connections; ++i) {
            int u = in.nextInt();
            int v = in.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] parent = new int[computers + 1];
        vis = new boolean[computers + 1];
        Arrays.fill(parent, -1);

        Queue<Integer> bfs = new LinkedList<>();
        bfs.offer(1);
        vis[1] = true;
        boolean found = false;
        while (!bfs.isEmpty()) {
            int current = bfs.poll();

            for (int neighbour : adj.get(current)) {
                if (!vis[neighbour]) {
                    bfs.offer(neighbour);
                    vis[neighbour] = true;
                    parent[neighbour] = current;
                    if(current == neighbour){
                        found = true;
                        break;
                    }
                }
            }
            if(found) break;
        }

        if (parent[computers] == -1) {
            System.out.println("IMPOSSIBLE");
        } else {
            List<Integer> path = new ArrayList<>();
            for (int at = computers; at != -1; at = parent[at]) {
                path.add(at);
            }
            Collections.reverse(path);
            System.out.println(path.size());
            for (int node : path) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
//    https://cses.fi/problemset/task/1666
//    public static void building_roads(){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int e = in.nextInt();
//        adj = new ArrayList<>();
//        for (int i = 0; i <= n; ++i) {
//            adj.add(new ArrayList<>()); // Initialize adjacency list for each node
//        }
//        for(int i=0;i<e;++i){
//            int u = in.nextInt();
//            int v = in.nextInt();
//            adj.get(u).add(v);
//            adj.get(v).add(u);
//
//        }
//
//
//        List<List<Integer>> components = new ArrayList<>();
//        vis = new boolean[n+1];
//
//        for(int i=1;i<=n;++i){
//            if(!vis[i]){
//                List<Integer> component=  new ArrayList<>();
//                dfs(i,component);
//                components.add(component);
//            }
//        }
//
//        List<String> roads=  new ArrayList<>();
//        int requiredroads = components.size()-1;
//
//        for(int i=1;i<components.size();++i){
//            int road1 = components.get(0).get(0);
//            int road2 = components.get(i).get(0);
//            roads.add(road1+" "+road2);
//        }
//
//        System.out.println(requiredroads);
//        for(String road : roads){
//            System.out.println(road);
//        }
//    }
//    private static void dfs(int node, List<Integer> component) {
////        if(vis[node]) return;
//        vis[node] = true;
//        component.add(node);
//        for(int neigh : adj.get(node)){
//            if(!vis[neigh]) dfs(neigh,component);
//
//        }
//    }
//
//    //    https://cses.fi/problemset/task/1193
//    public static void solve(){
//        Scanner in = new Scanner(System.in);
//        int r = in.nextInt();
//        int c = in.nextInt();
//        in.nextLine();
//        char[][] grid = new char[r][c];
//        int startX = -1,startY = -1,endX = -1,endY=-1;
//        for(int i=0;i<r;++i){
//            String line = in.nextLine();
//            for(int j=0;j<c;++j){
//                grid[i][j] = line.charAt(j);
//                if(grid[i][j] == 'A'){
//                    startX = i;
//                    startY = j;
//                }else if (grid[i][j] == 'B'){
//                    endX = i;
//                    endY = j;
//                }
//            }
//        }
//        /*store path - parentX,parentY*/
//        /*visited-so that never visited the same place more than once*/
//        int[][] visited = new int[r][c];
//        int[][] parentX = new int[r][c];
//        int[][] parentY = new int[r][c];
//        parentX[startX][startY] = -1;
//        parentY[startX][startY] = -1;
//        Queue<int[]> q = new LinkedList<>();
//        visited[startX][startY] = 1;
//        q.offer(new int[]{startX,startY});
//        boolean found = false;
//        while(!q.isEmpty()){
//            int[] current = q.poll();
//            int x = current[0];
//            int y = current[1];
//
//            //if x and y is target position end the loop and return
//            if (x == endX && y==endY){
//                found = true;
//                break;
//            }
//
//            for(int k=0;k<4;++k){
//                int newx = x + dx[k];
//                int newy = y + dy[k];
////grid[newx][newy] is very very imp bcz then it never wents to queue and always no ans found is never true
//                if(isValid(newx,newy,r,c) && visited[newx][newy]!=1 && (grid[newx][newy]=='.' || grid[newx][newy]=='B')){
//                    q.offer(new int[]{newx,newy});
//                    visited[newx][newy] = 1;
//                    parentX[newx][newy] = x;
//                    parentY[newx][newy] = y;
//                }
//            }
//
//        }
//
//        if(found){
//            System.out.println("YES");
//            StringBuilder path = new StringBuilder();
//            int cx = endX,cy = endY;
//            int length = 0;
//            //while jab tk cx,cy parent tk na pahunch jaye i.e -1
//            while(parentX[cx][cy]!=-1 && parentY[cx][cy]!=-1){
//                int px=  parentX[cx][cy];
//                int py = parentY[cx][cy];
//
//                for(int k=0;k<4;++k){
//                    int nx=  px + dx[k];
//                    int ny = py + dy[k];
//                    if(nx==cx && ny==cy){
//                        path.append(direction[k]);
//                        break;
//                    }
//                }
//                cx = px;cy=py;length++;
//            }
//            System.out.println(length);
//            System.out.println(path.reverse());
//
//        }else{
//            System.out.println("NO");
//        }
//    }
//    public static boolean isValid(int x,int y,int n,int m){
//        return x>=0 && x<n && y>=0 && y<m;
//    }
//}
