import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();

        while (true) {
            System.out.println("Chuong trinh quản lý thông tin hoc sinh");
            System.out.println("Enter 1: Thêm hoc sinh");
            System.out.println("Enter 2: Sửa thông tin hoc sinh theo id");
            System.out.println("Enter 3: Xóa hoc sinh theo id");
            System.out.println("Enter 4: Hiển thị tất cả học sinh");
            System.out.println("Enter 5: Tìm học sinh theo tên");
            System.out.println("Enter 6: Tìm học sinh theo id");
            System.out.println("Enter 7: Hiển thị thông tin các học sinh cùng quê");
            System.out.println("Enter 8: Thoat");
            System.out.print("Nhap vao lua chon: ");
            String luaChon = sc.nextLine();
            switch (luaChon) {

                case "1": {


                    System.out.println("Nhập thông tin sinh viên:");

                    String id ="";
                    System.out.println("Nhập id:");
                    id = sc.nextLine();
                    String name ="";
                    do{
                        System.out.print("Nhập họ và tên( 5< kí tự <50): ");
                        name = sc.nextLine();
                        if(!Validate.isName(name)){
                            System.out.println("Không hợp lệ, thử lại");
                        }
                    }while (!Validate.isName(name));

                    String birthday="";
                    do{
                        System.out.print("Nhập ngày sinh(yyyy-mm-dd): ");
                        birthday = sc.nextLine();
                        if(!Validate.isBirthday(birthday)){
                            System.out.println("Không hợp lệ, thử lại");
                        }
                    }while (!Validate.isBirthday(birthday));

                    String gender = "";

                    do{
                        System.out.print("Nhập giới tính: ");
                        gender = sc.nextLine();
                        if(!Validate.isGender(gender)){
                            System.out.println("Không hợp lệ, thử lại");
                        }
                    }while (!Validate.isGender(gender));

                    String phone ="";

                    do{
                        System.out.print("Nhập số điện thoại (10 chữ số): ");
                        phone = sc.nextLine();
                        if(!Validate.isPhone(phone)){
                            System.out.println("Không hợp lệ, thử lại");
                        }
                    }while (!Validate.isPhone(phone));


                    String email = "";
                    do{
                        System.out.print("Nhập email: ");
                        email = sc.nextLine();
                        if(!Validate.isEmail(email)){
                            System.out.println("Không hợp lệ, thử lại");
                        }
                    }while (!Validate.isEmail(email));


                    String address ="";
                   System.out.println("Nhập quê quán");
                    address = sc.nextLine();

              String grade = "";

                    do{
                        System.out.print("Nhập lớp : ");
                         grade = sc.nextLine();
                        if(!Validate.isGrade(grade)){
                            System.out.println("Không hợp lệ, thử lại");
                        }
                    }while (!Validate.isGrade(grade));
                    Student student = new Student(id,name,birthday,gender,phone,email,address,grade);

                    managerStudent.addStudent(student);
                    break;

                }
                case "2":{
                    System.out.println("Nhập id học sinh cần cập nhật:");
                    String id = sc.nextLine();
                    managerStudent.updateStudent(id);
                    break;

                }

                case "3":{
                    System.out.println("Nhập id học sinh cần xóa:");
                    String id = sc.nextLine();
                    managerStudent.deleteStudent(id);
                    break;


                }
                case "4":{
                    managerStudent.showStudent();
                    break;
                }
                case "5":{
                    System.out.println("Nhập tên sinh viên cần tìm:");
                    String name = sc.nextLine();
                    managerStudent.searchByName(name);
                    break;
                }
                case "6":{
                    System.out.println("Nhập tên sinh viên cần tìm:");
                    String id = sc.nextLine();
                    managerStudent.searchByID(id);
                    break;


                }

                case "7":{
                    System.out.println("Nhập quê quán:");
                    String address = sc.nextLine();
                    managerStudent.searchByAddress(address);
                    break;
                }
                case "8":{

                    return;
                }

                default: System.out.println("Không hợp lề vui lòng thử lại");
                continue;


            }

        }


    }
}
