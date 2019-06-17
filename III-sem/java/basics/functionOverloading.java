class overloading{ // Its is not necessary to make class name same as file lets try different this time -_-
    public int sum(int x, int y)
    {
        return x + y;
    }
    public double sum(double x, double y)
    {
        return x + y; 
    }
    public double sum(double x, float y)
    {        
        return x + y;
    }
    public double sum(int x, double y)
    {
        return x + y;
    }
    public static void main(String []args)
    {
        overloading s = new overloading();

        System.out.println("sum(10, 20) = " + s.sum(10, 20));
        System.out.println("sum(10.5, 20.7) = " + s.sum(10.5, 20.7));
        System.out.println("sum(10, 20.5) = " + s.sum(10, 20.5));
        System.out.println("sum(10.5, 20) = " + s.sum(10.5, 20));
    }
}