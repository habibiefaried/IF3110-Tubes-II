package apiController;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import databaseLib.DatabaseAdapter;

/**
 * Servlet implementation class CheckUsername
 */
@WebServlet("/api/usernameAvailable")
public class CheckUsername extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckUsername() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		DatabaseAdapter DBA = new DatabaseAdapter();
		String query = "select * from account where username = '" + username + "' limit 1";
		DBA.executeQuery(query);
		ResultSet RS = DBA.getQueryResult();
		try {
			if (!RS.isBeforeFirst()) {
				JSONObject json = new JSONObject();
				json.put("status", true);
				out.write(json.toString());
			} else {
				JSONObject json = new JSONObject();
				json.put("status", false);
				out.write(json.toString());
			}
		} catch (SQLException | JSONException e) {
			e.printStackTrace();
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
