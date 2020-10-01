package br.insper.edu.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import br.insper.edu.mvc.model.Tarefa;
import br.insper.edu.mvc.model.TarefasDAO;

@Controller
public class TarefasController {
	@GetMapping("/")
	public String execute(Model model) {
		TarefasDAO dao = new TarefasDAO();
		List<Tarefa> tarefas = dao.getLista();
		model.addAttribute("tarefas", tarefas);
		return "info";
	}
	
	@RequestMapping("criaTarefa")
	public String form(){
		return "formTarefa";
	}
	
	@RequestMapping("removeTarefa")
	public String remove(Tarefa tarefa) {
		TarefasDAO dao = new TarefasDAO();
		dao.remove(tarefa);
		return "info";
		}
}