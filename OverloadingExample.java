//Introduction to Overloading

public class OverloadingExample {
    public int Sum(int x, int y){
        return (x+y);
    }

    public int Sum(int x, int y, int z){
        return (x+y+z);
    }

    public double Sum(double x, double y){
        return (x+y);
    }

    public static void main(String[] args){
        OverloadingExample s = new OverloadingExample();
        System.out.println(s.Sum(5,6));
        System.out.println(s.Sum(5,6,1));
        System.out.println(s.Sum(5.5941,6.4569));


    }
}
