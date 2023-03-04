package utez.edu.mx.mascotasapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import utez.edu.mx.mascotasapp.model.Mascota;
import utez.edu.mx.mascotasapp.service.MascotaServiceImpl;

@Controller
@RequestMapping("mascotas")
public class MascotaController {
	@Autowired
	private MascotaServiceImpl mascotaService;
	
	@GetMapping("/listar")
	public String listarMascotas(Model model) {
		model.addAttribute("listarMascota", mascotaService.listarMascotas());
		return "index";
	}
	
	
	@GetMapping("/listar/{idTipoMascota}/{isAdopcion}")
	public String list(Model model, @PathVariable Long idTipoMascota, @PathVariable boolean isAdopcion) {
		List<Mascota> animales = new ArrayList<>();
		Mascota mascota1 = new Mascota((long) 1, "Perry", 10, "Es gris", "perro", "perro1.jpg", true);
		Mascota mascota2 = new Mascota((long) 2, "Rufus", 8, "Es negro", "perro", "perro2.jpg", true);
		Mascota mascota3 = new Mascota((long) 3, "Phanter", 6, "Es blanco", "perro", "perro4.jpg", false);
		Mascota mascota4 = new Mascota((long) 4, "Colmillo", 5, "Es cafe", "perro", "perro4.jpg", false);

		Mascota mascota5 = new Mascota((long) 1, "Bombon", 10, "Es dorado", "gato", "gato1.jpg", true);
		Mascota mascota6 = new Mascota((long) 2, "Copito", 10, "Es negro", "gato", "gato2.jpg", true);
		Mascota mascota7 = new Mascota((long) 3, "Canelo", 10, "Es negro", "gato", "gato3.jpg", false);
		Mascota mascota8 = new Mascota((long) 4, "Botitas", 10, "Es blanco", "gato", "gato4.jpg", false);

		animales.add(mascota1);
		animales.add(mascota2);
		animales.add(mascota3);
		animales.add(mascota4);
		animales.add(mascota5);
		animales.add(mascota6);
		animales.add(mascota7);
		animales.add(mascota8);
		
		if (idTipoMascota == 1) {
			animales.removeIf(animal -> animal.getTipoMascota().equals("gato"));
		} else if (idTipoMascota == 2) {
			animales.removeIf(animal -> animal.getTipoMascota().equals("perro"));
		}
		
		if (isAdopcion) {
			animales.removeIf(animal -> !animal.isDisponibleAdopcion());
		}
		model.addAttribute("animales", animales);
		return "index";
	}
}
