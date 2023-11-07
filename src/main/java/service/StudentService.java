package service;

import connectdatabase.ConnectDatabase;
import model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements SService<Student>{
    private final Connection connection = ConnectDatabase.getConnection();

    @Override
    public void addStudent(Student student) {
        String Insert_Into = "insert into student(name,dateOfBirth,address,phone,email,classroomId) values (?,?,?,?,?,? );";
        try {
            PreparedStatement statement = connection.prepareStatement(Insert_Into);
            statement.setString(1,student.getName());
            statement.setString(2,student.getDateOfBirth());
            statement.setString(3,student.getAddress());
            statement.setString(4,student.getPhoneNumber());
            statement.setString(5,student.getEmail());
            statement.setString(6,student.getClassRoom());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean editStudent(int id, Student student) {
        String sql_update = "update student set name = ?, dateOfBirth = ?, address = ?, phone = ?, email = ?, classroomId = ? WHERE id = ?;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql_update);
            statement.setString(1,student.getName());
            statement.setString(2,student.getDateOfBirth());
            statement.setString(3,student.getAddress());
            statement.setString(4,student.getPhoneNumber());
            statement.setString(5,student.getEmail());
            statement.setString(6, String.valueOf(student.getClassRoom()));
            statement.setInt(7,id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean deleteStudent(int id) {
        String sql_delete = "delete from student where id = ?;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql_delete);
            statement.setInt(1,id);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public List<Student> getStudent() {
        List<Student> studentList = new ArrayList<>();
        String sql = "select * from student;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String dateOfBirth = resultSet.getString("dateOfBirth");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                String classRoomId = resultSet.getString("classroomId");
                Student student = new Student(id,name,email,dateOfBirth,address,phone,classRoomId);
                studentList.add(student);
                System.out.println(studentList);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }

    @Override
    public Student findPetById(int id) {
        return null;
    }
    public List<Student> findStudentByName(String name) {
        String sql_search_student = "select * from student where name like ?;";
        List<Student> listStudent = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(sql_search_student);
            statement.setString(1,"%"+name+"%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name_new = resultSet.getString("name");
                String email = resultSet.getString("email");
                String dateOfBirth = resultSet.getString("dateOfBirth");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                String classRoomId = resultSet.getString("classroomId");
                Student student = new Student(id,name_new,email,dateOfBirth,address,phone,classRoomId);
                listStudent.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listStudent;
    }
}
