
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TelephoneI {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String log="";
while(true)
{
String str=s.nextLine();
if(str.equals("")){
break;
}
else
    log+=str+" ";
}
Solution(log);
}    

static int Solution(String T){
  ArrayList<Contact> ar=new ArrayList<>();
  HashMap<String,Integer> hm=new HashMap<>();
    String[] logs=T.split(" ");
    for(String i:logs)
        System.out.println(i);
    String[] time=new String[logs.length];
    String[] phno=new String[logs.length];
    int cost;
        int total=0;
        int max=0;
    for(int i=0;i<logs.length;i++)
    {
        time[i]=logs[i].substring(0,8);
        phno[i]=logs[i].substring(9);
        String[] t=time[i].split(":");
        int hr=Integer.parseInt(t[0]);
        int m=Integer.parseInt(t[1]);
        int s=Integer.parseInt(t[2]);
        int sec=hr*3600+m*60+s;
        if(sec<=299){
            cost=sec*3;
        }
        else
        {
            if(s>0)cost=(m+1)*150;
            else cost=m*150;
        }
        total+=cost;
        max=(max>cost)?max:cost;
        
        System.out.println(logs[i]);
        ar.add(new Contact(phno[i],cost));
    }
    int c=0;
    for(Contact i:ar){
        if(hm.containsKey(i.phno))
        c=hm.get(i.phno)+i.cost;
        hm.put(i.phno,c);
    }

    if(logs.length==1)max=0;
    System.out.println(Math.abs(total-max));
    
    return 0;
}
}

class Contact{
    String phno;
    int cost;
    Contact(String p,int c){
phno=p;
cost=c;
}
}

