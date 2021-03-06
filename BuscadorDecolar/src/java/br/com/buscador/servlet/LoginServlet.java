package br.com.buscador.servlet;

import br.com.buscador.bean.Hotel;
import br.com.buscador.bean.Pessoa;
import br.com.buscador.dao.DaoGenerics;
import br.com.buscador.dao.DaoHotel;
import br.com.buscador.dao.DaoPessoa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Saulo
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String nome = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
            String endereco = request.getParameter("endereco");
            System.out.println(request.getParameter("numero"));
            Integer numero = Integer.valueOf(request.getParameter("numero"));
            String aceito = request.getParameter("aceito");


            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setCpf(cpf);
            pessoa.setEndereco(endereco);
            pessoa.setNumero(numero);

            if (aceito != null && aceito.equals("on")) {
                DaoPessoa daoP = new DaoPessoa();
                daoP.persistir(pessoa);
            }



            Hotel hotel = new Hotel();
            hotel.setCidade("Campo Mourão");
            hotel.setNome("Vacilo.net");
            hotel.setEndereco("Avenida Duas Vias");

            DaoHotel dao = new DaoHotel();
            dao.persistir(hotel);

            Hotel hotel2 = new Hotel();
            hotel2.setCidade("Mourão");
            hotel2.setNome("Hotel Vacilo.net");
            hotel2.setEndereco("Avenida Duas Vias");
            dao.persistir(hotel2);


            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("<h2>" + pessoa + "</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        System.out.println("Executando doGEt");

    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        System.out.println("Executando Post");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
