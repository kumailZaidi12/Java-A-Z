import java.util.*;
public class ssd {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
//        int tc = sc.nextInt();
        int tc=1;
        for(int x= 1;x<=tc;x++){
//            int n1 = sc.nextInt();
//            int n2=sc.nextInt();
            int n1=8;int n2=8;
//            int[] arr1 = new int[n1];
//            int[] arr2 = new int[n2];
            int[] arr1 = {2,3 ,7 ,10, 12, 15, 30, 34};
            	int[] arr2= {1, 5, 7 ,8 ,10, 15, 16, 19};
//            for(int i=0;i<n1;i++)
//            arr1[i]=sc.nextInt();
////            
//            for(int i=0;i<n2;i++)
//            arr2[i]=sc.nextInt();
            
            System.out.println(answer(arr1,arr2));
        }
    }
    
    public static int answer(int[] a1,int[] a2){
        int i=0,j=0,x=0,y=0,sum1,sum2,max=Integer.MIN_VALUE,ans=0;;
        int n1=a1.length;
        int n2=a2.length;
        sum1=0;sum2=0;
            while(i<n1){
                sum1=sum1+a1[i];
          
                
                
                while(j<n2&&a2[j]<=a1[i]) {
                	sum2 = sum2+a2[j];
                	j++;
                }
                if(a2[j-1]==a1[i])
                {
                	max= Integer.max(sum1,sum2);
                	ans = ans+max;
                	sum1=0;
                	sum2=0;
                	}
                
                if(j==n2&&i<n1) {
                	for(int z=i;z<n1;z++)
                		ans+=a1[z];
                	break;
                }
                i++;
            }
            if(i==n1&&j<n2) {
            	for(int z=j;z<n2;z++)
            		ans+=a2[z];}
        return ans;
    }
}