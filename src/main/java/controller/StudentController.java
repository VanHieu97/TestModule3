package controller;

import model.Student;
import service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@WebServlet(name = "StudentController", urlPatterns = "/student")
public class StudentController extends HttpServlet {
    StudentService service = new StudentService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "get";
        }
        switch (action){
            case "add":
                FormAdd(request,response);
                break;
            case "update":
                FormUpdate(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            case "get":
                getStudent(request,response);
                break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "add":
                addStudent(request,response);
                break;
            case "update":
                update(request,response);
                break;
            case "search":
                search_student(request,response);
                break;
        }
    }

    public void addStudent(HttpServletRequest request,HttpServletResponse response) throws  ServletException,IOException{
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String date = request.getParameter("dateOfBirth");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        String classRoom = request.getParameter("classRoom");
        Student student = new Student(name,email,date,address,phoneNumber,classRoom);
        service.addStudent(student);
        response.sendRedirect("/student?action=get");
    }
    public void FormAdd(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("Create.jsp");
        dispatcher.forward(request,response);
    }
    public void FormUpdate(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher dispatcher = request.getRequestDispatcher("FormUpdate.jsp");
        request.setAttribute("id",id);
        Student student =service.findPetById(id);
        request.setAttribute("student",student);
        dispatcher.forward(request,response);

    }
    public void update(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String DateOfBirth  = request.getParameter("dateOfBirth");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        String classRoom = request.getParameter("classRoom");
        Student student = new Student(id,name,email,DateOfBirth,address,phoneNumber,classRoom);
        service.editStudent(id,student);
        response.sendRedirect("/student");
    }
    public void delete(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        service.deleteStudent(id);
        response.sendRedirect("/student");
    }
    public void getStudent(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        List<Student> studentList = service.getStudent();
        RequestDispatcher dispatcher = request.getRequestDispatcher("Student.jsp");
        request.setAttribute("student",studentList);
        dispatcher.forward(request,response);
    }

    public void search_student(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        String name = request.getParameter("search");
        request.setAttribute("student",service.findStudentByName(name));
        request.getRequestDispatcher("Student.jsp").forward(request,response);
    }

}
