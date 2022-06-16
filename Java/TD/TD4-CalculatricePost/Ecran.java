**
* @author Richefeu
* @version 0.1 : Date : Sat Jan 29 15:05:55 CET 2022
*
*/
public class Ecran {

	private boolean recouvrement;
	private UniteCentrale uc;
	private String buffer;

	public Ecran(){
		this.buffer="0";
		this.recouvrement = true;
	}

	public void traite(String s){
		if(this.recouvrement){
			uc.enregistrer(this.buffer);
			this.buffer = s;
			this.recouvrement = false;
		}else{
			this.buffer += s;
		}
	}

	public void setRecouvrement( boolean unB){
		this.recouvrement = unB;
	}

	public String getBuffer(){
		return this.buffer;
	}


	public void setBuffer(String s){
		this.buffer = s;
	}

	public void setUc(UniteCentrale uneUc){
		this.uc = uneUc;
	}



	@Override
	public String toString(){
		return this.buffer;
	}
}
