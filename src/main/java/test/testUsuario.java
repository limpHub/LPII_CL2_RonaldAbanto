package test;

import dao.TblUsuarioImp;
import model.TblUsuariocl2;

public class testUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "Alex";
        String password = "Alex";
        TblUsuarioImp usuarioDAO = new TblUsuarioImp();
        TblUsuariocl2 usuario = usuarioDAO.validarUsuario(username, password);
        if (usuario != null) {
            System.out.println("Inicio de sesión exitoso para el usuario: " + usuario.getUsuarioCL2());
        } else {
            System.out.println("Credenciales inválidas. No se pudo iniciar sesión.");
        }
	}

}
