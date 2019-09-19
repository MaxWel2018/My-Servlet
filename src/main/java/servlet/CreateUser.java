package servlet;

import model.User;
import store.UserDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet("/user/create")
public class CreateUser extends HttpServlet {
    final AtomicInteger ids = new AtomicInteger();

    private  final UserDB USER_DB = UserDB.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.USER_DB.add(new User(this.ids.incrementAndGet(), req.getParameter("login"), req.getParameter("email")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/user/view"));
    }
}
