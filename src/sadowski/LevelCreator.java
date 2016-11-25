package sadowski;

public class LevelCreator {
	public static Level createLevel(String type) {
		String typeLower = type.toUpperCase();
		switch (typeLower) {
        case ("INFO"):
            return new Level("INFO");
        case ("WARNING"):
        	return new Level("WARNING");
        case ("ERROR"):
        	return new Level("ERROR");
        default:
        	return new Level("INFO");
        }
	}
}