package com.RecursionQ.Array;

import java.util.ArrayList;

public class MazeProbIMP {
    public static void main(String[] args) {
        System.out.println("Total number of ways: " + countWays(3,3));
        System.out.println();
        System.out.println("Total path if down and right path allowed: " + Path("",3,3,new ArrayList<>()));
        System.out.println();
        System.out.println(Pathinside("",3,3));
        System.out.println();
        System.out.println("If diagonals are allowed also: " + AllPathsDiagonal("",3,3,new ArrayList<>()));
        System.out.println();

        boolean[][] board = {
                {true,true,true},
                {true,true,true},  // OBSTACLE ON (1,1)
                {true,true,true}
        };
        System.out.println("if obstacle is intro: " + PathRestrictions("",0,0,board));
        System.out.println();
       // AllPaths("",0,0,board);  //STACK OVERFLOW...HERE WE NEED THE CONCEPT OF BACKTRACKING...
        System.out.println("All Paths introduced use of backtracking: " + AllPaths("",0,0,board,new ArrayList<>()));
        int[][] path = new int[board.length][board[0].length];
    }
    static int countWays(int r , int c)
    {
        if(r == 1 || c== 1) return 1;
        int down = countWays(r-1,c);
        int right = countWays(r,c-1);
        return down + right;
    }
    static ArrayList<String> Path(String str , int r , int c,ArrayList<String> list)
    {
        if(r == 1 && c == 1)
        {
            list.add(str);
            return list;
        }
        if(r>1)
        {
            Path(str + 'D',r-1,c,list);
        }
        if(c>1)
        {
            Path(str+'R',r,c-1,list);
        }
       return list;
    }
    static ArrayList<String> Pathinside(String str , int r , int c) {
        ArrayList<String> list = new ArrayList<>();
        if (r == 1 && c == 1) {
            list.add(str);
            return list;
        }
        if (r > 1) {
            list.addAll(Pathinside(str + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(Pathinside(str + 'R', r, c - 1));
        }
        return list;
    }
    static ArrayList<String> AllPathsDiagonal(String str , int r , int c, ArrayList<String> list)
    {
        if(r == 1 && c==1)
        {
            list.add(str);
            return list;
        }
        if(r>1)
        {
            AllPathsDiagonal(str+'V',r-1,c,list);
        }
        if(c>1)
        {
            AllPathsDiagonal(str+'H',r,c-1,list);
        }
        if(r>1 && c>1)
        {
            AllPathsDiagonal(str+'D',r-1,c-1,list);
        }
        return list;
    }

    static ArrayList<String> PathRestrictions(String str , int r , int c, boolean[][] maze)
    {
        ArrayList<String> list = new ArrayList<>();
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            list.add(str);
            return list;
        }
        if(!maze[r][c])
        {
            return new ArrayList<>();
        }
        if(r<maze.length-1)
        {
            list.addAll(PathRestrictions(str+'D',r+1,c,maze));
        }
        if(c<maze[0].length-1)
        {
            list.addAll(PathRestrictions(str+'R',r,c+1,maze));
        }
        return list;
    }
    static ArrayList<String> AllPaths(String str,int r,int c,boolean[][] maze,ArrayList<String> list)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            list.add(str);
            return list;
        }

        if(!maze[r][c])
        {
            return new ArrayList<>();
        }
                             //I AM CONSIDERING THIS BLOCK IN MY PATH...
        maze[r][c] = false;
        if(r<maze.length-1)
        {
            AllPaths(str+'D',r+1,c,maze,list);
        }
        if(c<maze[0].length-1)
        {
            AllPaths(str+'R',r,c+1,maze,list);
        }
        if(r>0)
        {
            AllPaths(str+'U',r-1,c,maze,list);
        }
        if(c>0)
        {
            AllPaths(str+'L',r,c-1,maze,list);
        }
        // THIS LINE WHERE FUNCTION IS OVER...
        // SO BEFORE THE FUNCTION GETS REMOVED ALSO REMOVE THE CHANCES MADE BY IT...
        maze[r][c] = true;
        return list;
    }
}
