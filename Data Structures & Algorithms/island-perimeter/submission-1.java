class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean visited[][] = new boolean[n][m];

        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};

        Queue<int[]> q = new LinkedList<>();
        for(int row = 0; row<n; row++){
            for(int col = 0; col<m; col++){
                if(grid[row][col] == 1){
                    q.offer(new int[]{row,col});
                    visited[row][col] = true;
                    break;
                }
            }
            if(!q.isEmpty()) break;
        }

        int count = 0;

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];

            for(int[] direction : directions){
                int nx = x + direction[0];
                int ny = y + direction[1];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    count++;
                    continue;
                }
                if(grid[nx][ny] == 0){
                    count++;
                    continue;
                }
                if(nx >= 0 && ny >= 0 && nx < n && ny < m){
                    if(!visited[nx][ny]){
                        q.offer(new int[]{nx,ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return count;
    }
}