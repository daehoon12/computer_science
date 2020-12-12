public class MVCPatternDemo { // Application
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        controller.setStudentName("John");
        controller.updateView();
    }

    public static Student retriveStudentFromDatabase(){ // static을 붙이면 인스턴스를 생성하지 않아도 메소드 호출 가능
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
