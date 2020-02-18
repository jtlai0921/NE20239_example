package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BoardTree_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/webwork.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ww_i18n_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ww_text_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ww_iterator_value_status;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ww_property_value_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_ww_i18n_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ww_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ww_iterator_value_status = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ww_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_ww_i18n_name.release();
    _jspx_tagPool_ww_text_name_nobody.release();
    _jspx_tagPool_ww_iterator_value_status.release();
    _jspx_tagPool_ww_property_value_nobody.release();
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
        out.write("<html>\r\n");
        out.write("\t<head>\r\n");
        out.write("\t<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">\r\n");
        out.write("\t</head>\t\r\n");
        out.write("<body>\r\n");
        out.write("<h3>");
        if (_jspx_meth_ww_text_0(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        out.write("</h3>\r\n");
        out.write("<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
        out.write("    <tr>\r\n");
        out.write("        <th></th>\r\n");
        out.write("    </tr>\r\n");
        out.write("    <tr>\r\n");
        out.write("        <td>\r\n");
        out.write("\r\n");
        out.write("\t<table cellspacing=\"10\" class=\"listview\">\r\n");
        out.write("\t\t");
        if (_jspx_meth_ww_iterator_0(_jspx_th_ww_i18n_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t</table>\r\n");
        out.write("\r\n");
        out.write("  </td>\r\n");
        out.write("    </tr>\r\n");
        out.write("</table>\r\n");
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
    _jspx_th_ww_text_0.setName("'board.tree'");
    int _jspx_eval_ww_text_0 = _jspx_th_ww_text_0.doStartTag();
    if (_jspx_th_ww_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_text_name_nobody.reuse(_jspx_th_ww_text_0);
    return false;
  }

  private boolean _jspx_meth_ww_iterator_0(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_i18n_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:iterator
    com.opensymphony.webwork.views.jsp.IteratorTag _jspx_th_ww_iterator_0 = (com.opensymphony.webwork.views.jsp.IteratorTag) _jspx_tagPool_ww_iterator_value_status.get(com.opensymphony.webwork.views.jsp.IteratorTag.class);
    _jspx_th_ww_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_ww_iterator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_i18n_0);
    _jspx_th_ww_iterator_0.setValue("boards");
    _jspx_th_ww_iterator_0.setStatus("status");
    int _jspx_eval_ww_iterator_0 = _jspx_th_ww_iterator_0.doStartTag();
    if (_jspx_eval_ww_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ww_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ww_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ww_iterator_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t<a target=\"ArticleTree\" href=\"listArticle.action?boardId=");
        if (_jspx_meth_ww_property_0(_jspx_th_ww_iterator_0, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("\t\t\t\t\t<b>");
        if (_jspx_meth_ww_property_1(_jspx_th_ww_iterator_0, _jspx_page_context))
          return true;
        out.write("</b>\r\n");
        out.write("\t\t\t\t</a>\r\n");
        out.write("                    ");
        if (_jspx_meth_ww_iterator_1(_jspx_th_ww_iterator_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_ww_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ww_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_ww_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_iterator_value_status.reuse(_jspx_th_ww_iterator_0);
    return false;
  }

  private boolean _jspx_meth_ww_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_property_0 = (com.opensymphony.webwork.views.jsp.PropertyTag) _jspx_tagPool_ww_property_value_nobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_property_0.setPageContext(_jspx_page_context);
    _jspx_th_ww_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_iterator_0);
    _jspx_th_ww_property_0.setValue("id");
    int _jspx_eval_ww_property_0 = _jspx_th_ww_property_0.doStartTag();
    if (_jspx_th_ww_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_property_value_nobody.reuse(_jspx_th_ww_property_0);
    return false;
  }

  private boolean _jspx_meth_ww_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_property_1 = (com.opensymphony.webwork.views.jsp.PropertyTag) _jspx_tagPool_ww_property_value_nobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_property_1.setPageContext(_jspx_page_context);
    _jspx_th_ww_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_iterator_0);
    _jspx_th_ww_property_1.setValue("name");
    int _jspx_eval_ww_property_1 = _jspx_th_ww_property_1.doStartTag();
    if (_jspx_th_ww_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_property_value_nobody.reuse(_jspx_th_ww_property_1);
    return false;
  }

  private boolean _jspx_meth_ww_iterator_1(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:iterator
    com.opensymphony.webwork.views.jsp.IteratorTag _jspx_th_ww_iterator_1 = (com.opensymphony.webwork.views.jsp.IteratorTag) _jspx_tagPool_ww_iterator_value_status.get(com.opensymphony.webwork.views.jsp.IteratorTag.class);
    _jspx_th_ww_iterator_1.setPageContext(_jspx_page_context);
    _jspx_th_ww_iterator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_iterator_0);
    _jspx_th_ww_iterator_1.setValue("childBoards");
    _jspx_th_ww_iterator_1.setStatus("status");
    int _jspx_eval_ww_iterator_1 = _jspx_th_ww_iterator_1.doStartTag();
    if (_jspx_eval_ww_iterator_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ww_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ww_iterator_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ww_iterator_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                    <li>        <a target=\"ArticleTree\" href=\"listArticle.action?boardId=");
        if (_jspx_meth_ww_property_2(_jspx_th_ww_iterator_1, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("                                <b>");
        if (_jspx_meth_ww_property_3(_jspx_th_ww_iterator_1, _jspx_page_context))
          return true;
        out.write("</b>\r\n");
        out.write("                            </a></li>\r\n");
        out.write("            \t\t");
        int evalDoAfterBody = _jspx_th_ww_iterator_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ww_iterator_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_ww_iterator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_iterator_value_status.reuse(_jspx_th_ww_iterator_1);
    return false;
  }

  private boolean _jspx_meth_ww_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_property_2 = (com.opensymphony.webwork.views.jsp.PropertyTag) _jspx_tagPool_ww_property_value_nobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_property_2.setPageContext(_jspx_page_context);
    _jspx_th_ww_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_iterator_1);
    _jspx_th_ww_property_2.setValue("id");
    int _jspx_eval_ww_property_2 = _jspx_th_ww_property_2.doStartTag();
    if (_jspx_th_ww_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_property_value_nobody.reuse(_jspx_th_ww_property_2);
    return false;
  }

  private boolean _jspx_meth_ww_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_iterator_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_property_3 = (com.opensymphony.webwork.views.jsp.PropertyTag) _jspx_tagPool_ww_property_value_nobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_property_3.setPageContext(_jspx_page_context);
    _jspx_th_ww_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_iterator_1);
    _jspx_th_ww_property_3.setValue("name");
    int _jspx_eval_ww_property_3 = _jspx_th_ww_property_3.doStartTag();
    if (_jspx_th_ww_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_ww_property_value_nobody.reuse(_jspx_th_ww_property_3);
    return false;
  }
}
