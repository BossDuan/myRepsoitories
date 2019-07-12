package duanjunyu.mspp;

import java.util.Collection;
import java.util.Map;

public class DJKUtil {
	
	public static void isTrue(boolean a,String message){
		if(!a){
			throw new RuntimeException(message);
		}
	}
	
	public static void isFalse(boolean a,String message){
		if(a){
			throw new RuntimeException(message);
		}
	}
	public static void isNotNull(Object a,String message){
		if(a==null){
			throw new RuntimeException(message);
		}
	}
	public static void isNull(Object a,String message){
		if(a!=null){
			throw new RuntimeException(message);
		}
	}
	public static void IsNotNullController(Collection<?> a ,String message){
		if(a==null || a.size()==0){
			throw new RuntimeException(message);
		}
	}
	public static void IsNotNullMap(Map<?,?> a ,String message){
		if(a==null || a.size()==0){
			throw new RuntimeException(message);
		}
	}
	public static void IsString(String a ,String message){
		if(a.trim().length()<=0 || a==null){
			throw new RuntimeException(message);
		}
	}
	public static void Iszheng(int a ,String message){
		if(a<=0){
			throw new RuntimeException(message);
		}
	}
}
