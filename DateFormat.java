package PA6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormat {
	private static final String DATE_FORMAT_STYLE = "mm/dd/yyyy";
	public static final Date getFormattedDate(final String date) throws ParseException {
		return new SimpleDateFormat(DATE_FORMAT_STYLE).parse(date);
	}
	public static final Date getTodaysDate() throws ParseException {
		return new Date();
	}
}
