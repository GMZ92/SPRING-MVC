package spring.mvc.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.crud.model.Usuario;
import spring.mvc.crud.service.UsuarioService;

@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView("usuario/usuario_page");
		
		List<Usuario> list = usuarioService.listAllUsuario();
		model.addObject("listUsuario", list);
		
		return model;
	}
	
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		
		ModelAndView model = new ModelAndView("usuario/usuario_form");
		
		Usuario usuario = new Usuario();
		model.addObject("usuarioForm", usuario);
		
		return model;
	}
	
	
	
	@RequestMapping(value = "/update{id}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id) {
		
		ModelAndView model = new ModelAndView("usuario/usuario_form");
		
		Usuario usuario = usuarioService.findUsuarioById(id);
		model.addObject("usuarioForm", usuario);
		
		return model;
	}
	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("usuarioForm") Usuario usuario) {
		
		if(usuario != null && usuario.getId() != null) {
			//update
			usuarioService.updateUsuario(usuario);
		}else {
			//add new
			usuarioService.addUsuario(usuario);
		}
		return new ModelAndView("redirect:/usuario/list");
	}
	
	
	
	@RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id) {
		
		usuarioService.deletesuario(id);
		
		return new ModelAndView("redirect:/list");
	}
	
	
	
}
