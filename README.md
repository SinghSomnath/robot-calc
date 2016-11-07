# robot-calc
AndroidCalculator automation framework with Robotium lib .

Few settings to be done :

inside ant.properties
tested.project.dir=is the relative location of the android project to be tested .

inside project.properties
target=android version num

Tob Build the project, launch command prompt and go his folder "robot-calc" and type ant clean debug . It will create a  .apk file inside "bin" (eg. robot-calc.apk)
folder . 
go to bin folder 
type adb install robot-calc.apk  (It will install the automation as an app inside the opened android emulator) .

To run the automation through command prompt , type below

adb shell am instrument -w com.calculator.test/android.test.InstrumentationTestRunner

-----------------------------------------------------------------------------------------------------


to run with  custom made testRunner , type below

adb shell am instrument -w com.calculator.test/com.custom.android.junitreport.JUnitReportTestRunner


