package co.yedam.apiData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SampleDataServlet")
public class SampleDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SampleDataServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/xml; charSet=UTF-8");
		response.setCharacterEncoding("UTF-8");

		String nor = request.getParameter("numberOfRow");
		String pn = request.getParameter("pageNo");
		String sd = request.getParameter("startDate");
		String ed = request.getParameter("endDate");

		String hostUrl = "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=2wnq2GRmfQuqU%2FcTKjoF6Ezy4JTOIdJ%2BvIhFw35DKWd%2Bbtm2Ugu2xgAJWccPB7VknG1pt%2BKu%2BmLvSAl3NUy7%2Bw%3D%3D";
		hostUrl += "&pageNo=" + pn;
		hostUrl += "&numOfRows=" + nor;
		hostUrl += "&startCreateDt=" + sd;
		hostUrl += "&endCreateDt=" + ed;
		URL url = new URL(hostUrl);
		HttpURLConnection urlconn = (HttpURLConnection) url.openConnection();
		urlconn.setRequestMethod("GET");
		BufferedReader br = new BufferedReader(new InputStreamReader(urlconn.getInputStream(), "UTF-8"));
		String result = "", line = "";
		while ((line = br.readLine()) != null) {
			result += line + "\n";
		}
		response.getWriter().println(result);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}