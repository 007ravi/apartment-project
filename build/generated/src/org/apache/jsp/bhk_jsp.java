package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bhk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Property-Guru</title>\n");
      out.write("<link rel=\"icon\" href=\"logo.png\" height=\"18\" width=\"52\">\n");
      out.write("<a href=\"front.jsp\"><img src=\"ap1.png\" align=\"right\" height=\"100\" width=\"100\" style=\"margin:10px;position:fixed;\"></a>\n");
      out.write("<style>\n");
      out.write("/*.button {\n");
      out.write("    margin: 5px 0px;\n");
      out.write("\tpadding: 10px 25px;\n");
      out.write("\tbackground-color:#713a11;\n");
      out.write("\tborder:none;\n");
      out.write("\tborder-radius: 3px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-shadow: 1px 1px 2px #5f574c;\n");
      out.write("\tfont: 600 16px/20px 'Open Sans', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("  margin-bottom: 30px;\n");
      out.write("  margin-left: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("body\n");
      out.write("{\n");
      out.write("margin:0px;\n");
      out.write("\n");
      out.write("}*/\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".footer\n");
      out.write("{\n");
      out.write("  background-color:#713a11;\n");
      out.write("  color:white;\n");
      out.write("  padding:20px;\n");
      out.write("  font-family: Verdana,sans-serif;\n");
      out.write("  text-align:left;\n");
      out.write("\n");
      out.write("}  \n");
      out.write("body {\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    padding: 20px;\n");
      out.write("    font-family: Arial;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Center website */\n");
      out.write(".main {\n");
      out.write("    max-width: 1000px;\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("    font-size: 50px;\n");
      out.write("    word-break: break-all;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row {\n");
      out.write("    margin: 8px -16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add padding BETWEEN each column (if you want) */\n");
      out.write(".row,\n");
      out.write(".row > .column {\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create four equal columns that floats next to each other */\n");
      out.write(".column {\n");
      out.write("    float: left;\n");
      out.write("    width: 25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after rows */ \n");
      out.write(".row:after {\n");
      out.write("    content: \"\";\n");
      out.write("    display: table;\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Content */\n");
      out.write(".content {\n");
      out.write("    background-color: white;\n");
      out.write("    padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - makes a two column-layout instead of four columns */\n");
      out.write("@media screen and (max-width: 900px) {\n");
      out.write("    .column {\n");
      out.write("        width: 50%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - makes the two columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("    .column {\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body background=\"wall.jpg\">\n");
      out.write("\n");
      out.write("<div class=\"main\">\n");
      out.write("\n");
      out.write("<p align=\"center\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img src=\"1bhklogo.png\" height=\"300\" width=\"300\"></p>\n");
      out.write("<font face=\"Cambria\" color=cyan><center><h2><b>1BHK ROOMS OFFERED BY PROPERTYGURU.COM<br></b></h2></FONT>\n");
      out.write("<p align=\"center\"><img src=\"motiff.png\" height=\"145\" width=\"648\"></p><br>\n");
      out.write("<marquee>\n");
      out.write("<p align=\"center\"><font face=\"calibri\" size=\"6\"><b>1 Bhk rooms in Pinjore</b><br>\n");
      out.write("\n");
      out.write("</marquee>\n");
      out.write("  <div class=\"column\">\n");
      out.write("    <div class=\"content\"  style = \"background-color:whitesmoke;\">\n");
      out.write("      <img src=\"3.jpg\" alt=\"2\" style=\"width:100%\">\n");
      out.write("      <h3  style = \"background-color:red;\">Details:</h3>\n");
      out.write("      <p  style = \"background-color:lemonchiffon;\">1. Flooring type: Verified Tiles<br>\n");
      out.write("2. Semi-Furnished,<br>\n");
      out.write("3. Property on 5th floor,<br> \n");
      out.write("4. Brokerage terms: 1 Month-Rent,<br> \n");
      out.write("5. Security Deposit 40000<br>\n");
      out.write("\n");
      out.write("6. Attached Bathroom which includes:-<br>\n");
      out.write("  \n");
      out.write("  a.) Western Toilet<br>\n");
      out.write("  b.) Hot and Cold Running Water<br>\n");
      out.write("</p></pre>\n");
      out.write("<form action=\"\">\n");
      out.write("    <input type=\"submit\" value=\"Book Now\" class=\"button\"/>\n");
      out.write("</form></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<div class=\"column\">\n");
      out.write("    <div class=\"content\"  style = \"background-color:whitesmoke;\">\n");
      out.write("      <img src=\"3.jpg\" alt=\"2\" style=\"width:100%\">\n");
      out.write("      <h3  style = \"background-color:red;\">Details:</h3>\n");
      out.write("      <p  style = \"background-color:lemonchiffon;\">1. Flooring type: Verified Tiles<br>\n");
      out.write("2. Semi-Furnished,<br>\n");
      out.write("3. Property on 5th floor,<br> \n");
      out.write("4. Brokerage terms: 1 Month-Rent,<br> \n");
      out.write("5. Security Deposit 40000<br>\n");
      out.write("\n");
      out.write("6. Attached Bathroom which includes:-<br>\n");
      out.write("  \n");
      out.write("  a.) Western Toilet<br>\n");
      out.write("  b.) Hot and Cold Running Water<br>\n");
      out.write("</p></pre>\n");
      out.write("<form action=\"\">\n");
      out.write("    <input type=\"submit\" value=\"Book Now\" class=\"button\"/>\n");
      out.write("</form></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("    <div class=\"content\"  style = \"background-color:whitesmoke;\">\n");
      out.write("      <img src=\"3.jpg\" alt=\"2\" style=\"width:100%\">\n");
      out.write("      <h3  style = \"background-color:red;\">Details:</h3>\n");
      out.write("      <p  style = \"background-color:lemonchiffon;\">1. Flooring type: Verified Tiles<br>\n");
      out.write("2. Semi-Furnished,<br>\n");
      out.write("3. Property on 5th floor,<br> \n");
      out.write("4. Brokerage terms: 1 Month-Rent,<br> \n");
      out.write("5. Security Deposit 40000<br>\n");
      out.write("\n");
      out.write("6. Attached Bathroom which includes:-<br>\n");
      out.write("  \n");
      out.write("  a.) Western Toilet<br>\n");
      out.write("  b.) Hot and Cold Running Water<br>\n");
      out.write("</p></pre>\n");
      out.write("<form action=\"\">\n");
      out.write("    <input type=\"submit\" value=\"Book Now\" class=\"button\"/>\n");
      out.write("</form></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"column\">\n");
      out.write("    <div class=\"content\"  style = \"background-color:whitesmoke;\">\n");
      out.write("      <img src=\"3.jpg\" alt=\"2\" style=\"width:100%\">\n");
      out.write("      <h3  style = \"background-color:red;\">Details:</h3>\n");
      out.write("      <p  style = \"background-color:lemonchiffon;\">1. Flooring type: Verified Tiles<br>\n");
      out.write("2. Semi-Furnished,<br>\n");
      out.write("3. Property on 5th floor,<br> \n");
      out.write("4. Brokerage terms: 1 Month-Rent,<br> \n");
      out.write("5. Security Deposit 40000<br>\n");
      out.write("\n");
      out.write("6. Attached Bathroom which includes:-<br>\n");
      out.write("  \n");
      out.write("  a.) Western Toilet<br>\n");
      out.write("  b.) Hot and Cold Running Water<br>\n");
      out.write("</p></pre>\n");
      out.write("<form action=\"\">\n");
      out.write("    <input type=\"submit\" value=\"Book Now\" class=\"button\"/>\n");
      out.write("</form></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("    <div class=\"content\"  style = \"background-color:whitesmoke;\">\n");
      out.write("      <img src=\"3.jpg\" alt=\"2\" style=\"width:100%\">\n");
      out.write("      <h3  style = \"background-color:red;\">Details:</h3>\n");
      out.write("      <p  style = \"background-color:lemonchiffon;\">1. Flooring type: Verified Tiles<br>\n");
      out.write("2. Semi-Furnished,<br>\n");
      out.write("3. Property on 5th floor,<br> \n");
      out.write("4. Brokerage terms: 1 Month-Rent,<br> \n");
      out.write("5. Security Deposit 40000<br>\n");
      out.write("\n");
      out.write("6. Attached Bathroom which includes:-<br>\n");
      out.write("  \n");
      out.write("  a.) Western Toilet<br>\n");
      out.write("  b.) Hot and Cold Running Water<br>\n");
      out.write("</p></pre>\n");
      out.write("<form action=\"\">\n");
      out.write("    <input type=\"submit\" value=\"Book Now\" class=\"button\"/>\n");
      out.write("</form></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("    <div class=\"content\"  style = \"background-color:whitesmoke;\">\n");
      out.write("      <img src=\"3.jpg\" alt=\"2\" style=\"width:100%\">\n");
      out.write("      <h3  style = \"background-color:red;\">Details:</h3>\n");
      out.write("      <p  style = \"background-color:lemonchiffon;\">1. Flooring type: Verified Tiles<br>\n");
      out.write("2. Semi-Furnished,<br>\n");
      out.write("3. Property on 5th floor,<br> \n");
      out.write("4. Brokerage terms: 1 Month-Rent,<br> \n");
      out.write("5. Security Deposit 40000<br>\n");
      out.write("\n");
      out.write("6. Attached Bathroom which includes:-<br>\n");
      out.write("  \n");
      out.write("  a.) Western Toilet<br>\n");
      out.write("  b.) Hot and Cold Running Water<br>\n");
      out.write("</p></pre>\n");
      out.write("<form action=\"\">\n");
      out.write("    <input type=\"submit\" value=\"Book Now\" class=\"button\"/>\n");
      out.write("</form></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"column\">\n");
      out.write("    <div class=\"content\"  style = \"background-color:whitesmoke;\">\n");
      out.write("      <img src=\"3.jpg\" alt=\"2\" style=\"width:100%\">\n");
      out.write("      <h3  style = \"background-color:red;\">Details:</h3>\n");
      out.write("      <p  style = \"background-color:lemonchiffon;\">1. Flooring type: Verified Tiles<br>\n");
      out.write("2. Semi-Furnished,<br>\n");
      out.write("3. Property on 5th floor,<br> \n");
      out.write("4. Brokerage terms: 1 Month-Rent,<br> \n");
      out.write("5. Security Deposit 40000<br>\n");
      out.write("\n");
      out.write("6. Attached Bathroom which includes:-<br>\n");
      out.write("  \n");
      out.write("  a.) Western Toilet<br>\n");
      out.write("  b.) Hot and Cold Running Water<br>\n");
      out.write("</p></pre>\n");
      out.write("<form action=\"\">\n");
      out.write("    <input type=\"submit\" value=\"Book Now\" class=\"button\"/>\n");
      out.write("</form></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<div class=\"column\">\n");
      out.write("    <div class=\"content\"  style = \"background-color:whitesmoke;\">\n");
      out.write("      <img src=\"3.jpg\" alt=\"2\" style=\"width:100%\">\n");
      out.write("      <h3  style = \"background-color:red;\">Details:</h3>\n");
      out.write("      <p  style = \"background-color:lemonchiffon;\">1. Flooring type: Verified Tiles<br>\n");
      out.write("2. Semi-Furnished,<br>\n");
      out.write("3. Property on 5th floor,<br> \n");
      out.write("4. Brokerage terms: 1 Month-Rent,<br> \n");
      out.write("5. Security Deposit 40000<br>\n");
      out.write("\n");
      out.write("6. Attached Bathroom which includes:-<br>\n");
      out.write("  \n");
      out.write("  a.) Western Toilet<br>\n");
      out.write("  b.) Hot and Cold Running Water<br>\n");
      out.write("</p></pre>\n");
      out.write("<form action=\"\">\n");
      out.write("    <input type=\"submit\" value=\"Book Now\" class=\"button\"/>\n");
      out.write("</form></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
