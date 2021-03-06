package org.apache.jsp.admin.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.QuestionarioDAO;
import modelo.Questionario;
import modelo.ProfAval;
import java.util.List;
import dao.ProfessorDAO;
import modelo.Professor;

public final class professorQuestionario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/site/cabecalho.jsp");
    _jspx_dependants.add("/admin/site/rodape.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>SB Admin 2 - Bootstrap Admin Theme</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link href=\"../bower_components/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- MetisMenu CSS -->\r\n");
      out.write("        <link href=\"../bower_components/metisMenu/dist/metisMenu.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom CSS -->\r\n");
      out.write("        <link href=\"../dist/css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Fonts -->\r\n");
      out.write("        <link href=\"../bower_components/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Navigation -->\r\n");
      out.write("            <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- /.dropdown-alerts -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- /.dropdown -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- /.navbar-top-links -->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("                        <div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("                            <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                                <li class=\"sidebar-search\">\r\n");
      out.write("                                    <div class=\"input-group custom-search-form\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("                                        <span class=\"input-group-btn\">\r\n");
      out.write("                                            <button class=\"btn btn-default\" type=\"button\">\r\n");
      out.write("                                                <i class=\"fa fa-search\"></i>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- /input-group -->\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"index.jsp\"><i class=\"fa fa-dashboard fa-fw\"></i> Menu de inicio</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-sitemap fa-fw\"></i>Clique aqui<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                                    <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"professorIndex.jsp\">Professores</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"monitorIndex.jsp\">Monitores</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">Clique aqui <span class=\"fa arrow\"></span></a>\r\n");
      out.write("                                            <ul class=\"nav nav-third-level\">\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"professorQuestionario.jsp\">Questionario professor</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"monitorQuestionario.jsp\">Questionario monitor</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"index.jsp\">Index</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                            <!-- /.nav-third-level -->\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                    <!-- /.nav-second-level -->\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.sidebar-collapse -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.navbar-static-side -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');

    
    Professor profe = new Professor();

    ProfessorDAO profDAO = new ProfessorDAO();

    List<Professor> pList = profDAO.listar();

    ProfAval pAv = new ProfAval();
    Questionario q;

    QuestionarioDAO qdao = new QuestionarioDAO();

    List<Questionario> qList = qdao.listar();

    q = qList.get(1);



      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Avaliação professores</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"pergunta\">\r\n");
      out.write("            <div class=\"opcoes\">\r\n");
      out.write("                <form action=\"professorQuestionario-ok.jsp\" method=\"post\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>Selecione os professores</label>\r\n");
      out.write("                        <select class=\"form-control\" id=\"idProfessor\" name=\"idProfessor\" value=\"");
      out.print(profe.getIdProfessor());
      out.write("\">\r\n");
      out.write("                            <option value=\"\">Selecione..</option>\r\n");
      out.write("                            ");

                                for (Professor p : pList) {
                            
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(p.getIdProfessor());
      out.write('"');
      out.write('>');
      out.print(p);
      out.write("</option>\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                  \r\n");
      out.write("                        \r\n");
      out.write("                    <div class=\"mdl-cell--12-col\"> \r\n");
      out.write("                        <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("                            <input class=\"mdl-textfield__input\" type=\"text\" required  name=\"maPeriodo\" id=\"maPeriodo\" value=\"");
      out.print(pAv.getPaPeriodo());
      out.write("\" />\r\n");
      out.write("                            <label class=\"mdl-textfield__label\" for=\"txtPeriodoPA\">Período de Avaliação</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                            \r\n");
      out.write("                    <h4 class=\"enunciado\">");
      out.print(q.getPergunta1());
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta\" id=\"optionsRadiosInline1\" value=\"1\" checked>Ruim\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta\" id=\"optionsRadiosInline2\" value=\"2\">Mais ou menos\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta\" id=\"optionsRadiosInline3\" value=\"3\">Bom\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta\" id=\"optionsRadiosInline4\" value=\"4\">otimo\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta\" id=\"optionsRadiosInline5\" value=\"5\">Excelente\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <h4 class=\"enunciado\">");
      out.print(q.getPergunta2());
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta2\" id=\"optionsRadiosInline1\" value=\"1\" checked>Ruim\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta2\" id=\"optionsRadiosInline2\" value=\"2\">Mais ou menos\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta2\" id=\"optionsRadiosInline3\" value=\"3\">Bom\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta2\" id=\"optionsRadiosInline4\" value=\"4\">ótimo\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta2\" id=\"optionsRadiosInline5\" value=\"5\">Excelente\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <h4 class=\"enunciado\">");
      out.print(q.getPergunta3());
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta3\" id=\"optionsRadiosInline1\" value=\"1\" checked>Ruim\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta3\" id=\"optionsRadiosInline2\" value=\"2\">Mais ou menos\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta3\" id=\"optionsRadiosInline3\" value=\"3\">Bom\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta3\" id=\"optionsRadiosInline4\" value=\"4\">ótimo\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta3\" id=\"optionsRadiosInline5\" value=\"5\">Excelente\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <h4 class=\"enunciado\">");
      out.print(q.getPergunta4());
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta4\" id=\"optionsRadiosInline1\" value=\"1\" checked>Ruim\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta4\" id=\"optionsRadiosInline2\" value=\"2\">Mais ou menos\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta4\" id=\"optionsRadiosInline3\" value=\"3\">Bom\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta4\" id=\"optionsRadiosInline4\" value=\"4\">ótimo\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta4\" id=\"optionsRadiosInline5\" value=\"5\">Excelente\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <h4 class=\"enunciado\">");
      out.print(q.getPergunta5());
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta5\" id=\"optionsRadiosInline1\" value=\"1\" checked>Ruim\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\" radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta5\" id=\"optionsRadiosInline2\" value=\"2\">Mais ou menos\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta5\" id=\"optionsRadiosInline3\" value=\"3\">Bom\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta5\" id=\"optionsRadiosInline4\" value=\"4\">ótimo\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta5\" id=\"optionsRadiosInline5\" value=\"5\">Excelente\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <h4 class=\"enunciado\">");
      out.print(q.getPergunta6());
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta6\" id=\"optionsRadiosInline1\" value=\"1\" checked>Ruim\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta6\" id=\"optionsRadiosInline2\" value=\"2\">Mais ou menos\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta6\" id=\"optionsRadiosInline3\" value=\"3\">Bom\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta6\" id=\"optionsRadiosInline4\" value=\"4\">ótimo\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta6\" id=\"optionsRadiosInline5\" value=\"5\">Excelente\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <h4 class=\"enunciado\">");
      out.print(q.getPergunta7());
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta7\" id=\"optionsRadiosInline1\" value=\"1\" checked>Ruim\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta7\" id=\"optionsRadiosInline2\" value=\"2\">Mais ou menos\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta7\" id=\"optionsRadiosInline3\" value=\"3\">Bom\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta7\" id=\"optionsRadiosInline4\" value=\"4\">ótimo\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta7\" id=\"optionsRadiosInline5\" value=\"5\">Excelente\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <h4 class=\"enunciado\">");
      out.print(q.getPergunta8());
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta8\" id=\"optionsRadiosInline1\" value=\"1\" checked>Ruim\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta8\" id=\"optionsRadiosInline2\" value=\"2\">Mais ou menos\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta8\" id=\"optionsRadiosInline3\" value=\"3\">Bom\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta8\" id=\"optionsRadiosInline4\" value=\"4\">ótimo\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta8\" id=\"optionsRadiosInline5\" value=\"5\">Excelente\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <h4 class=\"enunciado\">");
      out.print(q.getPergunta9());
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta9\" id=\"optionsRadiosInline1\" value=\"1\" checked>Ruim\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta9\" id=\"optionsRadiosInline2\" value=\"2\">Mais ou menos\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta9\" id=\"optionsRadiosInline3\" value=\"3\">Bom\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta9\" id=\"optionsRadiosInline4\" value=\"4\">ótimo\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta9\" id=\"optionsRadiosInline5\" value=\"5\">Excelente\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <h4 class=\"enunciado\">");
      out.print(q.getPergunta10());
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta10\" id=\"optionsRadiosInline1\" value=\"1\" checked>Ruim\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta10\" id=\"optionsRadiosInline2\" value=\"2\">Mais ou menos\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta10\" id=\"optionsRadiosInline3\" value=\"3\">Bom\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta10\" id=\"optionsRadiosInline4\" value=\"4\">ótimo\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label class=\"radio-inline\">\r\n");
      out.write("                            <input type=\"radio\" name=\"rdoPergunta10\" id=\"optionsRadiosInline5\" value=\"5\">Excelente\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <input type=\"submit\" value=\"confirmar\" name=\"btnConfirmar\"  /> \r\n");
      out.write("              \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"painelUsuario\">\r\n");
      out.write("        </div>\r\n");
      out.write("                    \r\n");
      out.write("        <br />\r\n");
      out.write("                        \r\n");
      out.write("        </div>\r\n");
      out.write("     \r\n");
      out.write("  \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"../bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"../bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("    <script src=\"../bower_components/metisMenu/dist/metisMenu.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Theme JavaScript -->\r\n");
      out.write("    <script src=\"../dist/js/sb-admin-2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
