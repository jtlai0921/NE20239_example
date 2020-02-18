package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<frameset framespacing=\"0\" border=\"true\" rows=\"84,*\" frameborder=\"0\">\r\n");
      out.write("  <frame name=\"banner\" scrolling=\"no\"  src=\"banner.jsp\" border='1'>\r\n");
      out.write("  <frameset name=\"content\" cols=\"153,*\" border='1'>\r\n");
      out.write("    <frame name=\"boardTree\"  src=\"listBoard.action\" scrolling=\"no\" >\r\n");
      out.write("      <frameset name=\"content\" rows=\"200,*\" border='1'>\r\n");
      out.write("        <frame name=\"ArticleTree\" src=\"welcome.jsp\" scrolling=\"yes\" border='1'>\r\n");
      out.write("        <frame name=\"ArticleDetail\" src=\"empty.jsp\" scrolling=\"yes\" border='1'>\r\n");
      out.write("      </frameset>\r\n");
      out.write("  </frameset>\r\n");
      out.write("  <noframes>\r\n");
      out.write("  <body>\r\n");
      out.write("  <p>This page uses frames, but your browser doesn't support them.</p>\r\n");
      out.write("  </body>\r\n");
      out.write("  </noframes>\r\n");
      out.write("</frameset>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
