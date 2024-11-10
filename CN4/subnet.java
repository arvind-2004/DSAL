/* 4th  */

import java.io.*;
import java.net.InetAddress;
public class subnet {
 
    public static void main(String[] args) throws IOException {
     
        System.out.println("ENTER IP:"); // Give any IP Address
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip = br.readLine();
        String checkclass = ip.substring(0, 3);



        int cc = Integer.parseInt(checkclass); // configration of Classes
        String mask = null;
        if(cc>0 && cc<224)
        {
            if(cc<128)
            {
                mask = "255.0.0.0";
            }
            if(cc>127 && cc<192)
            {
                mask = "255.255.0.0";
            }
            if(cc>191)
            {
                mask = "255.255.255.0";
            }
        }
        System.out.println("MASK:\n"+mask); // print the subnet mask

        String networkAddr="";
        String[] ipAddrParts=ip.split("\\.");
        String[] maskParts=mask.split("\\.");

        for(int i=0;i<4;i++){
        int x=Integer.parseInt(ipAddrParts[i]);
        int y=Integer.parseInt(maskParts[i]);
        int z=x&y;
        networkAddr+=z+".";
        }
     
    System.out.println("ADDRESS:\n"+networkAddr);
   }
 
}
