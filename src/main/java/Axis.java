import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 * @author Dongqi Xue
 * @since 3/14/18.
 */
public class Axis {

  public static void main(String[] args) {
    Axis axis = new Axis();
    try {
      ClassLoader classLoader = axis.getClass().getClassLoader();
      Reader in = new FileReader(new File(classLoader.getResource("TSLA.csv").getFile()));
      Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);

      for (CSVRecord record : records) {
        String date = record.get("Date");
        System.out.print(date + ", ");
        String ma5 = record.get("MA5");
        System.out.println(ma5);
        break;
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
