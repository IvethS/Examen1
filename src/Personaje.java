
public class Personaje {

	protected int vida;
	protected int ataque;
	public static int personajes_creados;
	
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
