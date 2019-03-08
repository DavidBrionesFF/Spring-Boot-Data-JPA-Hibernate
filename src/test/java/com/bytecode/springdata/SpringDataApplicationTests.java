package com.bytecode.springdata;

import com.bytecode.springdata.model.Role;
import com.bytecode.springdata.model.Usuario;
import com.bytecode.springdata.repo.RoleRep;
import com.bytecode.springdata.repo.UsuarioRep;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataApplicationTests {
	@Autowired
	private RoleRep _roleRep;
	@Autowired
	private UsuarioRep usuarioRep;

	@Test
	public void contextLoads() {
		Role role = new Role();
		role.setNombre("Usuario");
		role.setId("2847ae4d8e1a4d5dbe46562778175b21");

		Role role1 = new Role();
		role1.setNombre("Administrador");

		Usuario usuario = new Usuario();

		usuario.setApellido("Briones Rosa");
		usuario.setNombre("Jose David");
		usuario.setContrasena("1234");

		Set<Role> roles = new HashSet<>();

		roles.add(role);
		roles.add(role1);

		usuario.setRoles(roles);

		//_roleRep.save(role);

	}

}
