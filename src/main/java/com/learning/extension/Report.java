package com.learning.extension;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.io.File;
import java.lang.reflect.Method;

public class Report implements TestWatcher, BeforeAllCallback {
    private static ExtentReports suiteReport;
    private ExtentReports classReport;

    private ExtentReports createExtentReport(String reportName) {
        ExtentSparkReporter extentHtmlReporter = new ExtentSparkReporter(
                "/report".concat(File.separator).concat(reportName).concat(".html"));

        extentHtmlReporter.config().setTheme(Theme.DARK);
        extentHtmlReporter.config().setReportName(reportName);
        extentHtmlReporter.config().setDocumentTitle(reportName);

        ExtentReports report = new ExtentReports();
        report.attachReporter(extentHtmlReporter);
        return report;
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        Method method = context.getTestMethod().orElse(null);
        if(method != null) {
            ExtentTest classTestLogger = classReport.createTest(context.getDisplayName());
            classTestLogger.log(Status.PASS, "Working as expected.");
            classReport.flush();

            ExtentTest suiteTestLogger = suiteReport.createTest(context.getDisplayName());
            suiteTestLogger.log(Status.PASS, "Working as expected.");
            suiteReport.flush();
        }
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Method method = context.getTestMethod().orElse(null);
        if (method != null) {
            ExtentTest classTestLogger = classReport.createTest(context.getDisplayName());
            classTestLogger.log(Status.FAIL, cause.getMessage());
            classReport.flush();

            ExtentTest suiteTestLogger = suiteReport.createTest(context.getDisplayName());
            suiteTestLogger.log(Status.FAIL, cause.getMessage());
            suiteReport.flush();
        }
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        Method method = context.getTestMethod().orElse(null);
        if (method != null) {
            ExtentTest classTestLogger = classReport.createTest(context.getDisplayName());
            classTestLogger.log(Status.SKIP, cause.getMessage());
            classReport.flush();

            ExtentTest suiteTestLogger = suiteReport.createTest(context.getDisplayName());
            suiteTestLogger.log(Status.SKIP, cause.getMessage());
            suiteReport.flush();
        }
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        if (classReport == null) {
            classReport = createExtentReport(extensionContext.getTestClass().get().getSimpleName());
        }
        if (suiteReport == null) {
            suiteReport = createExtentReport("Suite");
        }
    }
}
