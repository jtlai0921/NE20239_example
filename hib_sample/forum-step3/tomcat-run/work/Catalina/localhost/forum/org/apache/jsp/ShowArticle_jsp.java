package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShowArticle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/webwork.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ww_i18n_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ww_text_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ww_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ww_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ww_else;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_ww_i18n_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ww_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ww_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ww_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ww_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_ww_i18n_name.release();
    _jspx_tagPool_ww_text_name_nobody.release();
    _jspx_tagPool_ww_property_value_nobody.release();
    _jspx_tagPool_ww_if_test.release();
    _jspx_tagPool_ww_else.release();
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_ww_i18n_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_ww_i18n_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:i18n
    com.opensymphony.webwork.views.jsp.I18nTag _jspx_th_ww_i18n_0 = (com.opensymphony.webwork.views.jsp.I18nTag) _jspx_tagPool_ww_i18n_name.get(com.opensymphony.webwork.views.jsp.I18nTag.class);
    _jspx_th_ww_i18n_0.setPageContext(_jspx_page_context);
    _jspx_th_ww_i18n_0.setParent(null);
    _jspx_th_ww_i18n_0.setName("'messages'");
    int _jspx_eval_ww_i18n_0 = _jspx_th_ww_i18n_0.doStartTag();
    if (_jspx_eval_ww_i18n_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("<html>\r\n");
        out.write("\t<head>\r\n");
        out.write("\t<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">\r\n");
        out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("\t</head>\r\n");
        out.write("<body>\r\n");
        out.write("\r\n");
        out.write("<table border=\"0\" width=\"100%\" cellspacing=\"3\" cellpadding=\"0\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<tr>\r\n");
        if (_jspx_meth_ww_text_0(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        out.write('<');
        out.write('b');
        out.write('>');
        if (_jspx_meth_ww_property_0(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        out.write("</b><br/>\r\n");
        out.write("</tr>\r\n");
        out.write("<tr valign=\"top\">\r\n");
        out.write("<td width=100>\r\n");
        out.write("    ");
        if (_jspx_meth_ww_text_1(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        if (_jspx_meth_ww_property_1(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_ww_text_2(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        if (_jspx_meth_ww_property_2(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    <div>\r\n");
        out.write("</td>\r\n");
        out.write("<td width=\"10\">\r\n");
        out.write("</td>\r\n");
        out.write("<td width=\"1\" bgcolor=\"#69696d\">\r\n");
        out.write("</td>\r\n");
        out.write("<td width=\"10\">\r\n");
        out.write("</td>\r\n");
        out.write("<td width=\"\" class=\"doc\">\r\n");
        out.write("    ");
        if (_jspx_meth_ww_text_3(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        if (_jspx_meth_ww_property_3(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </div>\r\n");
        out.write("</td>\r\n");
        out.write("</tr>\r\n");
        out.write("</table>\r\n");
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_ww_if_0(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_ww_else_0(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("</body>\r\n");
        out.write("</html>\r\n");
        int evalDoAfterBody = _jspx_th_ww_i18n_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ww_i18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_i18n_name.reuse(_jspx_th_ww_i18n_0);
    return false;
  }

  private boolean _jspx_meth_ww_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.opensymphony.webwork.views.jsp.ui.TextTag _jspx_th_ww_text_0 = (com.opensymphony.webwork.views.jsp.ui.TextTag) _jspx_tagPool_ww_text_name_nobody.get(com.opensymphony.webwork.views.jsp.ui.TextTag.class);
    _jspx_th_ww_text_0.setPageContext(_jspx_page_context);
    _jspx_th_ww_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    _jspx_th_ww_text_0.setName("'article.title'");
    int _jspx_eval_ww_text_0 = _jspx_th_ww_text_0.doStartTag();
    if (_jspx_th_ww_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_text_name_nobody.reuse(_jspx_th_ww_text_0);
    return false;
  }

  private boolean _jspx_meth_ww_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_property_0 = (com.opensymphony.webwork.views.jsp.PropertyTag) _jspx_tagPool_ww_property_value_nobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_property_0.setPageContext(_jspx_page_context);
    _jspx_th_ww_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    _jspx_th_ww_property_0.setValue("article.title");
    int _jspx_eval_ww_property_0 = _jspx_th_ww_property_0.doStartTag();
    if (_jspx_th_ww_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_property_value_nobody.reuse(_jspx_th_ww_property_0);
    return false;
  }

  private boolean _jspx_meth_ww_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.opensymphony.webwork.views.jsp.ui.TextTag _jspx_th_ww_text_1 = (com.opensymphony.webwork.views.jsp.ui.TextTag) _jspx_tagPool_ww_text_name_nobody.get(com.opensymphony.webwork.views.jsp.ui.TextTag.class);
    _jspx_th_ww_text_1.setPageContext(_jspx_page_context);
    _jspx_th_ww_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    _jspx_th_ww_text_1.setName("'article.createBy'");
    int _jspx_eval_ww_text_1 = _jspx_th_ww_text_1.doStartTag();
    if (_jspx_th_ww_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_text_name_nobody.reuse(_jspx_th_ww_text_1);
    return false;
  }

  private boolean _jspx_meth_ww_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_property_1 = (com.opensymphony.webwork.views.jsp.PropertyTag) _jspx_tagPool_ww_property_value_nobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_property_1.setPageContext(_jspx_page_context);
    _jspx_th_ww_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    _jspx_th_ww_property_1.setValue("article.createBy.name");
    int _jspx_eval_ww_property_1 = _jspx_th_ww_property_1.doStartTag();
    if (_jspx_th_ww_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_property_value_nobody.reuse(_jspx_th_ww_property_1);
    return false;
  }

  private boolean _jspx_meth_ww_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.opensymphony.webwork.views.jsp.ui.TextTag _jspx_th_ww_text_2 = (com.opensymphony.webwork.views.jsp.ui.TextTag) _jspx_tagPool_ww_text_name_nobody.get(com.opensymphony.webwork.views.jsp.ui.TextTag.class);
    _jspx_th_ww_text_2.setPageContext(_jspx_page_context);
    _jspx_th_ww_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    _jspx_th_ww_text_2.setName("'article.createTime'");
    int _jspx_eval_ww_text_2 = _jspx_th_ww_text_2.doStartTag();
    if (_jspx_th_ww_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_text_name_nobody.reuse(_jspx_th_ww_text_2);
    return false;
  }

  private boolean _jspx_meth_ww_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_property_2 = (com.opensymphony.webwork.views.jsp.PropertyTag) _jspx_tagPool_ww_property_value_nobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_property_2.setPageContext(_jspx_page_context);
    _jspx_th_ww_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    _jspx_th_ww_property_2.setValue("article.createTime");
    int _jspx_eval_ww_property_2 = _jspx_th_ww_property_2.doStartTag();
    if (_jspx_th_ww_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_property_value_nobody.reuse(_jspx_th_ww_property_2);
    return false;
  }

  private boolean _jspx_meth_ww_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.opensymphony.webwork.views.jsp.ui.TextTag _jspx_th_ww_text_3 = (com.opensymphony.webwork.views.jsp.ui.TextTag) _jspx_tagPool_ww_text_name_nobody.get(com.opensymphony.webwork.views.jsp.ui.TextTag.class);
    _jspx_th_ww_text_3.setPageContext(_jspx_page_context);
    _jspx_th_ww_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    _jspx_th_ww_text_3.setName("'article.body'");
    int _jspx_eval_ww_text_3 = _jspx_th_ww_text_3.doStartTag();
    if (_jspx_th_ww_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_text_name_nobody.reuse(_jspx_th_ww_text_3);
    return false;
  }

  private boolean _jspx_meth_ww_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_property_3 = (com.opensymphony.webwork.views.jsp.PropertyTag) _jspx_tagPool_ww_property_value_nobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_property_3.setPageContext(_jspx_page_context);
    _jspx_th_ww_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    _jspx_th_ww_property_3.setValue("article.body");
    int _jspx_eval_ww_property_3 = _jspx_th_ww_property_3.doStartTag();
    if (_jspx_th_ww_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_property_value_nobody.reuse(_jspx_th_ww_property_3);
    return false;
  }

  private boolean _jspx_meth_ww_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    com.opensymphony.webwork.views.jsp.IfTag _jspx_th_ww_if_0 = (com.opensymphony.webwork.views.jsp.IfTag) _jspx_tagPool_ww_if_test.get(com.opensymphony.webwork.views.jsp.IfTag.class);
    _jspx_th_ww_if_0.setPageContext(_jspx_page_context);
    _jspx_th_ww_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    _jspx_th_ww_if_0.setTest("#session['loginUser']==null");
    int _jspx_eval_ww_if_0 = _jspx_th_ww_if_0.doStartTag();
    if (_jspx_eval_ww_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_ww_text_4(_jspx_th_ww_if_0, _jspx_page_context))
          return true;
        out.write(".\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_ww_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ww_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_if_test.reuse(_jspx_th_ww_if_0);
    return false;
  }

  private boolean _jspx_meth_ww_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.opensymphony.webwork.views.jsp.ui.TextTag _jspx_th_ww_text_4 = (com.opensymphony.webwork.views.jsp.ui.TextTag) _jspx_tagPool_ww_text_name_nobody.get(com.opensymphony.webwork.views.jsp.ui.TextTag.class);
    _jspx_th_ww_text_4.setPageContext(_jspx_page_context);
    _jspx_th_ww_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_if_0);
    _jspx_th_ww_text_4.setName("'notLoggedIn'");
    int _jspx_eval_ww_text_4 = _jspx_th_ww_text_4.doStartTag();
    if (_jspx_th_ww_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_text_name_nobody.reuse(_jspx_th_ww_text_4);
    return false;
  }

  private boolean _jspx_meth_ww_else_0(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:else
    com.opensymphony.webwork.views.jsp.ElseTag _jspx_th_ww_else_0 = (com.opensymphony.webwork.views.jsp.ElseTag) _jspx_tagPool_ww_else.get(com.opensymphony.webwork.views.jsp.ElseTag.class);
    _jspx_th_ww_else_0.setPageContext(_jspx_page_context);
    _jspx_th_ww_else_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    int _jspx_eval_ww_else_0 = _jspx_th_ww_else_0.doStartTag();
    if (_jspx_eval_ww_else_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <form action=\"replyArticle.action\" method=\"post\">\r\n");
        out.write("        ");
        if (_jspx_meth_ww_text_5(_jspx_th_ww_else_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            <input name=\"article.title\"/>\r\n");
        out.write("        ");
        if (_jspx_meth_ww_text_6(_jspx_th_ww_else_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            <textarea name=\"article.body\" rows=\"10\" cols=\"80\"  ></textarea>\r\n");
        out.write("        <br/>\r\n");
        out.write("        <input type=\"hidden\" name=\"parentId\" value=\"");
        if (_jspx_meth_ww_property_4(_jspx_th_ww_else_0, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("        <input type=\"submit\" value=\"");
        if (_jspx_meth_ww_text_7(_jspx_th_ww_else_0, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("    </form>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_ww_else_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ww_else_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_else.reuse(_jspx_th_ww_else_0);
    return false;
  }

  private boolean _jspx_meth_ww_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_else_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.opensymphony.webwork.views.jsp.ui.TextTag _jspx_th_ww_text_5 = (com.opensymphony.webwork.views.jsp.ui.TextTag) _jspx_tagPool_ww_text_name_nobody.get(com.opensymphony.webwork.views.jsp.ui.TextTag.class);
    _jspx_th_ww_text_5.setPageContext(_jspx_page_context);
    _jspx_th_ww_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_else_0);
    _jspx_th_ww_text_5.setName("'article.reply'");
    int _jspx_eval_ww_text_5 = _jspx_th_ww_text_5.doStartTag();
    if (_jspx_th_ww_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_text_name_nobody.reuse(_jspx_th_ww_text_5);
    return false;
  }

  private boolean _jspx_meth_ww_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_else_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.opensymphony.webwork.views.jsp.ui.TextTag _jspx_th_ww_text_6 = (com.opensymphony.webwork.views.jsp.ui.TextTag) _jspx_tagPool_ww_text_name_nobody.get(com.opensymphony.webwork.views.jsp.ui.TextTag.class);
    _jspx_th_ww_text_6.setPageContext(_jspx_page_context);
    _jspx_th_ww_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_else_0);
    _jspx_th_ww_text_6.setName("'article.body'");
    int _jspx_eval_ww_text_6 = _jspx_th_ww_text_6.doStartTag();
    if (_jspx_th_ww_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_text_name_nobody.reuse(_jspx_th_ww_text_6);
    return false;
  }

  private boolean _jspx_meth_ww_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_else_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_property_4 = (com.opensymphony.webwork.views.jsp.PropertyTag) _jspx_tagPool_ww_property_value_nobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_property_4.setPageContext(_jspx_page_context);
    _jspx_th_ww_property_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_else_0);
    _jspx_th_ww_property_4.setValue("article.id");
    int _jspx_eval_ww_property_4 = _jspx_th_ww_property_4.doStartTag();
    if (_jspx_th_ww_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_property_value_nobody.reuse(_jspx_th_ww_property_4);
    return false;
  }

  private boolean _jspx_meth_ww_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_else_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.opensymphony.webwork.views.jsp.ui.TextTag _jspx_th_ww_text_7 = (com.opensymphony.webwork.views.jsp.ui.TextTag) _jspx_tagPool_ww_text_name_nobody.get(com.opensymphony.webwork.views.jsp.ui.TextTag.class);
    _jspx_th_ww_text_7.setPageContext(_jspx_page_context);
    _jspx_th_ww_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_else_0);
    _jspx_th_ww_text_7.setName("'article.reply'");
    int _jspx_eval_ww_text_7 = _jspx_th_ww_text_7.doStartTag();
    if (_jspx_th_ww_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_text_name_nobody.reuse(_jspx_th_ww_text_7);
    return false;
  }
}
