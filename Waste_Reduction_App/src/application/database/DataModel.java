package application.database;

public class DataModel {
	private static final DataModel instance = new DataModel();
	private ProjectDatabase db;
	
	private DataModel() {
		this.db = new ProjectDatabase();
	}

	public static DataModel getInstance() {
		return instance;
	}

}
