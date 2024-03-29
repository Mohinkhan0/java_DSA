public class Rain_Water_Trapping
{
    public static void main(String[] args) 
    {
        // Rain water tapping problem
        int pillars[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=pillars.length;
        int pMax[]=new int[n];
        pMax[0]=pillars[0];
        for(int i = 1; i < n; i++) 
        {
            pMax[i] = Math.max(pMax[i-1], pillars[i]);
        }
          
        int sMax[] = new int[n];
        sMax[n-1] = pillars[n-1];
        for(int i = n-2; i >= 0; i--) 
        {
            sMax[i] = Math.max(sMax[i+1], pillars[i]);
        }

    
        int total = 0; // it will count unit
        for(int i = 0; i < n; i++) {
            int current = pillars[i];    
            int leftPillar = pMax[i];
            int rightPillar = sMax[i];
            int min = Math.min(leftPillar, rightPillar);
            if(min > current) {
                total += min - current; //it will add  water stuck water in pilars
            }
        }
        System.out.println("water stuck in pillers no of unit : " + total);
    }
}
