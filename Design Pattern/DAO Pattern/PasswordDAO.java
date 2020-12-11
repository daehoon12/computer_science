import java.util.List;

public interface PasswordDAO { // DAO 인터페이스, 사용을 분리해놓음
    public void insert(PasswordInfo p);
    public List<PasswordInfo> findAll();
    public PasswordInfo findByKey(String url);
    public void update(PasswordInfo p);
    public void delete(String url);
    public void delete(PasswordInfo p);
}
