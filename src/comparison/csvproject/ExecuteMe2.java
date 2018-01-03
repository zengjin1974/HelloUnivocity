package comparison.csvproject;


import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.testng.annotations.Test;

import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

public class ExecuteMe2 {

    @Test
    public void uniVocityParsersTest_001() throws Exception {
        CsvParserSettings settings = new CsvParserSettings();
        settings.getFormat().setLineSeparator("\r\n");  // 改行コードは CR+LF
        settings.setHeaderExtractionEnabled(true);      // 1行目はヘッダ行としてスキップする

        CsvParser parser = new CsvParser(settings);

        try (
                BufferedReader br
                        = Files.newBufferedReader(Paths.get("C:/tmp/テストデータ.csv")
                        , Charset.forName("Windows-31J"));
        ) {
            List<String[]> allRows = parser.parseAll(br);
            allRows.stream().forEach(row -> System.out.println(Joiner.on(", ").join(row)));
        }
    }
}