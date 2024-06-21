package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TblProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:Controlador Produ ").append(request.getContextPath());
		TblProductocl2 producto= new TblProductocl2();
		TblProductoImp crud=new TblProductoImp();
		List<TblProductocl2> ListarProducto=crud.ListarProducto(producto);
		request.setAttribute("ListarProducto",ListarProducto);	
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		 String descripCL2=request.getParameter("Descripcion");
		 String estadoCL2=request.getParameter("Estado");
		 String nombreCl2=request.getParameter("Nombre");
		 double precioCompraCL2 = Double.parseDouble(request.getParameter("Preciodecompra"));
		 double precioVentaCL2 = Double.parseDouble(request.getParameter("Preciodeventa"));
		 TblProductocl2 producto=new TblProductocl2();
		 TblProductoImp crud=new TblProductoImp();
		 producto.setNombreCl2(nombreCl2);
			producto.setEstadoCL2(estadoCL2);
			producto.setDescripCL2(descripCL2);
			producto.setPrecioCompraCL2(precioCompraCL2);
			producto.setPrecioVentaCL2(precioVentaCL2);
			crud.RegistrarProducto(producto);
			List<TblProductocl2> ListarProducto=crud.ListarProducto(producto);
			request.setAttribute("ListarProducto",ListarProducto);
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request,response);
	}

}
