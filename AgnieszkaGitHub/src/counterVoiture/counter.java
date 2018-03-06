/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counterVoiture;

/**
 *
 * @author 2501agpestel
 */
public class counter {
    private static int cnt = 0;
    public String name;
    
    public int getCounter() {
        return cnt;
    }  
    
    
    public counter (String name) {
        this.name = name;
        cnt++;
    }
    
    public static void main(String[] args) {
        
        counter v1 = new counter("Albert");
        System.out.println(counter.cnt);
        
        counter v2 = new counter("Paola ");
        System.out.println(counter.cnt);
        
    }
}
