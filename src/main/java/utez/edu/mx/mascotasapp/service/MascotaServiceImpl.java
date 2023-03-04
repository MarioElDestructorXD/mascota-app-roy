package utez.edu.mx.mascotasapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import utez.edu.mx.mascotasapp.model.Mascota;

@Service
public class MascotaServiceImpl implements IMascotaService{

	private List<Mascota> listaMascotas = null;
	
	@Override
	public List<Mascota> listarMascotas() {
		llenarLista();
		return listaMascotas;
	}
	
	public void llenarLista() {
		Mascota mascota1 = new Mascota((long) 1, "Perry", 10, "Es gris", "perro", "perro1.jpg", true);
		Mascota mascota2 = new Mascota((long) 2, "Rufus", 8, "Es negro", "perro", "perro2.jpg", true);
		Mascota mascota3 = new Mascota((long) 3, "Phanter", 6, "Es blanco", "perro", "perro4.jpg", false);
		Mascota mascota4 = new Mascota((long) 4, "Colmillo", 5, "Es cafe", "perro", "perro4.jpg", false);

		Mascota mascota5 = new Mascota((long) 1, "Bombon", 10, "Es dorado", "gato", "gato1.jpg", true);
		Mascota mascota6 = new Mascota((long) 2, "Copito", 10, "Es negro", "gato", "gato2.jpg", true);
		Mascota mascota7 = new Mascota((long) 3, "Canelo", 10, "Es negro", "gato", "gato3.jpg", false);
		Mascota mascota8 = new Mascota((long) 4, "Botitas", 10, "Es blanco", "gato", "gato4.jpg", false);

		listaMascotas.add(mascota1);
		listaMascotas.add(mascota2);
		listaMascotas.add(mascota3);
		listaMascotas.add(mascota4);
		listaMascotas.add(mascota5);
		listaMascotas.add(mascota6);
		listaMascotas.add(mascota7);
		listaMascotas.add(mascota8);
	}

}
