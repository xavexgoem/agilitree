package org.cvtc.agilitree;

// this might cause issues if we need more than 1 DB
// this is accessed solely through DB.getInstance().whatever()
public class DB {
	private static DB instance = null;
	
	private DB() {
	}
	
	public static DB getInstance() {
		if (instance == null) {
			instance = new DB();
		}
		return instance;
	}
	
}
