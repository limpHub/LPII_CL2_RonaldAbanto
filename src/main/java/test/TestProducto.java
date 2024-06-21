package test;

import java.util.List;

import dao.TblProductoImp;
import model.TblProductocl2;;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblProductocl2 producto= new TblProductocl2();
		TblProductoImp crud=new TblProductoImp();
		/*producto.setNombreCl2("Monitor");
		producto.setEstadoCL2("nuevo");
		producto.setDescripCL2("Gama Alta");
		producto.setPrecioCompraCL2(2500.99);
		producto.setPrecioVentaCL2(3000.99);
		crud.RegistrarProducto(producto);*/
		
		
		List<TblProductocl2> listado=crud.ListarProducto(producto);
		//aplicamos un bucle
		for(TblProductocl2 lis:listado){
			
			//imprimimos por pantalla
			System.out.println("codigo "+lis.getIdproductoCL2()+
					" nombre "+lis.getNombreCl2()+" estado "+lis.getEstadoCL2()+"Descripcion"+lis.getDescripCL2()+
					"Pcompra"+lis.getPrecioCompraCL2()+"Pventa"+lis.getPrecioVentaCL2());
			
		}
	}

}
