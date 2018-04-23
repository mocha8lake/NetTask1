import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLServlet extends HttpServlet{
    public HTMLServlet(){
        super();
    }

    @Override
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"
                +"<HTML>\n"
                +"  <HEAD><TITLE>GET</TITLE></HEAD>\n"
                +"  <BODY>\n"
                +"    <table border='0' align='center'>\n"
                +"            <tr><td>you have just done a GET</td></tr>\n"
                +"     </table>\n"
                +"  </BODY>\n"
                +"</HTML>");

        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        PrintWriter out=resp.getWriter();

        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>POST</TITLE></HEAD>");
        out.println("  <BODY>");
        out.println("    <table border='0' align='center'>");
        out.println("            <tr><td>you have just done a POST</td></tr>");
        out.println("     </table>");
        out.println("  </BODY>");
        out.println("</HTML>");

        out.flush();
        out.close();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        String protocol = req.getProtocol();
        String filepath="./protocol.txt";

        writeTxtFile(protocol,filepath);

    }

    @Override
    public void destroy(){
        super.destroy();
    }

    public static void writeTxtFile(String content,String filePath){
        File thisFile=new File(filePath);
        try {
            if(!thisFile.exists())
                thisFile.createNewFile();
            FileWriter fw=new FileWriter(filePath,true);
            fw.write(content);
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
