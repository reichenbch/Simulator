package simulator;
import java.util.Vector;
public class SCP
{
    static int pagefault = 0;
    public SCP(int framesize, int[] seq){
        int frame[] = new int[100];
        int frequency[] = new int[200]; 
        int n = seq.length;
        for(int i=0; i<n; i++)
            frequency[seq[i]] = -1;
        
        Vector oldidx = new Vector(0);
        for(int i=0; i<framesize; i++){
            oldidx.addElement(i);
            frame[i] = -1;
        }
        
        for(int i=0; i<n; i++)
        {
            if(frequency[seq[i]] >= 0){
                frequency[seq[i]]++;
            }
            else
            {
                pagefault++;
                while(frequency[seq[i]] == -1) {

                    int oldestidx;
                    for(int j=0; j<framesize; j++)
                    {
                        oldestidx = (Integer)oldidx.get(j);
                        if(frame[oldestidx] != -1 && frequency[frame[oldestidx]] > 0)
                        {
                            frequency[frame[oldestidx]]--;
                        }
                        else
                        {        
                            if(frame[oldestidx] != -1)
                                frequency[frame[oldestidx]] = -1;                       
                            frame[oldestidx] = seq[i];                      
                            frequency[seq[i]] = 0;                        
                            oldidx.removeElementAt(j);                      
                            oldidx.addElement(oldestidx);                       
                            break;
                        }
                    }
                }
            } 
        }    
    }
    public int method(){
        return pagefault;
    }
}  

