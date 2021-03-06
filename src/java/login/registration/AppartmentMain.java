package login.registration;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(urlPatterns = {"/AppartmentMain"})
@MultipartConfig(maxFileSize = 4177215)
public class AppartmentMain extends HttpServlet {
   
     @Override
   public void service (HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   { 
        String Roomid = UUID.randomUUID().toString();//req.getParameter("room");
        String Address = req.getParameter("Address");
        String state = req.getParameter("state");
        String Bedroom = req.getParameter("bedroom"); 
        String Email1= req.getParameter("Email");
        InputStream inputStream = null;
        System.out.println(Roomid+" "+Address+" "+state+" "+Bedroom+" "+Email1);
        Part filePart = req.getPart("photo");
        if (filePart != null) {
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
            inputStream = filePart.getInputStream();
        }
        ApartBean Ap = new ApartBean();
        Ap.setRoomId(Roomid);
        Ap.setBedrooms(Bedroom);
        Ap.setState(state);
        Ap.setAddress(Address);
        Ap.setEmail(Email1);
        Ap.setImage(inputStream);
        ApartDao Aa= new ApartDao();
        if(Aa.addApp(Ap))
        {
         req.getRequestDispatcher("/front.jsp").include(req, res);
          
        }
        else
        {
           req.getRequestDispatcher("/userApart.jsp").include(req, res);
        }
    }
}
