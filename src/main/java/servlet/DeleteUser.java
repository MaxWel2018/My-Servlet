package servlet;

import store.UserDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/delete")
public class DeleteUser extends HttpServlet {
    private final UserDB USER_DB = UserDB.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.USER_DB.delete(Integer.parseInt(req.getParameter("id")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/user/view"));

    }
}
