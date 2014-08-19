
public class Examen1 {
	
	public static int personajes_creados;
	
	public class Personaje {

		protected int vida;
		protected int ataque;
		private int flechas;
		
		
		public Personaje(int vida, int ataque)
		{
			this.vida = vida;
			this.ataque = ataque;
			
		}
		
		public int getVida(){
			return vida;	

			}
		
		public int getAtaque(){
			return ataque;	

			}
		
		public void setVida(int vida){
			this.vida=vida;
		}
		
		public void setAtaque(int ataque){
			this.ataque=ataque;
		}
		
		public void PoderEspecial(){
			
		}

		public int getFlechas() {
			return flechas;
		}

		public void setFlechas(int flechas) {
			this.flechas = flechas;
		}

		public void poderEspecial()
		{
		
		}
		
	
	}
	
	public class Guerrero extends Personaje
	{

		public Guerrero(int vida, int ataque) {
			super(vida, ataque);
		}
	
		public void poderEspecial()
		{
			System.out.println(ataque*2 + vida/2);
		}
		
	}
	
	
	
	public class Arquero extends Personaje
	{

		public Arquero(int vida, int ataque, int flechas) {
			super(vida, ataque);
			this.setFlechas(flechas);
		}
		
		public void poderEspecial()
		{
			System.out.println(getFlechas()+5);
		}
	
	}
	
	
	public class Tanque extends Personaje
	{

		private boolean escudo_activo;

		public Tanque(int vida, int ataque, boolean escudo_activo)
		{
			super(vida, ataque);
			this.setEscudo_activo(escudo_activo);
		}

		public boolean isEscudo_activo() {
			return escudo_activo;
		}

		public void setEscudo_activo(boolean escudo_activo) {
			this.escudo_activo = escudo_activo;
		}
	
		public void poderEspecial()
		{
			System.out.println(escudo_activo=true);
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
	}

	
}
