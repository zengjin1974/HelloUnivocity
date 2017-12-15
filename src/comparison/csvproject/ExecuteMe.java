package comparison.csvproject;

// URL: http://kameyatakefumi.hatenablog.com/entry/2017/03/08/132816

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

public class ExecuteMe {

    public static void main(String[] args) {
        ExecuteMe me = new ExecuteMe();
        me.comunivocity();
    }

    public void comunivocity() {

        BeanListProcessor<comparison.csvproject.com.univocity.Person> processor
                = new BeanListProcessor<>(comparison.csvproject.com.univocity.Person.class);

        CsvParserSettings parserSettings = new CsvParserSettings();
        parserSettings.setProcessor(processor);
        parserSettings.setHeaderExtractionEnabled(true);

        File file = new File(ClassLoader.getSystemResource("person.csv").getFile());

        CsvParser parser = new CsvParser(parserSettings);
        parser.parse(file, Charset.forName("Shift_JIS"));

        List<comparison.csvproject.com.univocity.Person> beans = processor.getBeans();
        for (comparison.csvproject.com.univocity.Person bean : beans) {
            System.out.println(bean.getName());
            System.out.println(bean.getSex());
        }
    }
}