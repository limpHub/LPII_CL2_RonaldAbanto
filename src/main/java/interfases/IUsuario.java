package interfases;

import model.TblUsuariocl2;

public interface IUsuario {
	TblUsuariocl2 validarUsuario(String username, String password);
}
