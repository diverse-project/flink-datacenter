package flink.datacenter.csv.mappers;

import de.bytefish.jtinycsvparser.CsvParser;
import de.bytefish.jtinycsvparser.CsvParserOptions;
import de.bytefish.jtinycsvparser.tokenizer.StringSplitTokenizer;

public class TaskCSVParser {

	public static CsvParser<Task> TaskParser () {
		return new CsvParser<Task>(new CsvParserOptions(true, new StringSplitTokenizer(",", true)), new TaskMapper(() -> new Task ()));
	}
}
