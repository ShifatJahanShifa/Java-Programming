public class TwoGen<V,T> {
    V ob1;
    T ob2;
    TwoGen(V o1,T o2)
    {
        ob1=o1;
        ob2=o2;
    }
    T getOb2()
    {
        return ob2;
    }
    V getOb1()
    {
        return ob1;
    }
    void showType() {
        System.out.println("Type of V is: "+ob1.getClass().getName());
        System.out.println("Type of T is: "+ob2.getClass().getName());
    }
}
