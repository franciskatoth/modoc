package com.modoc.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/modoc/step_definitions",
        dryRun = false,
        tags = "@smoke",
        publish = true

        //"or"-> keyword "@librarian or @student"--> it will look for matching scenario tag(It will execute both of them)
        // "and": keyword - we are more specific
        //"and not": keyword-> can be used for excluding conditions
)



public class CukesRunner {
}
