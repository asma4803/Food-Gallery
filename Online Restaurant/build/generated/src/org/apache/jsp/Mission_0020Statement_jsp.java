package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Mission_0020Statement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Mission Statment</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        * {box-sizing:border-box}\n");
      out.write("\n");
      out.write("        body{\n");
      out.write("            background-color:rgb(222,184,135);\n");
      out.write("            font-family: \"Times New Roman\", Times, serif;\n");
      out.write("            font-size:20px;\n");
      out.write("            margin-right: 30px;\n");
      out.write("            margin-left: 30px;\n");
      out.write("\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .mySlides {display:none}\n");
      out.write("\n");
      out.write("        /* Slideshow container */\n");
      out.write("        .slideshow-container {\n");
      out.write("            max-width: 900px;\n");
      out.write("            position: relative;\n");
      out.write("            margin:0px auto;\n");
      out.write("            text-align:center;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .numbertext {\n");
      out.write("            color: #f2f2f2;\n");
      out.write("            font-size: 12px;\n");
      out.write("            padding: 8px 12px;\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* The dots/bullets/indicators */\n");
      out.write("        .dot {\n");
      out.write("            height: 10px;\n");
      out.write("            width: 10px;\n");
      out.write("            margin: 0 2px;\n");
      out.write("            background-color: #F5CBA7;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            display: inline-block;\n");
      out.write("            transition: background-color 0.6s ease;\n");
      out.write("            margin-bottom:20px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .active {\n");
      out.write("            background-color:crimson;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Fading animation */\n");
      out.write("        .fade {\n");
      out.write("            transition-color:none;\n");
      out.write("            -webkit-animation-name: fade;\n");
      out.write("            -webkit-animation-duration: 1.5s;\n");
      out.write("            animation-name: fade;\n");
      out.write("            animation-duration: 1.5s;\n");
      out.write("            padding-top:50px;\n");
      out.write("            margin-left:-60px;\n");
      out.write("            margin-right:-60px;\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @-webkit-keyframes fade {\n");
      out.write("            from {opacity: .2} \n");
      out.write("            to {opacity: 1}\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes fade {\n");
      out.write("            from {opacity: .2} \n");
      out.write("            to {opacity: 1}\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* On smaller screens, decrease text size */\n");
      out.write("        @media only screen and (max-width: 300px) {\n");
      out.write("            .text {font-size: 1200px;\n");
      out.write("                   color:Red;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <marquee>\n");
      out.write("        <h2 style=\"color:saddle brown; font-size:200% ;font-family:Garamond\">Food Gallery</h2> \n");
      out.write("    </marquee>\n");
      out.write("\n");
      out.write("    \n");
      out.write("     <div class=\"slideshow-container\">\n");
      out.write("\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <img src=\"images/m1.jpg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mySlides fade\"> \n");
      out.write("                <img src=\"images/m2.jpg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <img src=\"images/m3.jpg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("         <div class=\"mySlides fade\">\n");
      out.write("                <img src=\"images/m4.jpg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("         <div class=\"mySlides fade\">\n");
      out.write("                <img src=\"images/m5.jpg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <div style=\"text-align:center\">\n");
      out.write("        <span class=\"dot\" ></span> \n");
      out.write("        <span class=\"dot\"></span> \n");
      out.write("        <span class=\"dot\"></span>\n");
      out.write("        <span class=\"dot\"></span> \n");
      out.write("        <span class=\"dot\"></span> \n");
      out.write("    </div>\n");
      out.write("    <p style=\"color: black ; text-align:center; font-size:70%\">\n");
      out.write("        <i>Within the next 12 months Food Gallery will become known to be no.1 in service, to have the best staff, and to serve the best food.\n");
      out.write("        </i></p>\n");
      out.write("    <b>\n");
      out.write("        <i>\n");
      out.write("            <h3 style=\"color:black;\"><ins>THE MISSION:</ins></h3> \n");
      out.write("        </i>\n");
      out.write("    </b>\n");
      out.write("    <p1>\n");
      out.write("        <p1 style=\"color: black ;\">\n");
      out.write("            <b style =\"font-family:Comic Sans MS\">To develop</b> To help citizens of the world live better by making healthy food convenient & affordable.\n");
      out.write("        </p1>\n");
      out.write("    </p1>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <p2>\n");
      out.write("        <p1 style=\"color: black ;\">\n");
      out.write("            <b style =\"font-family:Comic Sans MS\">To contribute</b> Our mission is to make lives healthier, easier and richer. \n");
      out.write("        </p1> </p2>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <p3>\n");
      out.write("        <p1 style=\"color: black ;\">\n");
      out.write("\n");
      out.write("            <b style =\"font-family:Comic Sans MS\">To provide a platform </b> For Enjoying your life with colorful and delicious food \n");
      out.write("        </p1>\n");
      out.write("    </p3>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <p4>\n");
      out.write("        <p1 style=\"color: black ;\">\n");
      out.write("\n");
      out.write("            <b style =\"font-family:Comic Sans MS\">To document </b> To sell delicious and remarkable food and beverage to match our world class location, to consistently provide our customers with impeccable service by demonstrating warmth, graciousness, efficiency, knowledge, professionalism and integrity to our work. \n");
      out.write("        </p1>\n");
      out.write("    </p4>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <p5>\n");
      out.write("        <p1 style=\"color: black ;\">\n");
      out.write("\n");
      out.write("            <b style =\"font-family:Comic Sans MS\">Our Vision </b> We acknowledge our customer on arrival and say thank you to every customer at least once for choosing Food Gallery. </p1>\n");
      out.write("\n");
      out.write("    </p5>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br><br>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var slideIndex = 0;\n");
      out.write("        showSlides();\n");
      out.write("\n");
      out.write("        function showSlides() {\n");
      out.write("            var i;\n");
      out.write("            var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("            var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("            for (i = 0; i < slides.length; i++) {\n");
      out.write("                slides[i].style.display = \"none\";\n");
      out.write("            }\n");
      out.write("            slideIndex++;\n");
      out.write("            if (slideIndex > slides.length) {\n");
      out.write("                slideIndex = 1\n");
      out.write("            }\n");
      out.write("            for (i = 0; i < dots.length; i++) {\n");
      out.write("                dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("            }\n");
      out.write("            slides[slideIndex - 1].style.display = \"block\";\n");
      out.write("            dots[slideIndex - 1].className += \" active\";\n");
      out.write("            setTimeout(showSlides, 2000); // Change image every 2 seconds\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        sName = dots[i].className.replace(\" active\", \"\");\n");
      out.write("        slides[slideIndex - 1].style.display = \"block\";\n");
      out.write("        dots[slideIndex - 1].className += \" active\";\n");
      out.write("        setTimeout(showSlides, 2000); // Change image every 2 seconds\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
