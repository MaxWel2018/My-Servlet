package servlet;

import store.UserDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/view")
public class ViewUser extends HttpServlet {

    private final UserDB USER_DB = UserDB.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", this.USER_DB.values());
        req.getRequestDispatcher("/views/UserView.jsp").forward(req, resp);
    }



}
