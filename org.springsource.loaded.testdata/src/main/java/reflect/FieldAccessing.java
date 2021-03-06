package reflect;

import java.lang.reflect.Field;

public class FieldAccessing {

	public int i = 4;

	public static int j = 5;

	Field fi = null;
	Field fj = null;

	public int geti() throws Exception {
		if (fi == null) {
			fi = FieldAccessing.class.getDeclaredField("i");
		}
		return fi.getInt(this);
	}

	public int getj() throws Exception {
		if (fj == null) {
			fj = FieldAccessing.class.getDeclaredField("j");
		}
		return fj.getInt(this);
	}
}
