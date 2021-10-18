
package exam01;


public class Triangel {
    int x;
    int y;
    int z;
    
    public double totalarea(){
    double a = (x+y+z)/2.0;
    return Math.pow((a*(a-x)*(a-y)*(a-z)),.5);
    }
    
    
    public double Parimeter(){
        return (x+y+z)/2.0;
    }
}
