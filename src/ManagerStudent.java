import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerStudent {


    public static void createTableHocSinh(){

        try {


            Connection cnn = DriverManager.getConnection(Connect.DB_URL,Connect.USER_NAME,Connect.PASSWORD);
            Statement stmt = cnn.createStatement();
            String sql ="CREATE TABLE [if not exist] `trigger`.`hocsinh` (\n" +
                    "  `id` INT NOT NULL,\n" +
                    "  `name` VARCHAR(45) NULL,\n" +
                    "  `birthday` VARCHAR(45) NULL,\n" +
                    "  `gender` VARCHAR(45) NULL,\n" +
                    "  `phone` VARCHAR(45) NULL,\n" +
                    "  `email` VARCHAR(45) NULL,\n" +
                    "  `address` VARCHAR(45) NULL,\n" +
                    "  `grade` VARCHAR(45) NULL,\n" +
                    "  PRIMARY KEY (`id`));\n";

            stmt.execute(sql);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void addStudent(Student student){

        try {

            Connection cnn = DriverManager.getConnection(Connect.DB_URL,Connect.USER_NAME,Connect.PASSWORD);

            String sql = "INSERT INTO hocsinh(id,name,birthday,gender,phone,email,address,grade) VALUES (?,?,?,?,?,?,?,?)";

            PreparedStatement pre = cnn.prepareStatement(sql);
            pre.setString(1, student.getId());
            pre.setString(2, student.getName());
            pre.setString(3, student.getBirthday());
            pre.setString(4, student.getGender());
            pre.setString(5, student.getPhone());
            pre.setString(6, student.getEmail());
            pre.setString(7, student.getAddress());
            pre.setString(8, student.getGrade());
            pre.execute(sql);


            System.out.println("Thêm thành công");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void updateStudent(String id){
        Student student = new Student();
        try {

            Connection cnn = DriverManager.getConnection(Connect.DB_URL,Connect.USER_NAME,Connect.PASSWORD);

            String sql = "UPDATE hocsinh set name =?, birthday =?, gender = ?,phone =?, email =?, address =?, grade =? where id ='"+id+"'";
            PreparedStatement pre = cnn.prepareStatement(sql);
            pre.setString(1, student.getName());
            pre.setString(2, student.getBirthday());
            pre.setString(3, student.getGender());
            pre.setString(4, student.getPhone());
            pre.setString(5, student.getEmail());
            pre.setString(6, student.getAddress());
            pre.setString(7, student.getGrade());
            pre.executeUpdate();
            System.out.println("Cập nhật thành công");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void deleteStudent(String id){
        try {

            String sql =" DELETE FROM hocsinh where id ='"+id+"'";
            Connection cnn = DriverManager.getConnection(Connect.DB_URL,Connect.USER_NAME,Connect.PASSWORD);
            PreparedStatement stmt = cnn.prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("Xóa thành công");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static  void showStudent(){

        try {
            List<Student> studentList = new ArrayList<>();

            String sql =" Select * from hocsinh";
            Connection cnn = DriverManager.getConnection(Connect.DB_URL,Connect.USER_NAME,Connect.PASSWORD);
            Statement stmt = cnn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student(rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("birthday"),
                        rs.getString("gender"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("grade"));
                student.display();
                studentList.add(student);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void searchByID(String id){
        try {
            List<Student> studentList = new ArrayList<>();

            String sql =" Select * from hocsinh where id='"+id + "'";
            Connection cnn = DriverManager.getConnection(Connect.DB_URL,Connect.USER_NAME,Connect.PASSWORD);
            Statement stmt = cnn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student(rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("birthday"),
                        rs.getString("gender"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("grade"));
                student.display();
                studentList.add(student);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void searchByName(String name){

        try {
            List<Student> studentList = new ArrayList<>();

            String sql =" Select * from hocsinh where name='"+name + "'";
            Connection cnn = DriverManager.getConnection(Connect.DB_URL,Connect.USER_NAME,Connect.PASSWORD);
            Statement stmt = cnn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student(rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("birthday"),
                        rs.getString("gender"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("grade"));
                student.display();
                studentList.add(student);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void searchByAddress(String address){

        try {
            List<Student> studentList = new ArrayList<>();

            String sql =" Select * from hocsinh where address='"+address + "'";
            Connection cnn = DriverManager.getConnection(Connect.DB_URL,Connect.USER_NAME,Connect.PASSWORD);
            Statement stmt = cnn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student(rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("birthday"),
                        rs.getString("gender"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("grade"));
                student.display();
                studentList.add(student);

            }

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }

}
