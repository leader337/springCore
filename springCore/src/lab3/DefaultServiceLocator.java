package lab3;

public class DefaultServiceLocator {
	private static DefaultService defaultService;
	
	private DefaultServiceLocator(){
		
	}
	
	public DefaultService createInstance(){
		if(defaultService == null){
			synchronized(DefaultService.class){
				if(defaultService == null){
					defaultService = new DefaultService();
				}
			}
		}
		
		return defaultService;
	}
}
