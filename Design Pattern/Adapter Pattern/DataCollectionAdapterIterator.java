import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapterIterator implements Iterator { // Iterator 인터페이스를 Adapt
    private int idx;
    private DataCollectionAdapter arraylist;
    public DataCollectionAdapterIterator(DataCollectionAdapter arraylist){
        this.arraylist = arraylist;
        idx=0;
    }
    @Override
    public boolean hasNext() {
        return idx <arraylist.length();
    }

    @Override
    public Object next() {
        Object obj = arraylist.elemAt(idx);
        idx++;
        return obj;
    }

}
