package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(//"src/test/resources/features//activities//CalendarEvents.feature // boyle yaparsak da test secmis oluruz
        features = "src/test/resources/features", // path to features
        glue="com/vytrack/step_definitions", // path to step definitions
        dryRun=true, // bu true olmasi durumunda butun kodlarin yazilip yazilmadigini kontrol ediyor
        // true olunca run edersek, yeni mehtodlar cikarabilir
        tags="@driver_with_data_table",// buraya @driver yazarsak, sadece driver yazdigimiz calisir
       // sadece bunun oldugu yer calisir// buraya yazdigimiz calisir
        // hic birsey yazmazsak, hepsi calisir
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }// bunu koyduk boylece report olusturdu
        // target a gidip, show in explorer yaparsan// default reports da bunlar var
)
public class CucumberRunner {
}
