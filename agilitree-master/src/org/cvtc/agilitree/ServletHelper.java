package org.cvtc.agilitree;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONObject;

public class ServletHelper {

	public static String ResultSetToJSON(ResultSet rs) throws SQLException {
		JSONArray json = new JSONArray();
		ResultSetMetaData metadata = rs.getMetaData();
		while(rs.next()) {
			int numColumns = metadata.getColumnCount();
			JSONObject jsonObj = new JSONObject();
			for(int i = 1; i <= numColumns; i++) {
				String columnName = metadata.getColumnLabel(i);
				jsonObj.put(columnName, rs.getObject(columnName));
			}
			json.put(jsonObj);
		}
		return json.toString();
	}
	
}
