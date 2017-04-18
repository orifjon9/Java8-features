package library.unitestvsexceptionhandling.example2.bugreporter;

import library.unitestvsexceptionhandling.example2.classfinder.ClassFinder;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.URL;
import java.util.List;
import java.util.logging.Logger;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "library.unitestvsexceptionhandling.example2.javapackage";
	private static final String REPORT_NAME = "library/unitestvsexceptionhandling/example2/bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	private static final String NEW_ROW = "\n";

	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);



		String text = "";

		for (Class<?> cls: classes) {
			if(cls.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport) cls.getAnnotation(BugReport.class);
				text+=(annotation.assignedTo() + NEW_ROW);
				text+=("\t" + CLASS_NAME + cls.getName() + NEW_ROW);
				text+=("\t" + REPORTED_BY + annotation.reportedBy() + NEW_ROW);
				text+=("\t" + DESCRIPTION + annotation.description() + NEW_ROW);
				text+=("\t" + SEVERITY + annotation.severity() + NEW_ROW);
			}
		}

		//file was write in this path "out\production\mpplab10\lab10\prob2"

		if(text.length() > 0 && saveTextToFile(text)) {
			System.out.println(text);

		}
	}

	private boolean saveTextToFile(String text){

		URL fileUrl = Thread.currentThread().getContextClassLoader().getResource(REPORT_NAME);

		if (fileUrl == null) {
			throw new IllegalArgumentException("File for write report was not found!");
		}

		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileUrl.getFile()))){

			for (String line: text.split(NEW_ROW)) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}

			return true;
		}catch (Exception ex){
			LOG.info(ex.getMessage());
			JOptionPane.showMessageDialog(null, ex.getMessage());

			return false;
		}
	}
}
