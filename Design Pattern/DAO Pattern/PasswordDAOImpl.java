import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.sql.*;

public class PasswordDAOImpl implements PasswordDAO{ // DAO를 구현한 코드
    final static String DB_FILE_NAME = "password.db";
    final static String DB_TABLE_NAME = " passwords";

    Connection connection = null;
    ResultSet rs = null;
    Statement statement = null;

    public PasswordDAOImpl(){ // 생성자에서는 table을 만든다.
        final String table = "(url text PRIMARY KEY, id text, password text)";
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
            statement = connection.createStatement();

            statement.setQueryTimeout(30);

            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(PasswordInfo p) { // 정보 삽입
        try{
            String fmt = "INSERT INTO %S VALUES('%s', '%s', '%s')";
            String q = String.format(fmt, DB_TABLE_NAME, p.getUrl(), p.getId(), p.getPassword());
            statement.execute(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<PasswordInfo> findAll() { // 전체 데이터 찾기
        ArrayList<PasswordInfo> passwords = new ArrayList<PasswordInfo>();
        try{
            rs = statement.executeQuery("SELECT * FROM " + DB_TABLE_NAME);

            while(rs.next()){
                passwords.add(new PasswordInfo(rs.getString("url"), rs.getString("id"), rs.getString("password")));
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passwords;
    }

    @Override
    public PasswordInfo findByKey(String url) { // key로 데이터 찾기
        PasswordInfo password = null;
        try{
            String fmt = "SELECT * FROM %s WHERE url = '%s'";
            String q = String.format(fmt, DB_TABLE_NAME, url);

            rs = statement.executeQuery(q);
            if (rs.next()){
                password =new PasswordInfo(rs.getString("url"), rs.getString("id"), rs.getString("password"));

            }
        }catch (SQLException e){e.printStackTrace();}
        return password;
    }

    @Override
    public void update(PasswordInfo p) { // 수정
        PasswordInfo password= findByKey(p.getUrl());

        if (password != null) {
            try {
                String fmt = "UPDATE %s SET id = '%s' WHERE url = '%s'";
                String q = String.format(fmt, DB_TABLE_NAME,
                        p.getId(), p.getUrl());
                statement.execute(q);
            }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }

    @Override
    public void delete(String url) { // 삭제
        try {
            String fmt = "DELETE FROM %s WHERE url = '%s'";
            String q = String.format(fmt, DB_TABLE_NAME, url);

            statement.execute(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(PasswordInfo p) {
        delete(p.getUrl());
    } // 패스워드로 삭제
}
