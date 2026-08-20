class Solution {
    public double averageWaitingTime(int[][] customers) {
        int free=0;
        double waits=0;
        for(int i=0;i<customers.length;i++){
            if(free<customers[i][0]){
                waits+=(double)customers[i][1];
                free=customers[i][0]+customers[i][1];
            }
            else{
                waits+=(double)(free-customers[i][0])+customers[i][1];
                free+=customers[i][1];
            }
        }
        return (double)(waits/customers.length);
    }
}