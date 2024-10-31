/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class RegistroUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("first-name");
        String apellido = request.getParameter("last-name");
        String email = request.getParameter("email");
        String contraseña = request.getParameter("password");
        String confirmarContraseña = request.getParameter("confirm-password");
        String genero = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobbies");
        String fuenteIngresos = request.getParameter("income-source");
        String ingresosMensuales = request.getParameter("income");
        String fotoPerfil = request.getParameter("profile-picture");
        String edad = request.getParameter("age");
        String biografia = request.getParameter("bio");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Contraseña: " + contraseña);
        System.out.println("Confirmar Contraseña: " + confirmarContraseña);
        System.out.println("Género: " + genero);
        System.out.print("Hobbies: ");
        if (hobbies != null) {
            for (String hobby : hobbies) {
                System.out.print(hobby + " ");
            }
    }
    System.out.println();
    System.out.println("Fuente de Ingresos: " + fuenteIngresos);
    System.out.println("Ingresos Mensuales: " + ingresosMensuales);
    System.out.println("Foto de Perfil: " + fotoPerfil);
    System.out.println("Edad: " + edad);
    System.out.println("Biografía: " + biografia);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destino = "registrar-usuario.jsp";

        String nombre = request.getParameter("first-name");
        String apellido = request.getParameter("last-name");
        String email = request.getParameter("email");
        String contraseña = request.getParameter("password");
        String confirmarContraseña = request.getParameter("confirm-password");
        String genero = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobbies");
        String fuenteIngresos = request.getParameter("income-source");
        String ingresosMensuales = request.getParameter("income");
        String fotoPerfil = request.getParameter("profile-picture");
        String edad = request.getParameter("age");
        String biografia = request.getParameter("bio");

        request.setAttribute("nombre", nombre);
        request.setAttribute("apellido", apellido);
        request.setAttribute("email", email);
        request.setAttribute("contraseña", contraseña);
        request.setAttribute("confirmarContraseña", confirmarContraseña);
        request.setAttribute("genero", genero);
        request.setAttribute("hobbies", hobbies);
        request.setAttribute("fuenteIngresos", fuenteIngresos);
        request.setAttribute("ingresosMensuales", ingresosMensuales);
        request.setAttribute("fotoPerfil", fotoPerfil);
        request.setAttribute("edad", edad);
        request.setAttribute("biografia", biografia);

        RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
        dispatcher.forward(request, response);

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
