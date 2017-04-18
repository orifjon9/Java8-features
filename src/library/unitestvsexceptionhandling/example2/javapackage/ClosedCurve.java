package library.unitestvsexceptionhandling.example2.javapackage;

import library.unitestvsexceptionhandling.example2.bugreporter.BugReport;

@BugReport(assignedTo="Tom Jones", severity=1, reportedBy="Corazza")
public interface ClosedCurve {
	double computePerimeter();
}
