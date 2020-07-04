
import java.util.*;


public class Telephone {

public static void main(String[] args) {

        int n=0,j=0,hr,m,ss;
        String  str;
        ArrayList<String> time=new ArrayList<>();
        HashMap<String,bill> h=new HashMap<>();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter no of Inputs:");
        n=s.nextInt();
        bill[] b=new bill[50];
        String dummy=s.nextLine();
        for(int i =0;i<n;i++){  
           str=s.nextLine();
            String[] splits =str.split(",");
            String[] t=splits[0].split(":");
            hr=Integer.parseInt(t[0]);
             m=Integer.parseInt(t[1]);
              ss=Integer.parseInt(t[2]);
            b[i]=new bill(hr,m,ss);
            h.put(splits[1],b[i]);
            //ArrayList<bill>h =new ArrayList<bill>();
    }
        Iterator<String> keySetIterator = h.keySet().iterator();
        while(keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            System.out.println(key +"- "+h.get(key).hr+":"+h.get(key).m+":"+h.get(key).ss+"-"+h.get(key).cost+"-"+h.get(key).secs);
        }
        System.out.println(h);
}
}

class bill{
    int hr,m,ss,secs,cost;
    
    bill(int hr,int m,int ss){
        this.hr=hr;
        this.m=m;
        this.ss=ss;
        secs=hr*60*60+m*60+ss;
        if(hr==0 && m<5){
        cost=((m*60)+ss)*3;
        }
        else{ 
            if(ss>0)
                m+=1;
        cost=((hr*60)+m)*150;
        }
    }
}
