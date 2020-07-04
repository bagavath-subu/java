
import java.util.*;


public class Main {
public static void main(String[] args) {
    System.out.println("Enter input:");
        Scanner s=new Scanner(System.in);
        int l=0,c=0;
        int tn;
        String n;
        n=s.nextLine();
        char a[]=n.toCharArray();
        tn=n.length();
        String[][] b=new String[(2*tn)][tn];
        
        for(int i=0;i<2*tn;i++){
            for(int j=0;j<tn;j++){
               b[i][j]=" ";
            }
        }
        int k=tn;
        for(int j=0;j<tn;j++){
            if(a[j]=='U')
            {  b[k-1][j]="/";
            k--;
            }
            else
            {   b[k][j]="\\";
            k++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]=='U'){
                l++;
            if(l==0){
                c++;
            }}
            else
                l--;
                    }
        
        System.out.println(c);
        for(int i=0;i<2*tn;i++){
            for(int j=0;j<tn;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
