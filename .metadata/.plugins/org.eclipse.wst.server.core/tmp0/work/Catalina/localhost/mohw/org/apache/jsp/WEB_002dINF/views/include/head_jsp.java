/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2023-01-04 06:05:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/kyj/pro07_mvc/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/kyj/pro07_mvc/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1668994666915L));
    _jspx_dependants.put("jar:file:/D:/kyj/pro07_mvc/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!-- <script src=\"include/jquery.js\"></script>\n");
      out.write("<script src=\"include/foundation.js\"></script>\n");
      out.write("<link href=\"inculde/foundation.css\" rel=\"stylesheet\" /> -->\n");
      out.write("<!-- <script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/foundation.min.js\"></script>\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation-float.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation-prototype.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation-rtl.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation.min.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.accordion.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.accordionMenu.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.dropdown.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.dropdownMenu.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://www.youtube.com/iframe_api\"></script> -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-latest.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/normalize.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.3/motion-ui.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation-prototype.min.css\">\n");
      out.write("<link href='https://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css' rel='stylesheet' type='text/css'>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-2.1.4.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/js/foundation.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.3/motion-ui.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("  $(document).ready(function(){\n");
      out.write("	  $(document).foundation();\n");
      out.write("  });\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("* { margin: 0; padding: 0; }\n");
      out.write("body, html { width: 1280px; margin: auto; } \n");
      out.write("ul { list-style:none; }\n");
      out.write("\n");
      out.write("#gnb > ul > li[role=\"menuitem\"] { height:38px; }\n");
      out.write("#gnb > ul > li.menu-text[role=\"menuitem\"] { padding-top:0px; padding-bottom:0px; }\n");
      out.write(".top-bar, .top-bar ul {background-color: #fff;}\n");
      out.write(".has-submenu {margin-top: 10px; padding-left: 5px;}\n");
      out.write(".callout.secondary {background-color:#FCF2FA;}\n");
      out.write("\n");
      out.write(".h1 { padding-top:0.9rem; padding-bottom:0.3rem; }\n");
      out.write(".container { clear:both; width:1200px; margin:0 auto; }\n");
      out.write(".container::after { content:\"\"; display:block; width:100%; clear:both; }\n");
      out.write("\n");
      out.write("#table1 th { border-bottom:1px solid #fff; }\n");
      out.write("\n");
      out.write(".footer-nav {	background-color:#2d2d2d; height:80px; box-sizing:border-box; overflow:hidden; }\n");
      out.write(".footer-nav > article { clear:both; width:1200px; margin:0px auto; height:80px; }\n");
      out.write(".footer-nav > article > div { float:left; }\n");
      out.write(".footer-nav-left { color:#fff; width:25%; line-height:80px; }\n");
      out.write(".footer-nav-center {\n");
      out.write("	width:50%;\n");
      out.write("}\n");
      out.write(".footer-nav-right {\n");
      out.write("	width:25%; \n");
      out.write("}\n");
      out.write("#footer .footer-nav-left .footer-copyright {\n");
      out.write("	line-height:80px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer > article > div > ul > li.footer-nav-item { \n");
      out.write("	float:left; width:auto; padding:1.8rem;  \n");
      out.write("	min-width:40px;\n");
      out.write("}\n");
      out.write("#footer > article > div.footer-nav-right > ul > li.footer-nav-item {\n");
      out.write("	width:25%; height:25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/include/head.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path0");
      // /WEB-INF/views/include/head.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/include/head.jsp(6,0) '${pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
