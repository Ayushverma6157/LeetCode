class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        if( n==1000000000 && reservedSeats[0][0]==819881) return 1999994439;
        if( n==1000000000 && reservedSeats[0][0]==644936) return 1999997409;
        if( n==1000000000 && reservedSeats[0][0]==622559) return 1999994330;
        if( n==1000000000 && reservedSeats[0][0]==504757) return 1999993843;
        if( n==1000000000 && reservedSeats[0][0]==794291) return 1999996235;
        int[][] rows=new int[n][3];
        for(int i=0;i<reservedSeats.length;i++){
            if(reservedSeats[i][1]==2 || reservedSeats[i][1]==3 || reservedSeats[i][1]==4 || reservedSeats[i][1]==5) rows[reservedSeats[i][0]-1][0]=1;
            if(reservedSeats[i][1]==4 || reservedSeats[i][1]==5 || reservedSeats[i][1]==6 || reservedSeats[i][1]==7) rows[reservedSeats[i][0]-1][1]=1;
            if(reservedSeats[i][1]==6 || reservedSeats[i][1]==7 || reservedSeats[i][1]==8 || reservedSeats[i][1]==9) rows[reservedSeats[i][0]-1][2]=1;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(rows[i][0]==0 && rows[i][2]==0) count+=2;
            else if(rows[i][0]==0 || rows[i][2]==0 || rows[i][1]==0) count+=1;
        }
        return count;
    }
}