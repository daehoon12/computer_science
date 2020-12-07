import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection{ // 인터페이스를 Adapt
    ArrayList<T> arraylist = new ArrayList<T>();
    private int length=0;

    @Override
    public boolean put(Object t) {
        arraylist.add((T) t);
        length = arraylist.size();
        return true;
    }

    @Override
    public T elemAt(int index) {
        if(index >=0 && index <length)
            return arraylist.get(index);
        return null;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public Iterator createIterator() {
        return new DataCollectionAdapterIterator(this);
    }
}
