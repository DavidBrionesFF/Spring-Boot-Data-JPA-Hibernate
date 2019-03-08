package com.bytecode.springdata;

import com.bytecode.springdata.model.Nota;
import com.bytecode.springdata.model.Role;
import com.bytecode.springdata.model.Usuario;
import com.bytecode.springdata.repo.NotaRep;
import com.bytecode.springdata.repo.RoleRep;
import com.bytecode.springdata.repo.UsuarioRep;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Hibernate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataApplicationTests {
	@Autowired
	private RoleRep _roleRep;
	@Autowired
	private UsuarioRep _usuarioRep;
	@Autowired
	private NotaRep _notaRep;

	@Test
	public void contextLoads() {
		Usuario usuario = _usuarioRep.findById("a5812a1a8b0b4d208cc4f95e555cd9da").get();

		usuario.getNotas().forEach(nota -> {
			LogFactory.getLog(getClass()).info(nota.getNota());
		});

	}

}
