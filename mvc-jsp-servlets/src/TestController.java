import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		get the request dispatcher
		RequestDispatcher dispatcher= request.getRequestDispatcher("view.jsp");
//		get the data from model by calling getData method of model class
		String data= TestModel.getData();
//		set the data to request obj
		request.setAttribute("data", data);
//		Forward the request and response
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
