package logica;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class CelebridadePOP implements TipoPopularidade {
	private final int POPS = 25;
	
	
	// E preciso ver se a forma de ver se o post eh recente nao esta sebosa
	// Temos a opcao de ter um metodo dentro do post que faca essa verificacao
	@Override
	public void curtir(Post post) {
		int pontos = POPS;
		if (isActual(post.getData())) {
			pontos += 10;
		}
		post.curtir(pontos);
		
	}

	@Override
	public void descurtir(Post post) {
		int pontos = POPS;
		if (isActual(post.getData())) {
			pontos += 10;
		}
		post.descurtir(pontos);
		
	
		
	}
	
	
	private boolean isActual(LocalDateTime dataPost) {
		String data = dataPost.toString();
		String  dataAtual = LocalDate.now().toString();
		return data.contains(dataAtual);
	}
}
