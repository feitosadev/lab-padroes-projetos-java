package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @author feitosadev
 *
 */
public class SingletonLazyHolder {

	private static class IstanceHolder{
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia(){
		return IstanceHolder.instancia;
	}
}
