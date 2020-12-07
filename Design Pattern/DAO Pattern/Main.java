public class Main {
    public static void main(String[] args) {
        PasswordInfo p;
        PasswordDAO passwordDAO = new PasswordDAOImpl();

        System.out.println("DB 추가");
        p = new PasswordInfo("https://www.smu.ac.kr", "smu", "abcde");
        passwordDAO.insert(p);
        p = new PasswordInfo("https://www.smu2.ac.kr", "smu2", "abcde");
        passwordDAO.insert(p);
        System.out.println("데이터가 제대로 추가되었나 확인");
        for (PasswordInfo pi : passwordDAO.findAll()){
            System.out.println(pi);
        }
        System.out.println("smu2를 smu1으로 수정");
        p=passwordDAO.findAll().get(1);
        p.setId("smu1");
        passwordDAO.update(p);
        for (PasswordInfo pi : passwordDAO.findAll()){
            System.out.println(pi);
        }
        System.out.println("삭제");
        passwordDAO.delete("https://www.smu2.ac.kr");
        for (PasswordInfo pi : passwordDAO.findAll()){
            System.out.println(pi);
        }
    }
}
