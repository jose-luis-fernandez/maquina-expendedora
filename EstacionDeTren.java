
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionDeTren
{
	private MaquinaDeTiket maquina1;
	private MaquinaDeTiket maquina2;
	private int totalDinero;

	public EstacionDeTren()
	{
		maquina1 = new MaquinaDeTiket(300);
		maquina2 = new MaquinaDeTiket(200);
		totalDinero = 0;
  }
  
  public void imprimirTotalDinero()
	{
		totalDinero = maquina1.obtenerTotal();
		totalDinero = totalDinero + maquina2.obtenerTotal();
    System.out.println(totalDinero);
	}
	
 public void ventaBilletes()
 {
     maquina1.insertarDinero(500);
     maquina1.imprimirTiket();
     maquina2.insertarDinero(500);
     maquina2.imprimirTiket();
 }
}
