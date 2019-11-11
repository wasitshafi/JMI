class CArrayList<E>
{
    Object arr[];
    final int INITIAL_SIZE = 10;
    int size;
 
    CArrayList()
    {
        arr = new Object[INITIAL_SIZE];
    }

    public void add(E item)
    {
        if(size == arr.length)
            ensureCapacity();
    
        arr[size++] =  item;
    }

    public void ensureCapacity()
    {
        Object newArr[] = new Object[arr.length * 2];
        for(int i = 0 ; i < size ; i++)
            newArr[i] = arr[i];
        arr = newArr;
    }

    @SuppressWarnings("unchecked")
    public E get(int i)
    {
        return (E)arr[i];
    }

    public int size()
    {
        return size;
    }
}
public class CustomArrayList
{
    public static void main(String[] args)
    {
        CArrayList<Integer> al = new CArrayList<Integer>();
        for(int i = 1 ; i <= 15; i++)
            al.add(i);
        for(int i = 0 ; i < al.size() ; i++)
            System.out.println(al.get(i) + " ");
    }
}